package Aula07.Exercicio01;

import java.util.ArrayList;

public class Departamento {
  private String nome;
  private ArrayList<Funcionario> funcionarios;

  public Departamento(String nome) {
    this.nome = nome;
    this.funcionarios = new ArrayList<Funcionario>();
  }

  public String get_nome() {
    return this.nome;
  }

  public void adicionar_funcionarios(Funcionario funcionario) {
    this.funcionarios.add(funcionario);
  }

  public ArrayList<Funcionario> get_funcionario() {
    return this.funcionarios;
  }

  public void aumento_salarial_departamento() {
    for (Funcionario funcionario : this.funcionarios) {
      double salario = funcionario.get_salario();

      funcionario.set_salario(
        salario + (salario * 0.1)
      );
    }
  }
}
