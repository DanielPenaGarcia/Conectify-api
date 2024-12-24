package com.conectify.api.controllers.models.requests;

import org.bson.types.ObjectId;

import lombok.Data;

@Data
public class CreateAccountDTO {

    private String userId;

    private String accountName;

    private String photoUrl;

    private boolean AskPassword;

    private String password;
}
