package com.conectify.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import lombok.Data;

@Data
public class UserAccount {

    @Id
    private String id;

    private String userId;

    @Indexed(unique = true)
    private String username;

    private String profilePictureUrl;

    private Boolean askPassword;

    private String password;

    public UserAccount() {
    }

    public UserAccount(String userId, String username, String profilePictureUrl, String password, Boolean askPassword) {
        this.userId = userId;
        this.username = username;
        this.profilePictureUrl = profilePictureUrl;
        this.password = password;
        this.askPassword = askPassword;
    }
}
