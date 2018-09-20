package com.krotos.fishingcontest2.service.mail;

public interface EmailService {

    public boolean sendEmail(String recipientEmail, String subject, String content);
}
