package Aula01.Exercicio04;

class OperacoesMatematicas {
  double numero1;
  double numero2;
  double numero3;

  public OperacoesMatematicas(double numero1, double numero2, double numero3) {
    this.numero1 = numero1;
    this.numero2 = numero2;
    this.numero3 = numero3;
  }

  public double somar() {
    return this.numero1 + this.numero2 + this.numero3;
  }

  public double subtrair() {
    return this.numero1 - this.numero2 - this.numero3;
  }

  public double multiplicar() {
    return this.numero1 * this.numero2 * this.numero3;
  }

  public double media() {
    return (this.numero1 + this.numero2 + this.numero3) / 3;
  }

  public double maiorNumero() {
    boolean numero1 = this.numero1 > this.numero2 && this.numero1 > this.numero3;
    boolean numero2 = this.numero2 > this.numero3 && !numero1;

    return numero1 ? this.numero1 : numero2 ? this.numero2 : this.numero3;
  }
}
