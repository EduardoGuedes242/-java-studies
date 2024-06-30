package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Criando Cachorro");

    Cachorro bob = new Cachorro();

    bob.movimentar();
    bob.movimentar(true);
    bob.movimentar(false);
  }
}