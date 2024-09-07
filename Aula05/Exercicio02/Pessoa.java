package Aula05.Exercicio02;

public class Pessoa {
  private String nome;
  private int idade;

  @SuppressWarnings("unused")
  private int diaNascimento;
  @SuppressWarnings("unused")
  private int mesNascimento;
  private int anoNascimento;

  private Universidade universidade;

  public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento, Universidade universidade) {
    this.nome = nome;

    this.diaNascimento = diaNascimento;
    this.mesNascimento = mesNascimento;
    this.anoNascimento = anoNascimento;

    this.universidade = universidade;
  }

  public int CalcularIdade() {
    this.idade = 2024 - this.anoNascimento;
    return this.idade;
  }

  public String getNome() {
    return this.nome;
  }

  public int getIdade() {
    return this.CalcularIdade();
  }

  public String getUniversidade() {
    return this.universidade.getNome();
  }
}
