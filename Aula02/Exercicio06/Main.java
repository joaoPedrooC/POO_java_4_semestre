package Aula02.Exercicio06;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Empregado[] empregado = new Empregado[5];

    for (int i = 0; i < 5; i++) {
      String nome = scanner.next();
      String cpf = scanner.next();
      double salario = scanner.nextDouble();

      empregado[i] = new Empregado(nome, cpf, salario);
    }

    for (Empregado emp : empregado) {
      System.out.println(emp.RetornarInformacao());
    }

    scanner.close();
  }
}
