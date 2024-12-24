package com.conectify.api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conectify.api.controllers.models.requests.CreateUserDTO;
import com.conectify.api.core.entities.User;
import com.conectify.api.services.UserService;

@Controller
@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("v1/users")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDTO user) {
        User userEntity = modelMapper.map(user, User.class);
        return ResponseEntity.ok(userService.createUser(userEntity));
    }
}
