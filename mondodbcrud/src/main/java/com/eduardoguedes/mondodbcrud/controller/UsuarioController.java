package com.eduardoguedes.mondodbcrud.controller;

import com.eduardoguedes.mondodbcrud.entity.User;
import com.eduardoguedes.mondodbcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsuarioController {

  @Autowired
  private UserRepository userRepository;

  @PostMapping("/create")
  public User create(@RequestBody User user) {
    return userRepository.save(user);
  }

  @GetMapping("/list")
  public List<User> getAllProdutos() {
    return userRepository.findAll();
  }

}
