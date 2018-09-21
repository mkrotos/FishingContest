package com.krotos.fishingcontest2.service.mail;

import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


@Service("emailService2")
public class EmailServiceImpl2 implements EmailService {

    private final String mailSmtpAuth = "true";
    private final String mailSmtpHost = "smtp.gmail.com";
    private final int mailSmtpPort = 587;
    private final String mailSmtpStarttlsEnable = "true";
    private String mailEmailFrom = "mail";
    private String username = "uss";
    private String password = "pass";


    public boolean sendEmail(String recipientEmail, String subject, String content) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", mailSmtpAuth);
        props.put("mail.smtp.starttls.enable", mailSmtpStarttlsEnable);
        props.put("mail.smtp.host", mailSmtpHost);
        props.put("mail.smtp.port", mailSmtpPort);
        props.put("mail.smtp.ssl.trust", mailSmtpHost);

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailEmailFrom));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(subject);
            message.setText(content);

            Transport.send(message);
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return false;
    }


}
