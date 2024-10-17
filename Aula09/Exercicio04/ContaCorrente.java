package Aula09.Exercicio04;

public class ContaCorrente extends Conta implements Tributavel {
  public ContaCorrente(double saldo) {
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

  @Override
  public double calculaTributos() {
    SeguroDeVida seguro = new SeguroDeVida();
    return 0.01 * this.saldo + seguro.calculaTributos();
  }
}
