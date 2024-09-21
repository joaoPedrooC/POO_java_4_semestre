package Aula07.Exercicio06;

public class Aluno {
  private int ra;
  private String nome;

  public Aluno(int ra, String nome) {
    this.ra = ra;
    this.nome = nome;
  }

  public void set_ra(int ra) {
    this.ra = ra;
  }

  public void set_nome(String nome) {
    this.nome = nome;
  }

  public int get_ra() {
    return this.ra;
  }

  public String get_nome() {
    return this.nome;
  }
}
