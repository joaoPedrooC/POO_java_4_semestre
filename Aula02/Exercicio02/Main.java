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

    scanner.close();
  }
}
