package core.bot.ebay.service;

import core.bot.ebay.model.EbaySearchResponse;
import core.bot.ebay.model.fragment.ebay.ItemSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilterItemService {

    Logger logger = LoggerFactory.getLogger(FilterItemService.class);
    public List<ItemSummary> filterItem(List<ItemSummary> items){

        logger.info("filterItem starting");

        List<ItemSummary> response = new ArrayList<>();

        if(ObjectUtils.isEmpty(items) || items.isEmpty()){
            logger.info("no item to filter, return empty list");
            return response;
        }

        var filteredItem = items.stream()
                .filter(item -> item.getCondition().equals("New"))
                .filter(item -> item.getItemLocation().getCountry().equals("ITALY"))
                .filter(item -> Double.parseDouble(item.getPrice().getValue()) < 60)
                .toList();

        response.addAll(filteredItem);

        logger.info("filterItem ended");
        return response;
    }
}
