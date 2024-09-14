package Aula06.Exercicio03;

public class Produto {
  private String nome;
  private Float preco;
  private int estoque;

  public Produto(String nome, Float preco, int estoque) {
    this.nome = nome;
    this.preco = preco;
    this.estoque = estoque;
  }

  public String get_nome() {
    return this.nome;
  }

  public Float get_preco() {
    return this.preco;
  }

  public int get_estoque() {
    return this.estoque;
  }
}
