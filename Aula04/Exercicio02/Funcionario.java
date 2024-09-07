package Aula04.Exercicio02;

import java.util.Date;

public class Funcionario {
  private String nome;
  private Date nascimento;
  private String cpf;
  private Endereco endereco;
  protected float salario;

  public Funcionario(String nome, Date nascimento, String cpf, Endereco endereco, float salario) {
    this.nome = nome;
    this.nascimento = nascimento;
    this.cpf = cpf;
    this.endereco = endereco;
    this.salario = salario;
  }

  public String getNome() {
    return this.nome;
  }

  public Date getNascimento() {
    return this.nascimento;
  }

  public String getCpf() {
    return this.cpf;
  }

  public Endereco getEndereco() {
    return this.endereco;
  }
}
