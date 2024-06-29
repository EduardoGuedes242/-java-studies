package org.example;

public class Colaboradores extends Pessoa{
  private double salario;
  private boolean emAtividade;


  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }

  public boolean isEmAtividade() {
    return emAtividade;
  }
  public void setEmAtividade(boolean emAtividade) {
    this.emAtividade = emAtividade;
  }

  public void entrarFerias() {
    setEmAtividade(false);
  }
  public void voltarFerias() {
    setEmAtividade(true);
  }
}
