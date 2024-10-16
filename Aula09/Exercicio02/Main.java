package Aula09.Exercicio02;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ContaPoupanca []poupancas = new ContaPoupanca[5];
    ContaCorrente []correntes = new ContaCorrente[5];

    System.out.println("Saldo inicial das contas poupanças:");
    int i = 0;
    while(i < 5) {
      try {
        System.out.println("Informe o saldo inicial da conta [" + (i + 1) + "]:");
        double vInicial = scanner.nextDouble();
        
        poupancas[i] = new ContaPoupanca(vInicial);
        
        i++;
      } catch (InputMismatchException ex) {
        System.out.println("O valor deve ser numérico.");
        scanner.nextLine();
      }
    }
    
    i = 0;
    
    System.out.println("Saldo inicial das contas correntes:");
    while(i < 5) {
      try {
        System.out.println("Informe o saldo inicial da conta [" + (i + 1) + "]:");
        double vInicial = scanner.nextDouble();

        System.out.println("Informe a taxa de operacao da conta [" + (i + 1) + "]:");
        double taxa = scanner.nextDouble();
        
        correntes[i] = new ContaCorrente(vInicial, taxa);
        
        i++;
      } catch (InputMismatchException ex) {
        scanner.nextLine();
        System.out.println("O valor deve ser numérico.");
      }
    }

    while (true) {
      System.out.println("1.Depositar\n2.Sacar\n3.Mostrar Saldo\n4.Sair");
      int op = scanner.nextInt();

      if (op == 1) {
        try {
          System.out.println("1.Conta Poupanca\n2.Conta Corrente");
          int tipoConta = scanner.nextInt();

          System.out.println("Informe o numero da conta para depósito [1-5]:");
          int conta = scanner.nextInt();

          System.out.println("Informe o valor do deposito:");
          double valor = scanner.nextDouble();
          
          if(tipoConta == 1) poupancas[conta - 1].depositar(valor);
          else if(tipoConta == 2) correntes[conta - 1].depositar(valor);
          else throw new InvalidParameterException();
        } catch (InputMismatchException e) {
          scanner.nextLine();
          System.out.println("Os valores devem ser numericos.");
        } catch (InvalidParameterException e) {
          scanner.nextLine();
          System.out.println("O tipo de conta informado deve ser 1. Conta Poupanca ou 2. Conta Corrente.");
        } catch (ArrayIndexOutOfBoundsException e) {
          scanner.nextLine();
          System.out.println("O numero da conta deve estar contido no intervalo [1-5].");
        }
      } else if (op == 2) {
        try {
          System.out.println("1.Conta Poupanca\n2.Conta Corrente");
          int tipoConta = scanner.nextInt();

          System.out.println("Informe o valor do saque:");
          double valor = scanner.nextDouble();

          System.out.println("Informe o numero da conta para depósito [1-5]:");
          int conta = scanner.nextInt();
          
          if(tipoConta == 1) poupancas[conta - 1].sacar(valor);
          else if(tipoConta == 2) correntes[conta - 1].sacar(valor);
          else throw new InvalidParameterException();
        } catch (InputMismatchException e) {
          scanner.nextLine();
          System.out.println("Os valores devem ser numericos.");
        } catch (InvalidParameterException e) {
          scanner.nextLine();
          System.out.println("O tipo de conta informado deve ser 1. Conta Poupanca ou 2. Conta Corrente.");
        } catch (ArrayIndexOutOfBoundsException e) {
          scanner.nextLine();
          System.out.println("O numero da conta deve estar contido no intervalo [1-5].");
        }
      } else if (op == 3) {
        try {
          System.out.println("1.Conta Poupanca\n2.Conta Corrente");
          int tipoConta = scanner.nextInt();

          System.out.println("Informe o numero da conta para verificar saldo [1-5]:");
          int conta = scanner.nextInt();
          
          if(tipoConta == 1) System.out.println("R$ " + poupancas[conta - 1].getSaldo());
          else if(tipoConta == 2) System.out.println("R$ " + correntes[conta - 1].getSaldo());
          else throw new InvalidParameterException();
        } catch (InputMismatchException e) {
          scanner.nextLine();
          System.out.println("Os valores devem ser numericos.");
        } catch (InvalidParameterException e) {
          scanner.nextLine();
          System.out.println("O tipo de conta informado deve ser 1. Conta Poupanca ou 2. Conta Corrente.");
        } catch (ArrayIndexOutOfBoundsException e) {
          scanner.nextLine();
          System.out.println("O numero da conta deve estar contido no intervalo [1-5].");
        }
      } else if(op == 4) break;
    }

    scanner.close();
  }
}
