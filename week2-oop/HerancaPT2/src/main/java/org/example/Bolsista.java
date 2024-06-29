package org.example;

public class Bolsista extends Aluno{
  private double bolsa;

  public void renovarBolsa() {
  }

  @Override
  public void pagarMensalidade() {
    System.out.println("sobre escrita");
  }

  public double getBolsa() {
    return bolsa;
  }
  public void setBolsa(double bolsa) {
    this.bolsa = bolsa;
  }
}
