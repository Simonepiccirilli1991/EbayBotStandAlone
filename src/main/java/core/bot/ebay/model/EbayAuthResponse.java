package core.bot.ebay.model;

import lombok.Data;

@Data
public class EbayAuthResponse {

    private String access_token;
    private String token_type;
    private long expires_in;
}
