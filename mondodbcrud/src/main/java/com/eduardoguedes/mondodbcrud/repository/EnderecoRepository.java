package com.eduardoguedes.mondodbcrud.repository;

import com.eduardoguedes.mondodbcrud.entity.Endereco;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnderecoRepository extends MongoRepository<Endereco, String> {
}
