package Aula03.Exercicio02;

public class Subtracao extends OperacoesMatematicas {
  public Subtracao(double valor1, double valor2) {
    super(valor1, valor2);
  }

  public double Subtrair() {
    return this.valor1 - this.valor2;
  }
}
