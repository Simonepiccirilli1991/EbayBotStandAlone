package core.bot.ebay.service;

import core.bot.ebay.client.EbaySearchWebClient;
import core.bot.ebay.model.EbaySearchResponse;
import core.bot.ebay.model.fragment.ebay.ItemSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchItemService {

    Logger logger = LoggerFactory.getLogger(SearchItemService.class);
    @Autowired
    EbaySearchWebClient ebaySearchWebClient;

    List<String> ricerche = List.of("set allenatore fuoriclasse ", "ebt set allenatore ");
    List<String> espnasioni = List.of("evoluzioni eteree", "gran festa", "zenit regale", "astri lucenti");


    public List<ItemSummary> searchItem(String authorization) {

        logger.info("searchItem starting");
        List<ItemSummary> response = new ArrayList<>();

        for (String ricerca : ricerche) {
            for (String espansione : espnasioni) {

                try {
                    var riceraEbay = ricerca + espansione;

                    var ebayResp = ebaySearchWebClient.searchItem(riceraEbay, authorization);

                        if(!response.isEmpty())
                            mapResponse(response, ebayResp);
                        else
                            response.addAll(ebayResp.getItemSummaries());

                } catch (Exception e) {e.printStackTrace();
                }
            }
        }
        logger.info("searchItem ended");
        return response;
    }

    private void mapResponse(List<ItemSummary> response, EbaySearchResponse ebayResp) {

        logger.info("mapResponse started");
        // prendo listaId oggetti gia presenti
        var itemAlreadyPresent = response.stream().map(item -> item.getItemId()).toList();

        // mi ciclo la lista, se l'oggetto è già presente lo rimuovo dalla lista di ebay
        for(var itemPresent : itemAlreadyPresent){
            //lambda che mi rimuove l'oggetto dalla lista di ebay
           var toRemove = ebayResp.getItemSummaries().stream().filter(item -> item.getItemId().equals(itemPresent)).findAny();
            if(toRemove.isPresent())
                ebayResp.getItemSummaries().remove(toRemove.get());

        }
        // aggiungo gli oggetti rimasti alla response
        if(!ebayResp.getItemSummaries().isEmpty())
            response.addAll(ebayResp.getItemSummaries());
        logger.info("mapResponse ended");
    }
}