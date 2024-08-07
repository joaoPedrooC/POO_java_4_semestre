package Aula01.Exercicio05;

public class Retangulo {
  double lado1;
  double lado2;

  double area;
  double perimetro;

  public Retangulo(double lado1, double lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  public double calcularArea() {
    this.area = this.lado1 * this.lado2;
    return this.area;
  }

  public double calcularPerimetro() {
    this.perimetro = (2 * this.lado1) + (2 * this.lado2);
    return this.perimetro;
  }
}
