package org.example;

public class Gafanhoto extends Pessoa{
  private String login;
  private int totalAssistido;

  public Gafanhoto(String nome, int idade, String login) {
    setNome(nome);
    setIdade(idade);
    setLogin(login);
  }

  public void viuMaisUm(Video video) {
    setTotalAssistido(getTotalAssistido() + 1);
    video.setViews(video.getViews() + 1);
    ganharXP(10);
  }

  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  public int getTotalAssistido() {
    return totalAssistido;
  }
  public void setTotalAssistido(int totalAssistido) {
    this.totalAssistido = totalAssistido;
  }
}
