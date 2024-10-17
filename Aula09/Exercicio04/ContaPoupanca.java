package Aula09.Exercicio04;

public class ContaPoupanca extends Conta {
  public ContaPoupanca(double saldo) {
    super(saldo);
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
  }

  @Override
  public double obterSaldo() {
    return this.saldo;
  }
}
