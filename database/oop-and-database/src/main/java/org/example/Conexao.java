package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
  private static final String url = "jdbc:postgresql:java";
  private static final String user = "postgres";
  private static final String password = "masterkey";

  public static Connection getConnection() {
    Connection conexao = null;
    try {
      Class.forName("org.postgresql.Driver");
      conexao = DriverManager.getConnection(url, user, password);

    } catch (ClassNotFoundException | SQLException e) {
      System.out.println("Erro ao conecar com banco de dados");
    }
    return conexao;
  }
}
