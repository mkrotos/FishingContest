package com.krotos.fishingcontest2.controller;

import com.krotos.fishingcontest2.model.Mail;
import com.krotos.fishingcontest2.service.mail.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {

    @Autowired
    EmailService emailService;

    @RequestMapping("/mail")
    public ModelAndView getEmailForm(ModelAndView model){
        Mail mail=new Mail();
        model.setViewName("mailForm");
        model.addObject("mail",mail);
        return model;
    }

    @RequestMapping(value = "/mail",method = RequestMethod.POST)
    public ModelAndView sendEmail(@ModelAttribute Mail mail){
        String recipientEmail="krotos4test@gmail.com";

        emailService.sendEmail(recipientEmail,mail.getSubject(),mail.getContent());
        return new ModelAndView("redirect:/");
    }
}
