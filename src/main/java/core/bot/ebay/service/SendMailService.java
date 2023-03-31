package core.bot.ebay.service;

import core.bot.ebay.model.EbaySearchResponse;
import core.bot.ebay.model.fragment.ebay.ItemSummary;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class SendMailService {

    @Autowired
    JavaMailSender javaMailSender;
    @Value("${config.mail}")
    private String mail;
    public void sendMail(List<ItemSummary> items) throws MessagingException {

        if(ObjectUtils.isEmpty(items) || items.isEmpty())
            return;

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(mail);
        msg.setText("Ebay bot Pokemon, link email riepilogo oggetti interessanti");
        msg.setText("-----------------------items above -------------------------)");

        for (var item : items) {
            msg.setText("Titolo item: " + item.getTitle());
            msg.setText("Prezzo item: " + item.getPrice().getValue());
            msg.setText("link item: " + item.getItemHref());
            msg.setText("<br> <br/>");

        }
        //mando mail unica con tutto cio che c'era in lista
        try {
            javaMailSender.send(msg);

        } catch (Exception e) {
            System.out.println("errore invio mail");
        }

    }
}
