package com.krotos.fishingcontest2.service;

import com.krotos.fishingcontest2.service.mail.EmailService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class EmailServiceImplTest {

    @Autowired
    EmailService emailService;


    @Test
    public void sendEmail() {
        String recipientEmail = "krotos4test@gmail.com";
        String subject = "Subject: test 1";
        String some_content = "Some content";

        Assert.assertTrue(emailService.sendEmail(recipientEmail, subject, some_content));
    }

}
