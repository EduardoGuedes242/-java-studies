package org.example;

public class Pessoa {
  protected String nome;
  protected int idade;
  protected String sexo;
  protected int experiencia;

  protected void ganharXP(int qtdXP) {
    setExperiencia(getExperiencia() + qtdXP);
    System.out.println("A Pessoa: " + this.nome);
    System.out.println("Tem : " + this.experiencia + " Experiencia");
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
  }
}
