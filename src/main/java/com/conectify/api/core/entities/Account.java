package com.conectify.api.core.entities;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.conectify.api.core.models.Contact;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(collection = "accounts")
@Data
@EqualsAndHashCode(callSuper = true)
public class Account extends BaseEntity {

    private String userId;

    private String accountName;

    private String photoUrl;

    private boolean AskPassword;

    private String password;

    private List<Contact> contacts;
}
