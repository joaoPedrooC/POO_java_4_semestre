package Aula04.Exercicio02;

import java.util.Date;

public class Gerente extends Funcionario {
  public Gerente(String nome, Date nascimento, String cpf, Endereco endereco, float salario) {
    super(nome, nascimento, cpf, endereco, salario);
  }

  public float getSalario() {
    return this.salario;
  }
}
