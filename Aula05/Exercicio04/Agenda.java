package Aula05.Exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Contato> contatos = new ArrayList<Contato>();

    int opcao;

    while (true) {
      System.out.println("1.Cadastrar contato.\n2.Buscar contato.\n3.Imprimir agenda.\n4.Sair");
      opcao = scanner.nextInt();

      if (opcao == 1) {
        String nome, telefone;
        scanner.nextLine();

        System.out.println("Digite o nome e o telefone do contato:");
        
        nome = scanner.nextLine();
        telefone = scanner.nextLine();

        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
      } else if(opcao == 2) {
        String nome;
        scanner.nextLine();

        System.out.println("Digite o nome a ser buscado:");
        nome = scanner.nextLine();
        boolean flag = false;

        for (Contato contato : contatos) {
          if (contato.getNome().equals(nome)) {
            System.out.println("Contato encontrado: " + contato.getNome() + " | " + contato.getTelefone() + '\n');
            flag = true;
          }
        }

        if (!flag) {
          System.out.println("Contato nao encontrado!\n");
        }
      } else if (opcao == 3) {
        for (Contato contato : contatos) {
          System.out.println(contato.getNome() + " | " + contato.getTelefone() + '\n');
        }
      } else {
        break;
      }
    }

    scanner.close();
  }
}
