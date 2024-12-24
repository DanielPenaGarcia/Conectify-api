package com.conectify.api.core.dto;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;

import lombok.Data;

@Data
public class MemberDTO {

    @Indexed(name = "account_id")
    private ObjectId accountId;

    private String name;

    @Indexed(name = "photo_url")
    private String photoUrl;

    @Indexed(name = "is_admin")
    private boolean isAdmin;
}
