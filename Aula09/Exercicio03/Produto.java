package Aula09.Exercicio03;

public class Produto implements IProduto {
  private String nome;
  private float custo;

  public Produto(String nome, float custo) {
    this.nome = nome;
    this.custo = custo;
  }

  @Override
  public String getNome() {
    return this.nome;
  }

  @Override
  public float getCusto() {
    return this.custo;
  }
}
