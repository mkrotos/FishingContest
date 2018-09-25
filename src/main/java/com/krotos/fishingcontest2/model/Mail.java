package com.krotos.fishingcontest2.model;

import lombok.Data;

@Data
public class Mail {

    private String recipientEmail;
    private String subject;
    private String content;

}
