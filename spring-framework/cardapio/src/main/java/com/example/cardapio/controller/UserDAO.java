package com.example.cardapio.controller;

import com.example.cardapio.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
  public List<User> getAllUsers() {
    List<User> users = new ArrayList<>();
    String sql = "select * from java$user";
    try(Connection conexao = Conexao.getConnection();
        ResultSet resultUser = conexao.createStatement().executeQuery(sql)) {
      while (resultUser.next()) {
        String name = resultUser.getString("usr_name");
        String email = resultUser.getString("usr_email");
        String password = resultUser.getString("usr_password");

        users.add(new User(name, email, password));
      }
    } catch (SQLException e) {
      System.out.println("Erro ao buscar usuarios: " + e.getMessage());
    }
    return users;
  }
}
