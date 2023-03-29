package core.bot.ebay.client;

import core.bot.ebay.model.EbaySearchResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class EbaySearchWebClient {

    WebClient webClient = WebClient.create("https://api.ebay.com/buy/browse/v1/item_summary/search?q=");


    public EbaySearchResponse searchItem(String item, String token){

        var response = webClient.get()
                .header("Authorization", token)
                .retrieve()
                .bodyToMono(EbaySearchResponse.class)
                .block();

        return response;
    }
}
