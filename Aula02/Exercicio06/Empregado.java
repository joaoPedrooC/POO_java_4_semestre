package Aula02.Exercicio06;

public class Empregado {
  private String nome;
  private String cpf;
  private double salario;

  public Empregado(String nome, String cpf, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
  }

  public String RetornarInformacao() {
    return "O empregado " + this.nome + " de CPF " + this.cpf + " ganha R$ " + this.salario + " / mês.";
  }
}
