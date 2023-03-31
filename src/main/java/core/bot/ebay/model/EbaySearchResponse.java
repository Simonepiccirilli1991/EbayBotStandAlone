package core.bot.ebay.model;

import core.bot.ebay.model.fragment.ebay.ItemSummary;
import lombok.Data;

import java.util.List;

@Data
public class EbaySearchResponse {

    private String href;
    private int total;
    private String next;
    private int limit;
    private int offset;
    private List<ItemSummary> itemSummaries;
}
