package com.krotos.fishingcontest2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@PropertySource("mail.properties")
public class MailConfig {


    public Properties getProperties() {
        Properties properties = new Properties();
        System.out.println("+++++");
        properties.put("mail.smtp.auth", mailSmtpAuth);
        properties.put("mail.smtp.starttls.enable", mailSmtpStarttlsEnable);
        properties.put("mail.smtp.host", mailSmtpHost);
        properties.put("mail.smtp.port", mailSmtpPort);
        properties.put("mail.smtp.ssl.trust", mailSmtpSslTrust);
        System.out.println("++++"+properties.stringPropertyNames());
        return properties;
    }

    public  String getMailEmailFrom() {
        return mailEmailFrom;
    }

    public  String getUsername() {
        return username;
    }

    public  String getPassword() {
        return password;
    }

    @Value("${mail.smtp.auth}")
    public  String mailSmtpAuth;

    @Value("${mail.smtp.starttls.enable}")
    public  String mailSmtpStarttlsEnable;

    @Value("${mail.smtp.host}")
    public  String mailSmtpHost;

    @Value("${mail.smtp.port}")
    public  String mailSmtpPort;

    @Value("${mail.smtp.ssl.trust}")
    public  String mailSmtpSslTrust;

    @Value("${mailEmailFrom}")
    public  String mailEmailFrom;

    @Value("${username}")
    public  String username;

    @Value("${password}")
    public  String password;
}
