package core.bot.ebay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication
public class EbayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbayApplication.class, args);
	}

}
