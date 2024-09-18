package Aula07.Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Homem> homens = new ArrayList<Homem>();
    ArrayList<Mulher> mulheres = new ArrayList<Mulher>();

    System.out.println("Informe a quantidade de homens e mulheres a serem cadastrados:");
    int qtd_homens = scanner.nextInt(), qtd_mulheres = scanner.nextInt();
    scanner.nextLine();

    System.out.println("****** Cadastro de homens ******");
    while (qtd_homens > 0) {
      System.out.println("Informe o nome:");
      String nome = scanner.nextLine();

      System.out.println("Informe a altura e o peso:");
      double altura = scanner.nextDouble(), peso = scanner.nextDouble();
      scanner.nextLine();
      
      Homem homem = new Homem(nome, altura, peso);
      homens.add(homem);
      
      qtd_homens--;
    }
    
    System.out.println("****** Cadastro de mulheres ******");
    while (qtd_mulheres > 0) {
      System.out.println("Informe o nome:");
      String nome = scanner.nextLine();
      
      System.out.println("Informe a altura e o peso:");
      double altura = scanner.nextDouble(), peso = scanner.nextDouble();
      scanner.nextLine();

      Mulher mulher = new Mulher(nome, altura, peso);
      mulheres.add(mulher);

      qtd_mulheres--;
    }

    System.out.println("******************");
    for (Homem homem : homens) {
      System.out.println("Nome: " + homem.get_nome() + " | Altura: " + homem.get_altura() + " | Peso: " + homem.get_peso() + " | IMC: " + homem.calculaIMC());
    }

    for (Mulher mulher : mulheres) {
      System.out.println("Nome: " + mulher.get_nome() + " | Altura: " + mulher.get_altura() + " | Peso: " + mulher.get_peso() + " | IMC: " + mulher.calculaIMC());
    }

    scanner.close();
  }
}
