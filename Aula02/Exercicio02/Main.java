package Aula02.Exercicio02;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int quantidadeJogadores;

    System.out.println("Digite a quantidade de jogadores que irá entrar para o time: ");
    quantidadeJogadores = scanner.nextInt();

    TimeVolei time = new TimeVolei();

    for (int i = 0; i < quantidadeJogadores; i++) {
      
      String nome;
      int idade;
      double altura;

      System.out.println("Digite o nome: ");
      nome = scanner.next();
      System.out.println("Digite a idade: ");
      idade = scanner.nextInt();
      System.out.println("Digite a altura: ");
      altura = scanner.nextDouble();

      time.InserirJogador(nome, idade, altura);

    }

    System.out.println(time.RetornarMenorJogador());

    // Parte dois do exercicio / Exercicio 03

    System.out.println(time.RetornarMaiorJogador());

    System.out.println("Informar uma idade para retornar o maior jogador mais velho que o informado: ");
    String maiorJogador = time.RetornarMaiorJogadorFiltroIdade(scanner.nextInt());

    System.out.println(maiorJogador);

    System.out.println("Informe uma idade para retornar o número de jogadores com a idade informada: ");
    int totalJogadoresFiltroIdade = time.RetornarQuantidadeJogadoresFiltrandoIdade(scanner.nextInt());
    
    System.out.println("O numero de jogadores com a idade informada é: " + totalJogadoresFiltroIdade);
    
    
    
    System.out.println("Informe uma altura para retornar o número de jogadores com a altura maior que a informada: ");
    int totalJogadoresFiltroAltura = time.RetornarMaiorJogadorFiltroAltura(scanner.nextDouble());

    System.out.println("O numero de jogadores maiores que o informado é: " + totalJogadoresFiltroAltura);


    System.out.println("A média de idades de todos os jogadores é: " + time.CalcularMediaIdades());

    System.out.println("Informar altura mínima para calcular a média: ");
    double media = time.CalcularMediaIdades(scanner.nextDouble());

    System.out.println("A média de idades dos jogadores com filtro de altura é: " + media);

    scanner.close();
  }
}
