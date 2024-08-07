package Aula01.Exercicio04;

import java.util.Scanner;

public class Main {
  public static void main() {
    Scanner scanner = new Scanner(System.in);
    OperacoesMatematicas op;

    float numero1; 
    float numero2;
    float numero3;

    System.out.println("Digite um numero:");
    numero1 = scanner.nextFloat();
    
    System.out.println("Digite um numero:");
    numero2 = scanner.nextFloat();
    
    System.out.println("Digite um numero:");
    numero3 = scanner.nextFloat();

    op = new OperacoesMatematicas(numero1, numero2, numero3);

    System.out.format("\nSoma: %.2f", op.somar());
    System.out.format("\nSubtracao: %.2f", op.subtrair());
    System.out.format("\nMultiplicacao: %.2f", op.multiplicar());
    System.out.format("\nMedia: %.2f", op.media());
    System.out.format("\nO maior numero e: %.2f", op.maiorNumero());

    scanner.close();
  }
}