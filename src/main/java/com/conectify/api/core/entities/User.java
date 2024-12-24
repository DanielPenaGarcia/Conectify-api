package com.conectify.api.core.entities;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.conectify.api.core.enums.Provider;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(collection = "users")
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private String names;

    private String lastNames;

    @Indexed(unique = true)
    private String phone;
    
    @Indexed(unique = true)
    private String email;

    private Provider provider;

    @Indexed(unique = true)
    private String providerId;

}
