package com.conectify.api.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.conectify.api.core.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {}
