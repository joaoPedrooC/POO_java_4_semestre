package Aula07.Exercicio01;

public class Funcionario {
  private String nome, data_admissao;
  private double salario;

  public Funcionario(String nome, String data_admissao, double salario) {
    this.nome = nome;
    this.data_admissao = data_admissao;
    this.salario = salario;
  }

  public String get_nome() {
    return this.nome;
  }

  public String get_data_admissao() {
    return this.data_admissao;
  }

  public double get_salario() {
    return this.salario;
  }

  public void set_salario(double salario) {
    this.salario = salario;
  }
}
