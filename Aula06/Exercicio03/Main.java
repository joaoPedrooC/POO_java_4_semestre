package Aula06.Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    while (true) {
      System.out.println("Digite o nome do cliente ou tecle enter para sair:");
      String nome_cliente = scanner.nextLine();

      if (nome_cliente.length() == 0) {
        break;
      }

      Cliente cliente = new Cliente(nome_cliente);
      
      while (true) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pedido pedido = new Pedido(carrinho);
        
        while (true) {
          System.out.println("1.Adicionar Produto\n2.Remover Produto\n3.Finalizar Pedido");
          int opcao = scanner.nextInt();
          scanner.nextLine();

          if (opcao == 1) {
            System.out.println("Informe o nome do novo produto:");
            String nome_produto = scanner.nextLine();
    
            System.out.println("Informe o preco do produto:");
            Float preco = scanner.nextFloat();
            scanner.nextLine();
            
            System.out.println("Informe a quantidade do produto em estoque:");
            int estoque = scanner.nextInt();
            scanner.nextLine();
  
            Produto produto = new Produto(nome_produto, preco, estoque);
            carrinho.adicionar_produto(produto);
          } else if (opcao == 2) {
            System.out.println("Informe o indice do produto a ser removido:");
            int indexProduto = scanner.nextInt();
            scanner.nextLine();

            carrinho.remover_produto(indexProduto);
          } else {
            break;
          }
        }

        cliente.adicionar_pedido(pedido);

        System.out.println("1.Realizar novo pedido\n2.Finalizar cliente");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 2) {
          break;
        }
      }

      clientes.add(cliente);
    }

    for (Cliente cliente : clientes) {
      System.out.println(
        "Nome cliente: " + cliente.get_nome() + "\n****** Pedidos:"
      );

      for (Pedido pedido : cliente.listar_pedidos()) {
        ArrayList<Produto> carrinho = pedido.get_pedidos();

        for (Produto produto : carrinho) {
          System.out.println(
            "Nome do produto: " + produto.get_nome() + " | Qtd em estoque: " + produto.get_estoque() + " | Preco: " + produto.get_preco()
          );
        }

        System.out.println("Total do pedido: " + pedido.calcular_total() + '\n');
      }

      System.out.println("\n\n");
    }

    scanner.close();
  }
}
