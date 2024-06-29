package org.example;

public class Tecnico extends Pessoa{
  private String registroProfissional;

  public void praticar(){
    System.out.println("Estou praticando");
  }

  public String getRegistroProfissional() {
    return registroProfissional;
  }
  public void setRegistroProfissional(String registroProfissional) {
    this.registroProfissional = registroProfissional;
  }


}
