package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("-***-***-***-DADOS DE VIDEO-***-***-***-");
    Video video1 = new Video("Polimorfismo");
    Gafanhoto gafanhotoEduardo = new Gafanhoto("Eduardo", 0,"guedes");
    Gafanhoto gafanhotoGuedes = new Gafanhoto("Eduardo", 0,"guedes");

    video1.detalhes();

    gafanhotoGuedes.viuMaisUm(video1);
    gafanhotoEduardo.viuMaisUm(video1);
    gafanhotoEduardo.viuMaisUm(video1);

    video1.detalhes();




  }
}