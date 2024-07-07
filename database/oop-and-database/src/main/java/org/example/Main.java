package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    UserDAO userDAO = new UserDAO();

    System.out.println("O QUE DESEJA FAZER:");
    System.out.println("1 - Buscar Usuarios");
    System.out.println("2 - Cadastrar Usuarios");
    System.out.println("2 - Alterar usuarios");
    System.out.println("3 - Deletar usuarios");
    int opcao =  scanner.nextInt();

    if(opcao == 1) {
      List<User> listaUser = userDAO.getAllUsers();

      for (User user : listaUser) {
        System.out.println("Usuario: " + user.getName());
      }
    } else if (opcao == 2) {
      String name, email, phone, password;
      System.out.println("Vamos Cadastrar o novo Usuario");
      System.out.print("Nome: ");
      name = scanner.next();
      System.out.print("Email: ");
      email = scanner.next();
      System.out.print("Phone: ");
      phone = scanner.next();
      System.out.print("Password: ");
      password = scanner.next();

      userDAO.insertUser(name, email, phone, password);
    } else if(opcao == 3)  {
      String newName, oldName;

      System.out.print("Qual usuario deseja alterar: ");
      oldName = scanner.next();
      System.out.print("Qual novo nome: ");
      newName = scanner.next();

      userDAO.updateNameUser(newName, oldName);
    } else if(opcao == 4) {
      userDAO.deleteAll();
    }
    else  {
      System.out.println("Funcao nao implementada");
    }

  }
}