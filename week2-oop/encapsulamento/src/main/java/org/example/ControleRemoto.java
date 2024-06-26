package org.example;

public class ControleRemoto implements Controlador {
  private boolean ligado;
  private boolean tocando;
  private int volume;

  public ControleRemoto(){
    this.ligado = false;
    this.tocando = false;
    this.volume = 50;
  }

  public int getVolume() {
    return volume;
  }
  public void setVolume(int volume) {
    this.volume = volume;
  }

  public boolean isLigado() {
    return ligado;
  }
  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public boolean isTocando() {
    return tocando;
  }
  public void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  @Override
  public void ligar() {
    setLigado(true);
  }

  @Override
  public void desligar() {
    setLigado(false);
  }

  @Override
  public void play() {
    if (!isTocando()) {
      setTocando(true);
      System.out.println("EQUIPAMENTO TOCANDO");
    } else {
      System.out.println("EQUIPAMENTO JA ESTA TOCANDO");
    }
  }

  @Override
  public void pause() {
    if (isTocando()) {
      setTocando(false);
      System.out.println("EQUIPAMENTO PAUSADO");
    } else {
      System.out.println("EQUIPAMENTO JA ESTA PAUSADO");
    }
  }
}
