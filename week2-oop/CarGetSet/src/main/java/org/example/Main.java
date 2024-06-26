package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Vamos adicionar um novo produto");

    //Creating new object with Contructor
    Product productOn = new Product("Verificar");

    productOn.setName("Abacaxi");
    System.out.println(productOn.getName());
  }

}