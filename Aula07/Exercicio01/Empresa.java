package Aula07.Exercicio01;

import java.util.ArrayList;

public class Empresa {
  private String nome, cnpj;
  private ArrayList<Departamento> departamentos;

  public Empresa(String nome, String cnpj) {
    this.nome = nome;
    this.cnpj = cnpj;

    this.departamentos = new ArrayList<Departamento>();
  }

  public void adicionar_departamento(Departamento departamento) {
    this.departamentos.add(departamento);
  }

  public ArrayList<Departamento> get_departamentos() {
    return this.departamentos;
  }

  public String get_nome() {
    return this.nome;
  }

  public String get_cnpj() {
    return this.cnpj;
  }
}
