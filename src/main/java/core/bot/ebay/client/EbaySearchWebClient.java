package core.bot.ebay.client;

import core.bot.ebay.model.EbaySearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class EbaySearchWebClient {

    @Autowired
    WebClient webClient;

    @Value("${config.ebay-endpoint-core}")
    private String ebayUrl;

    @Value("${config.ebay-search}")
    private String ebaySearch;

    public EbaySearchResponse searchItem(String item, String token){

        var urlSearchEbay = UriComponentsBuilder.fromUriString(ebayUrl)
                .path(ebaySearch)
                .queryParam("q", item)
                .build()
                .toUriString();

        var response = webClient.get()
                .uri(urlSearchEbay, item)
                .header("Authorization", token)
                .retrieve()
                .bodyToMono(EbaySearchResponse.class)
                .block();

        return response;
    }
}
