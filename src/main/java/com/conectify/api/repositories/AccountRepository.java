package com.conectify.api.repositories;

import java.util.Collection;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.conectify.api.core.entities.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, ObjectId> {

    Collection<Account> findByUserId(String userId);
}
