package com.conectify.api.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.conectify.api.enums.Provider;

import lombok.Data;

import java.time.Instant;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String name;

    private String lastName;

    private String password;

    @Indexed(unique = true)
    private String email;

    private Provider provider;

    @Indexed(unique = true, name = "provider_id")
    private String providerId;

    @Indexed(unique = true, name = "phone_number")
    private String phoneNumber;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;

    public User() {
    }

    public User(String name, String lastName, String email, Provider provider, String providerId,
            String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.provider = provider;
        this.providerId = providerId;
        this.phoneNumber = phoneNumber;
    }

    public User(String name, String lastName, String email,
            String phoneNumber, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.provider = Provider.CONECTIFY;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
