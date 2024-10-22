package Aula10.Exercicio03;

public class Circulo extends Figura {
  private double raio;

  public Circulo(double raio, String cor) {
    this.raio = raio;
    this.setCor(cor);
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double getRaio() {
    return this.raio;
  }

  public double area() {
    return 3.14 * raio * raio;
  }

  public double getDiametro() {
    return raio * 2;
  }

  public String toString() {
    return "Circulo | Raio: " + this.getRaio() + " | Diametro: " + this.getDiametro() + " | Area: " + this.area() + " | Cor: " + this.getCor();
  }
}
