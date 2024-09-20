package Aula07.Exercicio05;

public class Produto {
  private int codigo;
  private float valor;
  private String descricao;

  public Produto(int codigo, float valor, String descricao) {
    this.codigo = codigo;
    this.valor = valor;
    this.descricao = descricao;
  }

  public int get_codigo() {
    return this.codigo;
  }

  public float get_valor() {
    return this.valor;
  }

  public String get_descricao() {
    return this.descricao;
  }
}
