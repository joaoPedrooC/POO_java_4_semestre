package Aula03.Exercicio02;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int opcao;

    while (true) {
      System.out.println("Digite uma opcao:\n1 - Soma\r\n" + //
        "2 - Subtração\r\n" + //
        "3 - Divisão\r\n" + //
        "4 - Multiplicação\r\n" + //
        "5 - Média\r\n" + //
        "6 - Média ponderada"
      );
      opcao = scanner.nextInt();

      if (opcao == -1) {
        break;
      }

      System.out.println("Digite 2 numeros: ");
      double valor1, valor2;

      valor1 = scanner.nextDouble();
      valor2 = scanner.nextDouble();

      switch (opcao) {
        case 1:
          Soma soma = new Soma(valor1, valor2);
          System.out.println("Soma: " + soma.Somar());

          break;
        case 2:
          Subtracao sub = new Subtracao(valor1, valor2);
          System.out.println("Subtracao: " + sub.Subtrair());

          break;
        case 3:
          Divisao divisao = new Divisao(valor1, valor2);
          System.out.println("Divisao: " + divisao.Dividir());

          break;
        case 4:
          Multiplicacao multiplicacao = new Multiplicacao(valor1, valor2);
          System.out.println("Multiplicacao: " + multiplicacao.Multiplicar());

          break;
        case 5:
          Media media = new Media(valor1, valor2);
          System.out.println("Media: " + media.CalcularMedia());

          break;
        case 6:
          double peso1, peso2;
          System.out.println("Digite os pesos: ");

          peso1 = scanner.nextDouble();
          peso2 = scanner.nextDouble();
          
          MediaPonderada mediaPonderada = new MediaPonderada(valor1, valor2, peso1, peso2);
          System.out.println("Media Ponderada: " + mediaPonderada.CalcularMedia());

          break;
        default:
          break;
      }

      System.out.println("\n\n");
    }

    scanner.close();
  }
}
