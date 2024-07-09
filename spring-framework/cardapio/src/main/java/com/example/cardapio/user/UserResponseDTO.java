package com.example.cardapio.user;

public record UserResponseDTO(Long id, String name, String email) {

  public UserResponseDTO(User user) {
    this(user.getId(), user.getName(), user.getEmail());
  }

}
