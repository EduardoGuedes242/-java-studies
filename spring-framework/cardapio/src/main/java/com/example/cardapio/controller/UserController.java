package com.example.cardapio.controller;

import com.example.cardapio.user.User;
import com.example.cardapio.user.UserRequestDTO;
import com.example.cardapio.user.UserResponseDTO;
import com.example.cardapio.user.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  private UserRespository userRespository;
  @GetMapping
  public List<UserResponseDTO> getAll() {
    List<UserResponseDTO> userList = userRespository.findAll().stream().map(UserResponseDTO::new).toList();
    return userList;
  }

  @PostMapping
  public void insertUser(@RequestBody UserRequestDTO data) {
    User userData = new User(data);
    userRespository.save(userData);
  }

}
