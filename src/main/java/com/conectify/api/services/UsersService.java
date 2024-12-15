package com.conectify.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conectify.api.dtos.requests.CreateConectifyUserRequestDTO;
import com.conectify.api.model.User;
import com.conectify.api.repositories.UsersRepository;

@Service()
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public User createUser(CreateConectifyUserRequestDTO requestDTO) {
        User user = new User(
                requestDTO.getName(),
                requestDTO.getLastName(),
                requestDTO.getEmail(),
                requestDTO.getPhone(),
                requestDTO.getPassword());
        return usersRepository.save(user);
    }

}
