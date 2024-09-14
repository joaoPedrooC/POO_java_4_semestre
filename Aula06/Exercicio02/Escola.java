package Aula06.Exercicio02;

import java.util.ArrayList;

public class Escola {
  private String nome;
  private ArrayList<Curso> cursos;

  public Escola() {
    cursos = new ArrayList<Curso>();
  }

  public String get_nome() {
    return this.nome;
  }

  public void set_nome(String nome) {
    this.nome = nome;
  }

  public void adicionar_curso(Curso curso) {
    this.cursos.add(curso);
  }

  public ArrayList<Curso> listar_cursos() {
    return this.cursos;
  }
}
