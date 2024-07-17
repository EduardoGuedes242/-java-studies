package org.example;

import java.util.List;

public class Aula4 {
  public static void main(String[] args) {
    Vetor vetor = new Vetor(5);

    vetor.addItem("Elemento 1");
    vetor.addItem("Elemento 2");
    vetor.addItem("Elemento 3");

    System.out.println(vetor.getValorArrayExiste("Elemento 3"));
    System.out.println(vetor.getValorArrayExiste("Teste"));

  }
}
