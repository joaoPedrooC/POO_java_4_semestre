package Aula06.Exercicio03;

import java.util.ArrayList;

public class CarrinhoDeCompras {
  private ArrayList<Produto> produtos;

  public CarrinhoDeCompras() {
    this.produtos = new ArrayList<Produto>();
  }

  public void adicionar_produto(Produto produto) {
    this.produtos.add(produto);
  }

  public void remover_produto(int indexProduto) {
    this.produtos.remove(indexProduto);
  }

  public ArrayList<Produto> listar_produtos() {
    return this.produtos;
  }
}
