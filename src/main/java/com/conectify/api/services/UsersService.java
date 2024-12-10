package com.conectify.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conectify.api.model.User;
import com.conectify.api.repositories.UsersRepository;

@Service()
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public User saveUser(User user) {
        return usersRepository.save(user);
    }
}
