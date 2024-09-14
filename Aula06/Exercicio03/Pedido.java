package Aula06.Exercicio03;

import java.util.ArrayList;

public class Pedido {
  private CarrinhoDeCompras pedidos;

  public Pedido(CarrinhoDeCompras pedidos) {
    this.pedidos = pedidos;
  }

  public ArrayList<Produto> get_pedidos() {
    return this.pedidos.listar_produtos();
  }

  public Float calcular_total() {
    Float total = (float) 0;

    for (Produto produto : this.get_pedidos()) {
      total += produto.get_preco();
    }

    return total;
  }
}
