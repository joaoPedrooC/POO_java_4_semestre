package Aula07.Exercicio06;

public class Professor {
  private int matricula;
  private String nome;

  public Professor(int matricula, String nome) {
    this.matricula = matricula;
    this.nome = nome;
  }

  public String get_nome() {
    return this.nome;
  }

  public int get_matricula() {
    return this.matricula;
  }

  public void set_matricula(int matricula) {
    this.matricula = matricula;
  }

  public void set_nome(String nome) {
    this.nome = nome;
  }
}
