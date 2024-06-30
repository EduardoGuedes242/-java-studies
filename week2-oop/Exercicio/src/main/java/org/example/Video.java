package org.example;

public class Video implements AcoesVideo{
  String titulo;
  String avalicao;
  int views;
  int curtidas;
  boolean reproduzindo;

  public Video(String titulo) {
    setTitulo(titulo);
    setAvalicao("Indefinida");
    setViews(0);
    setCurtidas(0);
    setReproduzindo(false);
  }

  public void detalhes() {
    System.out.println("Este video foi reproduzido: " + getViews());
  }

  @Override
  public void play() {
    if(isReproduzindo()) {
      System.out.println("Erro - video ja esta em reproducao");
    } else {
      System.out.println("Sucesso - video reproduzindo");
      setReproduzindo(true);
    }
  }

  @Override
  public void pause() {
    if(reproduzindo) {
      System.out.println("Sucesso - video pausado");
      setReproduzindo(false);
    } else {
      System.out.println("Erro - O video nao esta reproduzindo");
    }
  }

  @Override
  public void like() {
    setCurtidas(getCurtidas() + 1);
  }

  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAvalicao() {
    return avalicao;
  }
  public void setAvalicao(String avalicao) {
    this.avalicao = avalicao;
  }

  public int getViews() {
    return views;
  }
  public void setViews(int views) {
    this.views = views;
  }

  public int getCurtidas() {
    return curtidas;
  }
  public void setCurtidas(int curtidas) {
    this.curtidas = curtidas;
  }

  public boolean isReproduzindo() {
    return reproduzindo;
  }
  public void setReproduzindo(boolean reproduzindo) {
    this.reproduzindo = reproduzindo;
  }
}
