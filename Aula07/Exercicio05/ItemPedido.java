package Aula07.Exercicio05;

public class ItemPedido {
  private int quantidade;
  private Produto produto;

  public ItemPedido(int quantidade, Produto produto) {
    this.quantidade = quantidade;
    this.produto = produto;
  }

  public int get_quantidade() {
    return this.quantidade;
  }

  public Produto get_produto() {
    return this.produto;
  }
}
