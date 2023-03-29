package core.bot.ebay.model;

import lombok.Data;

@Data
public class EbayAuthRequest {

    private String grant_type = "client_credentials";
    private String scope = "https%3A%2F%2Fapi.ebay.com%2Foauth%2Fapi_scope https:%3A%2F%2api.ebay.com%2oauth%2api_scope%2sell.account";
}
