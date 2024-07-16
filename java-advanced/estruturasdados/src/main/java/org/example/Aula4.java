package org.example;

public class Aula4 {
  public static void main(String[] args) {
    Vetor vetor = new Vetor(5);

    System.out.println(vetor.getTamanho());
    vetor.addItem("Elemento 1");
    vetor.addItem("Elemento 2");
    vetor.addItem("Elemento 3");
    System.out.println(vetor.getTamanho());

    System.out.println(vetor.toString());

  }
}
