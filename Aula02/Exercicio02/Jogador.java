package Aula02.Exercicio02;

public class Jogador {
  private String nome;
  private int idade;
  private double altura;

  public Jogador(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public String RetornarNome() {
    return this.nome;
  }

  public double RetornarAltura() {
    return this.altura;
  }

  public int RetornarIdade() {
    return this.idade;
  }
}
