package com.conectify.api.controllers.models.requests;

import com.conectify.api.core.enums.Provider;

import lombok.Data;

@Data
public class CreateUserDTO {

    private String names;

    private String lastNames;

    private String phone;
    
    private String email;

    private Provider provider;

    private String providerId;
}
