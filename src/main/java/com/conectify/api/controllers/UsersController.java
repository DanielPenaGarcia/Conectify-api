package com.conectify.api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conectify.api.dtos.requests.CreateConectifyUserRequestDTO;
import com.conectify.api.dtos.responses.ConectifyUserCreatedResponseDTO;
import com.conectify.api.model.User;
import com.conectify.api.services.UsersService;

//Enable cors from all origins
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping()
    public ResponseEntity<ConectifyUserCreatedResponseDTO> createUser(
            @RequestBody CreateConectifyUserRequestDTO requestDTO) {
        User userCreated = usersService.createUser(requestDTO);
        ConectifyUserCreatedResponseDTO responseDTO = modelMapper.map(userCreated,
                ConectifyUserCreatedResponseDTO.class);
        return ResponseEntity.ok(responseDTO);
    }

}
