package org.example;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vetor {

  private String[] elementos;
  private int tamanho;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.tamanho = 0;
  }

  public int getTamanho() {
    return  this.tamanho;
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
    if(this.tamanho < this.elementos.length) {
      this.elementos[this.tamanho] = elemento;
      this.tamanho++;
      return true;
    } else {
      return false;
    }
 }


  public String getValorArray(int index)  {
    if(!(index >= 0 && index <= tamanho)) {
      throw new RuntimeException("Valor do indice inexistente");
    }
    return this.elementos[index];
  }

  public boolean getValorArrayExiste(String elemento) {
    for (int i = 0; i < this.tamanho; i++) {
      if(elemento.equals(elementos[i])  ) {
       return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    String[] newLista = new String[this.tamanho];

    for (int i = 0; i < this.tamanho; i++) {
      if(this.elementos[i] != null) {
        newLista[i] = this.elementos[i];
      }
    }

    return Arrays.toString(newLista);
  }

}
