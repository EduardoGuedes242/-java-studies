package org.example;

import java.util.Random;

public class Luta {
  private Lutador desafiante;
  private Lutador desafiado;
  private int rounds;
  private boolean active;

  Random random = new Random();

  public Luta(Lutador desafiante, Lutador desafiado) {
    setDesafiante(desafiante);
    setDesafiado(desafiado);
    setRounds(0);
    setActive(false);
  }

  public Lutador getDesafiante() {
    return desafiante;
  }
  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public Lutador getDesafiado() {
    return desafiado;
  }
  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

  public int getRounds() {
    return rounds;
  }
  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean isActive() {
    return active;
  }
  public void setActive(boolean active) {
    this.active = active;
  }

  public void marcarLuta() {
    if(desafiado.getCategoria().equals(desafiante.getCategoria())){
        if(desafiado.getNome() != desafiante.getNome()) {
          System.out.println("Luta marcada com sucesso");
          setActive(true);
        } else {
          System.out.println("Favor selecionar lutadores diferentes");
        }
    } else {
      System.out.println("Os Lutadores nao pode ser de categorias diferentes");
    }
  }

  public void lutar(int rounds) {
    if(isActive()) {
      int roundGanhadosDesafiante = 0;
      int roundGanhadosDesafiado = 0;
      for (int i = 0; i < rounds; i++) {

        if (random.nextInt(2) == 1) {
          roundGanhadosDesafiado = roundGanhadosDesafiado + 1;
          System.out.println(String.format("Vencedor round %s: Desafiado", i));
        } else {
          roundGanhadosDesafiante = roundGanhadosDesafiante + 1;
          System.out.println(String.format("Vencedor round %s: Desafiante", i));
        }

      }

      if(roundGanhadosDesafiado == roundGanhadosDesafiante){
        desafiado.empatarLuta();
        desafiante.empatarLuta();
        System.out.println("===EMPATE===");
      } else if(roundGanhadosDesafiado > roundGanhadosDesafiante) {
        desafiado.ganharLuta();
        desafiante.perderLuta();
        System.out.println("===DESAFIADO GANHOU===");
      } else {
        desafiante.ganharLuta();
        desafiado.perderLuta();
        System.out.println("===DESAFIANTE GANHOU===");
      }

    } else {
      System.out.println("Esta Luta ainda nao esta aprovadaa");
    }
  }
}
