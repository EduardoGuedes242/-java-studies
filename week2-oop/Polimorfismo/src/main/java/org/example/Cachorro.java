package org.example;

public class Cachorro extends Mamifero{
  @Override
  public void movimentar() {
    System.out.println("Andar do cachorro");
  }

  public void movimentar(boolean perigo) {
    if(perigo) {
      System.out.println("Correndo em perigo");
    } else {
      System.out.println("Andando em Paz");
    }
  }

}
