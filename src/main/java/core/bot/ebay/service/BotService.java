package core.bot.ebay.service;

import core.bot.ebay.client.EbayAuthWebClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.time.LocalDateTime;

@Service
@EnableScheduling
public class BotService {

    @Autowired
    EbayAuthWebClient ebayAuthWebClient;
    @Autowired
    SearchItemService searchItemService;
    @Autowired
    FilterItemService filterItemService;
    @Autowired
    SendMailService sendMailService;
    @Autowired
    ConfigurableApplicationContext applicationContext;

    private Boolean isRunning = true;
    private Boolean requestAuth = false;
    //schedulatura per il metodo run in modo che runni fisso ogni tot minuti
    private String authorization;
    private LocalDateTime authTime;

    Logger logger = LoggerFactory.getLogger(BotService.class);

    @Scheduled(fixedDelay = 10000)
    public void run() throws Exception {

        // prima controllo se il bot e gia in esecuzione per stoppare
        if(!isRunning){
            logger.info("is runnig has been setted to false, bot is stopping");
            System.out.println("stopping bot");
            applicationContext.close();
        }
        // controllo se ho bisogno di fare una nuova richiesta di autorizzazione, dura 2 ore, faccio una richiesta ogni 115 minuti
        if(!ObjectUtils.isEmpty(authTime) && authTime.isAfter(authTime.plusMinutes(115))) {
            logger.info("authorization expired, requesting new authorization. StartTime Auth: {}", authTime);
            requestAuth = true;
        }
        // stacco authorization
        if(ObjectUtils.isEmpty(authorization) || requestAuth) {
            logger.info("authorization is null or requestAuth is true, requesting new authorization");
            try {
                authorization = ebayAuthWebClient.getAuthorization();
            } catch (Exception e) {
               logger.error("error while requesting authorization, error: {}", e.getMessage());
               return;
               // ritorno diretto in modo da non stoppare il bot
            }
            authTime = LocalDateTime.now();
        }
        // cerco oggetti, i doppioni sono gia filtrati, devo solo filtrare per cio che mi interessa
        var possibleItems = searchItemService.searchItem( authorization);

        // filtro gli oggetti
        var filteredItems = filterItemService.filterItem(possibleItems);

        // controllo se oggeti hanno superato filtro, se si invio mail
        if(!filteredItems.isEmpty())
            sendMailService.sendMail(filteredItems);

    }

    public void stop() throws Exception {
        isRunning = false;
        logger.info("is runnig has been setted to false, bot is stopping");
    }

}
