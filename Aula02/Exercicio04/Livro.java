package Aula02.Exercicio04;

public class Livro {
  private String titulo;
  private int qtdPaginas;
  private int paginasLidas;

  public Livro() {} // ?

  public Livro(String titulo, int qtdPaginas) {
    this.titulo = titulo;
    this.qtdPaginas = qtdPaginas;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public int getQtdPaginas() {
    return this.qtdPaginas;
  }

  public int getPaginasLidas() {
    return this.paginasLidas;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
    System.out.println("Titulo alterado!");
  }

  public void setQtdPaginas(int qtdPaginas) {
    this.qtdPaginas = qtdPaginas;
    System.out.println("Quantidade de páginas alterada!");
  }

  public void setPaginasLidas(int paginasLidas) {
    this.paginasLidas = paginasLidas;
  }

  public float verificarProgresso() {
    float porcentagem = (this.getPaginasLidas()*100)/this.getQtdPaginas();

    return porcentagem;
  }
}
