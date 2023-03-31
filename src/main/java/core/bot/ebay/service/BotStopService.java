package core.bot.ebay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BotStopService {

    @Autowired
    private BotService botService;

    public void stop() throws Exception {
        botService.stop();
    }

}
