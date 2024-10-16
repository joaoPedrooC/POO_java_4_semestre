public abstract class Conta {
  protected double saldo;

  public void setSaldo(double valor) {
    this.saldo = valor;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public abstract void imprimeExtrato();
}
