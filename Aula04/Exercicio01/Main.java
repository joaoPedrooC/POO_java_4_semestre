package Aula04.Exercicio01;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    RevistaCientifica revista = new RevistaCientifica("Ciência e Tecnologia", 563);

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nCadastro de edição:");
      int numero = scanner.nextInt();

      if (numero == -1) {
        break;
      }

      Edicao nova_edicao = new Edicao(numero);

      System.out.println("Cadastro dos artigos da edição:");
      for(int i = 0; i < 5; i++) {
        System.out.println("Titulo do artigo:");

        String titulo = scanner.next();
        nova_edicao.InserirArtigo(titulo);
      }

      revista.InserirEdicao(nova_edicao);
    }

    for (Edicao edicao : revista.getEdicao()) {
      System.out.println("Edicao [" + edicao.getNumero() + "]:");
      for (Artigo artigo : edicao.getArtigos()) {
        System.out.println("\nArtigo: " + artigo.getTitulo());
      }
    }

    scanner.close();
  }
}
