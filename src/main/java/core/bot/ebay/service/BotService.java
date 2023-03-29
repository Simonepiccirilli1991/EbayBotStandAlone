package core.bot.ebay.service;

import core.bot.ebay.client.EbayAuthWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class BotService implements ApplicationRunner {

    @Autowired
    private EbayAuthWebClient ebayAuthWebClient;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
