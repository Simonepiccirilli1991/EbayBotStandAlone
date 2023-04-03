package core.bot.ebay.client;

import core.bot.ebay.model.EbayAuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Component
public class EbayAuthWebClient {

    @Autowired
    WebClient webClient;

    private String clientId = "XXXXX";
    private String clientSecret = "XXXXX";
    public String getAuthorization(){

        String auth = encodeCredentials(clientId, clientSecret);

        var response = webClient.post()
                .uri("https://api.ebay.com/identity/v1/oauth2/token")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Authorization", "Basic " + auth)
                .retrieve()
                .bodyToMono(EbayAuthResponse.class)
                .block();

        return response.getAccess_token();

    }
    // devo encorade cosi la stringa se no ebay si incazza
    public static String encodeCredentials(String clientId, String clientSecret) {
        String credentials = clientId + ":" + clientSecret;
        byte[] credentialsBytes = credentials.getBytes(StandardCharsets.UTF_8);
        byte[] encodedBytes = Base64.getEncoder().encode(credentialsBytes);
        return new String(encodedBytes, StandardCharsets.UTF_8);
    }
}
