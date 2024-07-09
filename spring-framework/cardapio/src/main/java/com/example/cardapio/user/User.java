package com.example.cardapio.user;

import jakarta.persistence.*;

@Table(name = "java$users")
@Entity(name = "java$users")
public class User {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;

  public User() {}

  public User(UserRequestDTO data) {
    this.name = data.name();
    this.email = data.email();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
