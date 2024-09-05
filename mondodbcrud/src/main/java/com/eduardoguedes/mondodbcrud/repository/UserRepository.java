package com.eduardoguedes.mondodbcrud.repository;

import com.eduardoguedes.mondodbcrud.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
