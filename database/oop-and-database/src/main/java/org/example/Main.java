package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    UserDAO userDAO = new UserDAO();

    System.out.println("O QUE DESEJA BUSCAR:");
    System.out.println("1 - Usuario");
    System.out.println("2 - Cliente");

    if(scanner.nextInt() == 1) {
      List<User> listaUser = userDAO.getAllUsers();

      for (User user : listaUser) {
        System.out.println("Usuario: " + user.getName());
      }
    } else  {
      System.out.println("Funcao nao implementada");
    }

  }
}