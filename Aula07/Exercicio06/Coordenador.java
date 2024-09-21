package Aula07.Exercicio06;

public class Coordenador {
  private int codigo_coordenador;
  private String nome;

  public Coordenador(int codigo_coordenador, String nome) {
    this.codigo_coordenador = codigo_coordenador;
    this.nome = nome;
  }

  public void set_codigo_coordenador(int codigo_coordenador) {
    this.codigo_coordenador = codigo_coordenador;
  }

  public void set_nome(String nome) {
    this.nome = nome;
  }

  public int get_codigo_coordenador() {
    return this.codigo_coordenador;
  }

  public String get_nome() {
    return this.nome;
  }
}
