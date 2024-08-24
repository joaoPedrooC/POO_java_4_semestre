package Aula03.Exercicio02;

public class Multiplicacao extends OperacoesMatematicas {
  public Multiplicacao(double valor1, double valor2) {
    super(valor1, valor2);
  }

  public double Multiplicar() {
    return this.valor1 * this.valor2;
  }
}
