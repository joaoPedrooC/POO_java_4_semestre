package Aula03.Exercicio02;

public class Divisao extends OperacoesMatematicas {
  public Divisao(double valor1, double valor2) {
    super(valor1, valor2);
  }

  public double Dividir() {
    return this.valor1 / this.valor2;
  }
}
