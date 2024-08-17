package Aula02.Exercicio05;

public class Aluno {
  private double nota1;
  private double nota2;
  private double nota3;

  public Aluno(double nota1, double nota2, double nota3) {
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public double[] getNotas() {
    return new double[]{ this.nota1, this.nota2, this.nota3 };
  }

  public double getSomaNotas() {
    return this.nota1 + this.nota2 + this.nota3;
  }

  public double calcularMedia() {
    return (this.nota1 + this.nota2 + this.nota3) / 3;
  }
}
