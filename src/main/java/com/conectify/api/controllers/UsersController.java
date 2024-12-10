package com.conectify.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conectify.api.dtos.requests.CreateUserDTO;
import com.conectify.api.model.User;
import com.conectify.api.services.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDTO createUserDTO) {
        User user = new User(createUserDTO.getUsername());
        return ResponseEntity.ok(usersService.saveUser(user));
    }
}
