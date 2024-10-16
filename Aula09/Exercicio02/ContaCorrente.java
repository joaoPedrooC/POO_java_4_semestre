package Aula09.Exercicio02;

public class ContaCorrente implements Conta {
  private double saldo;
  private double taxa_operacao;

  public ContaCorrente(double saldo, double taxa_operacao) {
    this.saldo = saldo;
    this.taxa_operacao = taxa_operacao;
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor - this.taxa_operacao;
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor + this.taxa_operacao;
  }

  @Override
  public double getSaldo() {
    return this.saldo;
  }
}
