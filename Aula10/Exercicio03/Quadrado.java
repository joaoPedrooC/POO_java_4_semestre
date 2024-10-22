package Aula10.Exercicio03;

public class Quadrado extends Retangulo {
  public Quadrado(double lado1, String cor) {
    super(lado1, lado1, cor);
  }

  @Override
  public String toString() {
    return "Quadrado | Lados: " + this.getLado1() + " | Area: " + this.area() + " | Cor: " + this.getCor();
  }
}
