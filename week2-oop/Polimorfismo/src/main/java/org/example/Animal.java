package org.example;

public abstract class Animal implements AcoesAnimal {
  String especie;
  double peso;

  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public double getPeso() {
    return peso;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }
}
