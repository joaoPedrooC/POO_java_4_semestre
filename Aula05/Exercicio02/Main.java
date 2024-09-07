package Aula05.Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Pessoa> arrayPessoas = new ArrayList<Pessoa>();

    String nome, nomeUniversidade;
    int dia, mes, ano, continuar;

    while (true) {
      if (arrayPessoas.size() > 0) {
        System.out.println("Continuar? (1) Sim (0) Nao");
        continuar = scanner.nextInt();

        if (continuar == 0) {
          break;
        }

        scanner.nextLine();
      }

      System.out.println("Digite o nome da pessoa a ser cadastrada: ");
      nome = scanner.nextLine();

      System.out.println("Digite a data de nascimento da pessoa a ser cadastrada: XX XX XXXX");
      dia = scanner.nextInt();
      mes = scanner.nextInt();
      ano = scanner.nextInt();
      scanner.nextLine();
  
      System.out.println("Digite o nome da universidade que " + nome + " trabalha: ");
      nomeUniversidade = scanner.nextLine();
  
      Universidade universidade = new Universidade(nomeUniversidade);
      Pessoa pessoa = new Pessoa(nome, dia, mes, ano, universidade);
  
      arrayPessoas.add(pessoa);
    }

    for (Pessoa pessoa : arrayPessoas) {
      System.out.println("Nome: " + pessoa.getNome() + " | Idade: " + pessoa.getIdade() + " | Universidade: " + pessoa.getUniversidade());
    }

    scanner.close();
  }
}
