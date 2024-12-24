package com.conectify.api.core.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Data
public class Message {

    private String accountId;

    private String contactName;

    private String chatId;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private String text;

    private boolean isRead;

    private boolean isDelivered;

    private boolean isSent;
}
