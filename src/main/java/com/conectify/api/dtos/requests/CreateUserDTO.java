package com.conectify.api.dtos.requests;

public class CreateUserDTO {
    
    private String username;

    public CreateUserDTO() {
    }

    public CreateUserDTO(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
