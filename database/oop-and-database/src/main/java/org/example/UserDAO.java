package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

  public void insertUser() {}

  public List<User> getAllUsers() {
    List<User> users = new ArrayList<>();
    try (Connection conexao = Conexao.getConnection();
         ResultSet resultUsers = conexao.createStatement().executeQuery("SELECT * FROM JAVA$USER")
    )
    {
      while (resultUsers.next()) {
        String name = resultUsers.getString("usr_name");
        String email = resultUsers.getString("usr_email");
        String phone = resultUsers.getString("usr_phone");
        String password = resultUsers.getString("usr_password");

        users.add(new User(name, email, phone, password));
      }
    } catch (SQLException e) {
      System.out.println("Erro ao buscar usuarios: " + e.getMessage());;
    }
    return users;
  }

}
