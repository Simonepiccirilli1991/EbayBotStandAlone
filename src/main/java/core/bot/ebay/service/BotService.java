package core.bot.ebay.service;

import core.bot.ebay.client.EbayAuthWebClient;
import core.bot.ebay.client.EbaySearchWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class BotService {

    //NOTE: implementatiamo applicationRUnner in modo da poter usare il metodo run che fa partire il service senza bisogno di invocarlo
    @Autowired
    private EbayAuthWebClient ebayAuthWebClient;
    @Autowired
    EbaySearchWebClient ebaySearchWebClient;
    @Autowired
    ConfigurableApplicationContext applicationContext;

    private Boolean isRunning = true;
    //schedulatura per il metodo run in modo che runni fisso ogni tot minuti

    @Scheduled(fixedDelay = 10000)
    public void run() throws Exception {

        if(!isRunning){
            System.out.println("stop");
            applicationContext.close();
        }

        String authorization = ebayAuthWebClient.getAuthorization();

        var possibleItems = ebaySearchWebClient.searchItem("iphone", authorization);
        //TODO: filtrare i risultati  e mandare poi per mail

    }

    public void stop() throws Exception {
        isRunning = false;
    }

}
