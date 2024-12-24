package com.conectify.api.core.entities;

import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.conectify.api.core.models.Contact;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(collection = "groups")
@Data
@EqualsAndHashCode(callSuper = true)
public class Group extends BaseEntity{

    private String name;

    private String photoUrl;

    private String description;

    @Indexed(unique = true)
    private String chatId;

    private List<Contact> members;
}
