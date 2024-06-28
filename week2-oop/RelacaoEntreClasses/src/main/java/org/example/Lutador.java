package org.example;

class Lutador {
  private String nome;
  private String nacionalidade;
  private int idade;
  private double altura;
  private double peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;

  public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
    setNome(nome);
    setNacionalidade(nacionalidade);
    setIdade(idade);
    setAltura(altura);
    setPeso(peso);
    setVitorias(vitorias);
    setDerrotas(derrotas);
    setEmpates(empates);
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getAltura() {
    return altura;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return peso;
  }
  public void setPeso(double peso) {
    this.peso = peso;
    setCategoria();
  }

  public String getCategoria() {
    return categoria;
  }
  public void setCategoria() {
    if (this.peso <= 50.2) {
      this.categoria = "Invalido";
    } else if(this.peso <= 70.3) {
      this.categoria = "Leve";
    } else if (this.peso <= 83.9) {
      this.categoria = "Medio";
    } else if (this.peso <= 120.2){
      this.categoria = "Pesado";
    } else {
      this.categoria = "Invalido";
    }

  }

  public int getVitorias() {
    return vitorias;
  }
  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public int getDerrotas() {
    return derrotas;
  }
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getEmpates() {
    return empates;
  }
  public void setEmpates(int empates) {
    this.empates = empates;
  }

  public void aprensar() {
    System.out.println("Lutador: " + getNome());
  }

  public void status() {
    System.out.println("Status do Lutador: " + getNome());
  }

  public void ganharLuta() {
    setVitorias(getVitorias() + 1);
  }

  public void perderLuta(){
    setDerrotas(getDerrotas() + 1);
  }

  public void empatarLuta() {
    setEmpates(getEmpates() + 1);
  }

}
