package com.eduardoguedes.mondodbcrud.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "endereco")
public class Endereco {

  @Id
  private String id;
  private String usuarioId;
  private String rua;
  private Long numero;
  private String bairro;
  private String complemento;
  private String cidade;
  private String cep;
}
