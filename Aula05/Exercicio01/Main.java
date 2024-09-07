package Aula05.Exercicio01;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Contador contador = new Contador();
    Scanner scanner = new Scanner(System.in);

    int opcao;

    while (true) {
      System.out.println("1.Incrementar contador.\n2.Zerar contador.\n3.Mostrar o valor do contador.");
      opcao = scanner.nextInt();

      if (opcao == -1) {
        break;
      } else if (opcao == 1) {
        contador.Incrementar();
      } else if (opcao == 2) {
        contador.Zerar();
      } else {
       System.out.println("O valor do contador e: (" +  contador.getContador() + ")\n");
      }
    }

    scanner.close();
  }
}
