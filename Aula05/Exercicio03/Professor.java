package Aula05.Exercicio03;

public class Professor extends Pessoa {
  private double salario;

  public Professor(String nome, int cpf, double salario) {
    super(nome, cpf);
    this.salario = salario;
  }

  public double getSalario() {
    return this.salario;
  }

  public void Imprime() {
    super.Imprime();
    System.out.println(" | Salario: " + this.salario);
  }
}
