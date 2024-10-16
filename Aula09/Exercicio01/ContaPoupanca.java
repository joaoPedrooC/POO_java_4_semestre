public class ContaPoupanca extends Conta {
  public ContaPoupanca(double saldo) {
    this.setSaldo(saldo);
  }

  @Override
  public void imprimeExtrato() {
    System.out.println("Extrato: " + this.getSaldo());
  };
}

