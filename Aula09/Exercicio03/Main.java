package Aula09.Exercicio03;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Produto []produtos = new Produto[5];

    int i = 0;
    while(i < 5) {
      try {
        System.out.println("Nome do produto [" + (i + 1) + "]:");
        String nome = scanner.nextLine();
  
        System.out.println("Preco do produto [" + (i + 1) + "]:");
        float custo = scanner.nextFloat();
        scanner.nextLine();
  
        produtos[i] = new Produto(nome, custo);
        i++;
      } catch (Exception e) {
        System.out.println("O preco deve ser numérico.");
        scanner.nextLine();
      }
    }

    System.out.println("\nRelatório dos produtos:");
    for (Produto produto : produtos) {
      System.out.println("Nome: " + produto.getNome() + " | Valor: " + produto.getCusto());
    }

    scanner.close();
  }
}
