import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ContaPoupanca []contas = new ContaPoupanca[5];
    for(int i = 0; i < 5; i++) {
      try {
        double valor = scanner.nextDouble();
        
        contas[i] = new ContaPoupanca(valor);
      } catch (InputMismatchException ex) {
        System.out.println("Tipo incorreto, valor deve ser inteiro.");

        scanner.nextLine();
        double valor = scanner.nextDouble();

        contas[i] = new ContaPoupanca(valor);

        break;
      }
    }

    for (int i = 0; i < 5; i++) {
      System.out.println("Conta [" + (i + 1) + "]:");
      contas[i].imprimeExtrato();
      System.out.println('\n');
    }

    scanner.close();
  }
}
