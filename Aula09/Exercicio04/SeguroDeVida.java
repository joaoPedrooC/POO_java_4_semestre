package Aula09.Exercicio04;

public class SeguroDeVida implements Tributavel {
  private int taxa = 42;

  @Override
  public double calculaTributos() {
    return this.taxa;
  }
}