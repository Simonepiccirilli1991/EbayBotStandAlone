package core.bot.ebay.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.bot.ebay.client.EbaySearchWebClient;
import core.bot.ebay.model.EbaySearchResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class SearchItemTest {

    @Autowired
    SearchItemService searchItemService;
    @Autowired
    FilterItemService filterItemService;
    @MockBean
    EbaySearchWebClient ebaySearchWebClient;

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testSearchAndFilterServiceOK() throws Exception {

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        EbaySearchResponse ebayResp = mapper.readValue(new String(Files.readAllBytes(Paths.get("src/test/resources/EbaySerch.json"))), EbaySearchResponse.class);

        when(ebaySearchWebClient.searchItem(any(), any())).thenReturn(ebayResp);

        var searchResult = searchItemService.searchItem( "it");

        var filterResult = filterItemService.filterItem(searchResult);

        assert filterResult.stream().filter(item -> item.getItemId().equals("v1|1**********1|0")).findAny().isPresent();
    }
}
