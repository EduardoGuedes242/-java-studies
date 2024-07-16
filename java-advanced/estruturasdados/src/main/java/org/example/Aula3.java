package org.example;

public class Aula3 {
  public static void main(String[] args) {
    Vetor vetor = new Vetor(50000);

    for (int i = 0; i < 50000; i++) {
      vetor.addItem("Teste: " + i);

    }

//    for (int i = 0; i < vetor.tamanhoVetor(); i++) {
//      System.out.println("Item na lista: " + vetor.getValorArray(i));
//    }

  }
}
