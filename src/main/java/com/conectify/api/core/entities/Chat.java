package com.conectify.api.core.entities;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.conectify.api.core.models.Message;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(collection = "chats")
@Data
@EqualsAndHashCode(callSuper = true)
public class Chat extends BaseEntity {

    private List<Message> messages;

    //Resources
}
