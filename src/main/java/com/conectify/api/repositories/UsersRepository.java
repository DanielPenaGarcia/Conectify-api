package com.conectify.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.conectify.api.model.User;

@Repository()
public interface UsersRepository extends MongoRepository<User, String> {}
