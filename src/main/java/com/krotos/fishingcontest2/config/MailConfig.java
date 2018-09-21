package com.krotos.fishingcontest2.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


import java.util.Properties;

@Component
@PropertySource("mail.properties")
public class MailConfig {

    public Properties getProperties() {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", mailSmtpAuth);
        properties.put("mail.smtp.starttls.enable", mailSmtpStarttlsEnable);
        properties.put("mail.smtp.host", mailSmtpHost);
        properties.put("mail.smtp.port", mailSmtpPort);
        properties.put("mail.smtp.ssl.trust", mailSmtpSslTrust);
        return properties;
    }

    public String getMailEmailFrom() {
        return mailEmailFrom;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Value("${mail.smtp.auth}")
    private String mailSmtpAuth;

    @Value("${mail.smtp.starttls.enable}")
    private String mailSmtpStarttlsEnable;

    @Value("${mail.smtp.host}")
    private String mailSmtpHost;

    @Value("${mail.smtp.port}")
    private String mailSmtpPort;

    @Value("${mail.smtp.ssl.trust}")
    private String mailSmtpSslTrust;

    @Value("${mail.emailFrom}")
    private String mailEmailFrom;

    @Value("${mail.username}")
    private String username;

    @Value("${mail.password}")
    private String password;
}

