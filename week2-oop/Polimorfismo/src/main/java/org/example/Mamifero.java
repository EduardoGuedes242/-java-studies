package org.example;

public class Mamifero extends Animal {

  @Override
  public void movimentar() {
    System.out.println("Movimentando");
  }

  @Override
  public void comer() {
    System.out.println("Comendo Animal");
  }
}
