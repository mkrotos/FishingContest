package com.krotos.fishingcontest2.service;

import com.krotos.fishingcontest2.config.ComponentScanConfig;
import com.krotos.fishingcontest2.service.mail.EmailService;
import com.krotos.fishingcontest2.service.mail.EmailServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ComponentScanConfig.class})
public class EmailServiceImplTest {

    @Autowired
    EmailServiceImpl emailServiceImpl;


    @Test
    public void sendEmail() {
        String recipientEmail = "krotos4test@gmail.com";
        String subject = "Subject: test 1";
        String some_content = "Some content";

        Assert.assertTrue(emailServiceImpl.sendEmail(recipientEmail, subject, some_content));
    }

}
