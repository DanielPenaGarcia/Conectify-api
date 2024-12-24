package com.conectify.api.core.models;

import lombok.Data;

@Data
public class Contact {

    private String accountId;

    private String name;

    private String phone;

    private String photoUrl;

    private String chatId;
}
