package core.bot.ebay.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class EbaySearchWebClient {

    WebClient webClient = WebClient.create("https://api.ebay.com/buy/browse/v1/item_summary/search?q=");


    public
}
