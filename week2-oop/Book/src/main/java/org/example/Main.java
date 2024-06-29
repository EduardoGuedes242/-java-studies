package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("");

    Pessoa[] pessoas = new Pessoa[2];
    pessoas[0] = new Pessoa("Bruno", 22, "M");
    pessoas[1] = new Pessoa("Marina", 21, "F");

    Livro[] livros = new Livro[3];
    livros[0] = new Livro("Aprendendo java", "G.G", 32, pessoas[0]);
    livros[1] = new Livro("Engenharia de Software", "A.V", 100, pessoas[0]);
    livros[2] = new Livro("A volta dos que nao foram", "L.L", 341, pessoas[1]);

    livros[0].abrir();
    livros[0].folhear(33);
    livros[0].detalhes();
    livros[0].voltarPagina();
    livros[0].detalhes();


  }
}