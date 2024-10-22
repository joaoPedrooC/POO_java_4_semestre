package Aula10.Exercicio03;

public class Retangulo extends Figura {
  private double lado1, lado2;

  public Retangulo(double lado1, double lado2, String cor) {
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.setCor(cor);
  }

  public void setLado1(double lado1) {
    this.lado1 = lado1;
  }

  public void setLado2(double lado2) {
    this.lado2 = lado2;
  }

  public double getLado1() {
    return this.lado1;
  }

  public double getLado2() {
    return this.lado2;
  }

  public double area() {
    return lado1 * lado2;
  }

  public String toString() {
    return "Retangulo | Lado 1: " + this.getLado2() + " | Lado 2: " + this.getLado2() + " | Area: " + this.area() + " | Cor: " + this.getCor();
  }
}
