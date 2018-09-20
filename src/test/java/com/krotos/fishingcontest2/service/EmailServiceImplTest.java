package com.krotos.fishingcontest2.service;

import com.krotos.fishingcontest2.service.mail.EmailServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EmailServiceImplTest {

    EmailServiceImpl emailServiceImpl;

    @Before
    public void beforeAll() {
        emailServiceImpl = new EmailServiceImpl();
    }

    @Test
    public void sendEmail() {
        String recipientEmail = "krotos4test@gmail.com";
        String subject = "Subject: test 1";
        String some_content = "Some content";

        Assert.assertTrue(emailServiceImpl.sendEmail(recipientEmail, subject, some_content));
    }

}
