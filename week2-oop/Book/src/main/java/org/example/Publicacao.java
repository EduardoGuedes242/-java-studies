package org.example;

public interface Publicacao {
  public abstract void abrir();
  public abstract void fechar();
  public abstract void folhear(int page);
  public abstract void avancarPagina();
  public abstract void voltarPagina();
}
