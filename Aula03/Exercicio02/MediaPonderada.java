package Aula03.Exercicio02;

public class MediaPonderada extends Media {
  protected double peso1;
  protected double peso2;

  public MediaPonderada(double valor1, double valor2, double peso1, double peso2) {
    super(valor1, valor2);
    
    this.peso1 = peso1;
    this.peso2 = peso2;
  }

  public double CalcularMedia() {
    return ((this.valor1 * this.peso1) + (this.valor2 * this.peso2)) / (this.peso1 + this.peso2);
  }
}
