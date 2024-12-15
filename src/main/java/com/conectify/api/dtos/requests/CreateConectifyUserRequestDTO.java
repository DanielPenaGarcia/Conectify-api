package com.conectify.api.dtos.requests;

import lombok.Data;

@Data
public class CreateConectifyUserRequestDTO {

    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String password;
}
