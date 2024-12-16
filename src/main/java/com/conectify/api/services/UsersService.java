package com.conectify.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.conectify.api.dtos.requests.CreateConectifyUserRequestDTO;
import com.conectify.api.model.User;
import com.conectify.api.repositories.UsersRepository;

@Service()
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(CreateConectifyUserRequestDTO requestDTO) {
        String passwordEncoded = passwordEncoder.encode(requestDTO.getPassword());
        User user = new User(
                requestDTO.getName(),
                requestDTO.getLastName(),
                requestDTO.getEmail(),
                requestDTO.getPhone(),
                passwordEncoded);
        return usersRepository.save(user);
    }

}
