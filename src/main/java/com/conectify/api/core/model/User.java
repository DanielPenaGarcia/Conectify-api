package com.conectify.api.core.model;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.conectify.api.core.enums.Provider;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "users")
public class User extends BaseEntity{

    @Indexed(name = "full_name")
    private String fullName;

    @Indexed(name = "born_date")
    private LocalDate bornDate;

    @Indexed(name = "email", unique = true)
    private String email;

    @Indexed(name = "phone_number", unique = true)
    private String phoneNumber;

    @Indexed(name = "provider")
    private Provider provider;

    @Indexed(name = "provider_id")
    private String providerId;

    public User() {}

    public User(String fullName, LocalDate bornDate, String email, String phoneNumber, Provider provider, String providerId) {
        this.fullName = fullName;
        this.bornDate = bornDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.provider = provider;
        this.providerId = providerId;
    }
}
