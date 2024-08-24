package Aula03.Exercicio02;

public class Media extends OperacoesMatematicas {
  public Media(double valor1, double valor2) {
    super(valor1, valor2);
  }

  public double CalcularMedia() {
    return (this.valor1 + this.valor2) / 2;
  }
}
