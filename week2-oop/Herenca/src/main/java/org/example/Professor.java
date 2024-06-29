package org.example;

public class Professor extends Colaboradores {
  private String tipoContrato;
  private String curso;

  public Professor(String tipoContrato, String curso, String nome, double salario) {
    setTipoContrato(tipoContrato);
    setNome(nome);
    setCurso(curso);
    setSalario(salario);
    setIdade(15);
  }

  public String getTipoContrato() {
    return tipoContrato;
  }
  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public String getCurso() {
    return curso;
  }
  public void setCurso(String curso) {
    this.curso = curso;
  }

  public void apresentacao() {
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Salario: " + getSalario());
    System.out.println("Contrao: " + getTipoContrato());
  }
}
