package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("VAMOS CRIAR UM PROFESSOR");
    Scanner scanner = new Scanner(System.in);

    Professor professorMat = new Professor("CLT", "Matematica", "Silas", scanner.nextDouble());
    professorMat.apresentacao();
    professorMat.fazerAniversario();
    professorMat.fazerAniversario();
    professorMat.fazerAniversario();
    professorMat.apresentacao();

  }
}