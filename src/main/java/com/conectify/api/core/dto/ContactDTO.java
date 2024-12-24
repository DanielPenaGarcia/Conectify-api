package com.conectify.api.core.dto;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;

import lombok.Data;

@Data
public class ContactDTO {

    @Indexed(name = "account_id")
    private ObjectId accountId;

    @Indexed(name = "contact_name")
    private String contactName;

    @Indexed(name = "photo_url")
    private String photoUrl;
}
