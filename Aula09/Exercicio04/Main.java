package Aula09.Exercicio04;

public class Main {
  public static void main(String[] args) {
    ContaPoupanca poupanca = new ContaPoupanca(50);
    poupanca.depositar(150);
    poupanca.sacar(25);

    ContaCorrente corrente = new ContaCorrente(50);
    corrente.depositar(80);
    corrente.sacar(55);

    System.out.println("Conta poupanca:\nSaldo: " + poupanca.obterSaldo());
    System.out.println("Conta corrente:\nSaldo: " + corrente.obterSaldo() + " | Tributos: " + corrente.calculaTributos());
  }
}
