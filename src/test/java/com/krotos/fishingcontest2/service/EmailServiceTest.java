package com.krotos.fishingcontest2.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EmailServiceTest {

    EmailService emailService;

    @Before
    public void beforeAll() {
        emailService = new EmailService();
    }

    @Test
    public void sendEmail() {
        String recipientEmail = "makropl14@gmail.com";
        String subject = "Subject: test 1";
        String some_content = "Some content";

        Assert.assertTrue(emailService.sendEmail(recipientEmail, subject, some_content));
    }

}
