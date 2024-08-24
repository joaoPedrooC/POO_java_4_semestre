package Aula03.Exercicio02;

public class Soma extends OperacoesMatematicas {
  public Soma(double valor1, double valor2) {
    super(valor1, valor2);
  }

  public double Somar() {
    return this.valor1 + this.valor2;
  }
}
