package Aula09.Exercicio04;

public abstract class Conta {
  protected double saldo;

  public Conta(double saldo) {
    this.saldo = saldo;
  }

  public abstract void depositar(double valor);
  public abstract void sacar(double valor);
  public abstract double obterSaldo();
}
