package core.bot.ebay.client;

import core.bot.ebay.model.EbaySearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class EbaySearchWebClient {

    @Autowired
    WebClient webClient;


    public EbaySearchResponse searchItem(String item, String token){

        var response = webClient.get()
                .uri("https://api.ebay.com/buy/browse/v1/item_summary/search?q=" + item)
                .header("Authorization", token)
                .retrieve()
                .bodyToMono(EbaySearchResponse.class)
                .block();

        return response;
    }
}
