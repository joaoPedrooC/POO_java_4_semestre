package Aula07.Exercicio05;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pedido pedido = new Pedido();

    while (true) {
      System.out.println("1.Adicionar Produto\n2.Listar Produtos\n3.Consultar Total\n4.Finalizar pedido");
      int op = scanner.nextInt();
      scanner.nextLine();

      if (op == 1) {
        System.out.println("Informe o codigo do produto: ");
        int codigo = scanner.nextInt();
        System.out.println("Informe o valor do produto: ");
        float valor = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Informe a descricao do produto: ");
        String descricao = scanner.nextLine();
        
        System.out.println("Informe a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Produto produto = new Produto(codigo, valor, descricao);
        ItemPedido item_pedido = new ItemPedido(quantidade, produto);

        pedido.adicionar_item(item_pedido);
      } else if(op == 2) {
        for (ItemPedido item_pedido : pedido.get_itens_pedidos()) {
          Produto produto = item_pedido.get_produto();
          System.out.println("Cod. do produto: " + produto.get_codigo() + " | Valor: " + produto.get_valor() + " | Descricao do produto: " + produto.get_descricao() + " | Quantidade: " + item_pedido.get_quantidade());
        }
      } else if (op == 3) {
        System.out.println("Total pedido: " + pedido.obter_total());
      } else if (op == 4) {
        break;
      }
    }
    
    System.out.println("Total pedido: " + pedido.obter_total());
    for (ItemPedido item_pedido : pedido.get_itens_pedidos()) {
      Produto produto = item_pedido.get_produto();
      System.out.println("Cod. do produto: " + produto.get_codigo() + " | Valor: " + produto.get_valor() + " | Descricao do produto: " + produto.get_descricao() + " | Quantidade: " + item_pedido.get_quantidade());
    }

    scanner.close();
  }
}
