package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

  public void insertUser(String name, String email, String phone, String password) {
    String sqlInsert =
                    " INSERT INTO public.java$user(" +
                    " usr_name, usr_email," +
                    " usr_phone,usr_password," +
                    " usr_active) VALUES (?, ?, ?, ?, true);";

    try(Connection conexao = Conexao.getConnection();
        PreparedStatement pstmt = conexao.prepareStatement(sqlInsert)
    ) {
      pstmt.setString(1, name);
      pstmt.setString(2, email);
      pstmt.setString(3, phone);
      pstmt.setString(4, password);

      pstmt.executeUpdate();
    } catch(SQLException e){
      System.out.println("Erro ao inserir usuario: " + e.getMessage());
    }
  }

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
      System.out.println("Erro ao buscar usuarios: " + e.getMessage());
    }
    return users;
  }

  public void updateNameUser(String newName, String oldName) {
    String sqlUpade = "UPDATE java$user SET usr_name = ? where usr_name = ?";
    try(Connection conexao = Conexao.getConnection();
        PreparedStatement prmst = conexao.prepareStatement(sqlUpade)) {
      System.out.println(newName + " - " + oldName);
      prmst.setString(1, newName);
      prmst.setString(2, oldName);
      prmst.executeUpdate();
      System.out.println("Usuario alterado com sucesso");
    } catch (SQLException e) {
      System.out.println("Ocorreu um erro ao atualizar usuario: " + e.getMessage());
    }
  }

}
