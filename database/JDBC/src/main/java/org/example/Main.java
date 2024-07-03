package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<User> listUser = new ArrayList<>();

    try {
      listUser = fetchUsersFromDatabase();
    } catch (SQLException | ClassNotFoundException e) {
      System.out.println("Erro ao buscar usuários do banco de dados: " + e.getMessage());
    }

    listUser.forEach(user -> {
      System.out.println("Name: " + user.getName() + " - Email: " + user.getEmail() + " - Password: " + user.getPassword());
    });
  }

  private static List<User> fetchUsersFromDatabase() throws SQLException, ClassNotFoundException {
    List<User> users = new ArrayList<>();
    String url = "jdbc:postgresql:ekl-agenda";
    String user = "postgres";
    String password = "masterkey";

    Class.forName("org.postgresql.Driver");

    try (Connection conexao = DriverManager.getConnection(url, user, password);
         Statement stmt = conexao.createStatement();
         ResultSet resultUser = stmt.executeQuery("SELECT * FROM ekl$user")) {

      while (resultUser.next()) {
        users.add(new User(
                resultUser.getString("usr_name"),
                resultUser.getString("usr_email"),
                resultUser.getString("usr_password")));
      }
    }
    return users;
  }

  public static class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
      this.name = name;
      this.email = email;
      this.password = password;
    }

    public String getName() {
      return name;
    }

    public String getEmail() {
      return email;
    }

    public String getPassword() {
      return password;
    }
  }
}
