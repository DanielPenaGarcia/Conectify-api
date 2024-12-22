package com.conectify.api.core.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.conectify.api.core.dto.MemberDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Document(collection = "chats")
public class Chat extends BaseEntity {

    private String name;

    @Indexed(name = "photo_url")
    private String photoUrl;

    @Indexed(name = "account_id")
    private ObjectId accountId;

    @Indexed(name = "is_group")
    private Boolean isGroup;

    private List<MemberDTO> members;
}
