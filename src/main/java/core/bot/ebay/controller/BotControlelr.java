package core.bot.ebay.controller;

import core.bot.ebay.service.BotStopService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotControlelr  {

    @Autowired
    BotStopService botStopService;

    @PostMapping("/stop")
    public void stopBot() throws Exception {
        botStopService.stop();
    }

}
