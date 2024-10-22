package Aula10.Exercicio03;

public class Triangulo extends Figura {
  private double base, altura;

  public Triangulo(double base, double altura, String cor) {
    this.base = base;
    this.altura = altura;
    this.setCor(cor);
  }

  public void setBase(double base) {
    this.base = base;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getBase() {
    return this.base;
  }

  public double getAltura() {
    return this.altura;
  }

  public double area() {
    return (this.base * this.altura) / 2;
  }

  public String toString() {
    return "Triangulo | Base: " + this.getBase() + " | Altura: " + this.getAltura() + " | Area: " + this.area() + " | Cor: " + this.getCor();
  }
}
