package Aula06.Exercicio03;

import java.util.ArrayList;

public class Cliente {
  private String nome;
  private ArrayList<Pedido> pedidos;

  public Cliente(String nome) {
    this.nome = nome;
    this.pedidos = new ArrayList<Pedido>();
  }

  public String get_nome() {
    return this.nome;
  }

  public void adicionar_pedido(Pedido pedido) {
    this.pedidos.add(pedido);
  }

  public ArrayList<Pedido> listar_pedidos() {
    return this.pedidos;
  }
}
