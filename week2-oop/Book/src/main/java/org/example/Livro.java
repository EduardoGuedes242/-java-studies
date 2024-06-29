package org.example;

public class Livro implements Publicacao {
  private String titulo;
  private String autor;
  private int totalPaginas;
  private int paginaAtual;
  private boolean aberto;
  private Pessoa leitor;

  public Livro(String titulo, String autor, int totalPaginas) {
    setTitulo(titulo);
    setAutor(autor);
    setTotalPaginas(totalPaginas);
  }

  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotalPaginas() {
    return totalPaginas;
  }
  public void setTotalPaginas(int totalPaginas) {
    this.totalPaginas = totalPaginas;
  }

  public int getPaginaAtual() {
    return paginaAtual;
  }
  public void setPaginaAtual(int paginaAtual) {
    this.paginaAtual = paginaAtual;
  }

  public boolean isAberto() {
    return aberto;
  }
  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public Pessoa getLeitor() {
    return leitor;
  }
  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  @Override
  public void abrir() {
    
  }

  @Override
  public void fechar() {

  }

  @Override
  public void folhear() {

  }

  @Override
  public void avancarPagina() {

  }

  @Override
  public void voltarPagina() {

  }
}
