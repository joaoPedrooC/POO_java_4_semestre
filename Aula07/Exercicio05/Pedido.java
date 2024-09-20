package Aula07.Exercicio05;

import java.util.ArrayList;

public class Pedido {
  private float valor_total;
  ArrayList<ItemPedido> itens_pedidos;

  public Pedido() {
    this.itens_pedidos = new ArrayList<ItemPedido>();
    this.valor_total = 0;
  }

  public void adicionar_item(ItemPedido item_pedido) {
    this.itens_pedidos.add(item_pedido);
  }

  public float obter_total() {
    for (ItemPedido itemPedido : this.itens_pedidos) {
      this.valor_total += itemPedido.get_quantidade() * itemPedido.get_produto().get_valor();
    }

    return this.valor_total;
  }

  public ArrayList<ItemPedido> get_itens_pedidos() {
    return this.itens_pedidos;
  }
}
