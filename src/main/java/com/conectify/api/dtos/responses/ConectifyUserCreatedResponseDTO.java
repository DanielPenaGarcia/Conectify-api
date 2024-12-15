package com.conectify.api.dtos.responses;

import java.time.Instant;

import com.conectify.api.enums.Provider;

import lombok.Data;

@Data
public class ConectifyUserCreatedResponseDTO {

    private String id;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Provider provider;
    private Instant createdAt;
    private Instant updatedAt;
}
