package Aula06.Exercicio02;

import java.util.ArrayList;

public class Curso {
  private String nome;
  private ArrayList<Estudante> estudantes;
  private ArrayList<Professor> professores;

  public Curso() {
    this.estudantes = new ArrayList<Estudante>();
    this.professores = new ArrayList<Professor>();
  }

  public String get_nome() {
    return this.nome;
  }

  public ArrayList<Estudante> listar_estudantes() {
    return this.estudantes;
  }

  public ArrayList<Professor> listar_professores() {
    return this.professores;
  }

  public void set_nome(String nome) {
    this.nome = nome;
  }

  public void adicionar_estudante(Estudante estudante) {
    this.estudantes.add(estudante);
  }

  public void adicionar_professor(Professor professor) {
    this.professores.add(professor);
  }
}
