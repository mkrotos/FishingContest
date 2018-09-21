package com.krotos.fishingcontest2.service;

import com.krotos.fishingcontest2.service.mail.EmailServiceImpl2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmailServiceImpl2Test {

    EmailServiceImpl2 emailService;

    @Before
    public void beforeAll() {
        emailService = new EmailServiceImpl2();
    }

    @Test
    public void sendEmail() {
        String recipientEmail = "krotos4test@gmail.com";
        String subject = "Subject: test 2";
        String some_content = "Some content";

        Assert.assertTrue(emailService.sendEmail(recipientEmail, subject, some_content));
    }
}
