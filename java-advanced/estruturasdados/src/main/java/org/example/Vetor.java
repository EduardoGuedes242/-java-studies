package org.example;

import java.time.Duration;

public class Vetor {

  private String[] elementos;
  private int qtdRealVetor;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.qtdRealVetor = 0;
  }

  public int tamanhoVetor() {
    return  this.elementos.length;
  }


  //BY GUEDES
//  public void addItem(String elemento) {
//    for (int i = 0; qtdRealVetor < this.elementos.length; i++) {
//      if(this.elementos[i] == null) {
//        this.elementos[i] = elemento;
//        qtdRealVetor++;
//        break;
//      }
//    }
//  }

  //Aprendido
  public boolean addItem(String elemento) {
    if(this.qtdRealVetor < this.elementos.length) {
      this.elementos[this.qtdRealVetor] = elemento;
      this.qtdRealVetor ++;
      return true;
    } else {
      return false;
    }
 }


  public String getValorArray(int index) {
    return this.elementos[index];
  }

}
