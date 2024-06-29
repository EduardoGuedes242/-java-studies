package org.example;

public class Livro implements Publicacao {
  private String titulo;
  private String autor;
  private int totalPaginas;
  private int paginaAtual;
  private boolean aberto;
  private Pessoa leitor;

  public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
    setTitulo(titulo);
    setAutor(autor);
    setTotalPaginas(totalPaginas);
    setLeitor(leitor);
    setAberto(false);
    setPaginaAtual(0);
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

  public void detalhes() {
    System.out.println("=====DETALHES=====");
    System.out.println("Aberto: " + isAberto());
    System.out.println("Leitor: " + this.leitor.getNome());
    System.out.println("Pagina atual: " + getPaginaAtual());
    System.out.println("Total de paginas: " + getTotalPaginas());
  }

  @Override
  public void abrir() {
    if (isAberto()) {
      System.out.println("Este livro ja esta aberto");
    } else {
      setAberto(true);
      System.out.println("Livro aberto com sucesso");
    }
  }

  @Override
  public void fechar() {
    if (!isAberto()) {
      System.out.println("Este livro ja esta fechado");
    } else {
      setAberto(false);
      System.out.println("Livro fechado com sucesso");
    }
  }

  @Override
  public void folhear(int page) {
      for (int i = 0; i < page; i++) {
        avancarPagina();
      }
  }

  @Override
  public void avancarPagina() {
    if(isAberto()) {
      if(getPaginaAtual() != getTotalPaginas()){
        setPaginaAtual(getPaginaAtual() + 1);
        System.out.println("Voce avançou para pagina: " + getPaginaAtual());
      } else {
        System.out.println("Essa é a ultima pagina");
      }
    } else {
      System.out.println("O livro esta fechado");
    }
  }

  @Override
  public void voltarPagina() {
    if(isAberto()) {
      if(getPaginaAtual() != 0){
        setPaginaAtual(getPaginaAtual() - 1);
        System.out.println("Voce voltou para pagina: " + getPaginaAtual());
      } else {
        System.out.println("Essa é a primeira pagina");
      }
    } else {
      System.out.println("O livro esta fechado");
    }
  }
}
