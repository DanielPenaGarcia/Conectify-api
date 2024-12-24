package com.conectify.api.core.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.conectify.api.core.dto.ContactDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "accounts")
public class Account extends BaseEntity {

    @Indexed(name = "account_name")
    private String accountName;

    private String password;

    @Indexed(name = "ask_password")
    private Boolean askPassword;

    @Indexed(name = "photo_url")
    private String photoUrl;

    private List<ContactDTO> contacts;

    @Indexed(name = "user_id")
    private ObjectId userId;
}
