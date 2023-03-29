package core.bot.ebay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class BotStopService implements CommandLineRunner {

    @Autowired
    private BotService botService;

    @Override
    public void run(String... args) throws Exception {
        botService.stop();
    }

}
