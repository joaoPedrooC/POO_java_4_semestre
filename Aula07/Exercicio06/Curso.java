package Aula07.Exercicio06;

import java.util.ArrayList;

public class Curso {
  private int codigo_curso;
  private String nome;
  private ArrayList<Disciplina> disciplinas;
  private ArrayList<Aluno> alunos;
  private Coordenador coordenador;

  public Curso(int codigo_curso, String nome, Coordenador coordenador) {
    this.codigo_curso = codigo_curso;
    this.nome = nome;
    this.coordenador = coordenador;

    this.disciplinas = new ArrayList<Disciplina>();
    this.alunos = new ArrayList<Aluno>();
  }

  public void set_codigo_curso(int codigo_curso) {
    this.codigo_curso = codigo_curso;
  }

  public void set_nome(String nome) {
    this.nome = nome;
  }

  public int get_codigo_curso() {
    return this.codigo_curso;
  }

  public String get_nome() {
    return this.nome;
  }

  public void adicionar_aluno(Aluno aluno) {
    this.alunos.add(aluno);
  }

  public void adicionar_disciplina(Disciplina disciplina) {
    this.disciplinas.add(disciplina);
  }

  public ArrayList<Aluno> get_alunos() {
    return this.alunos;
  }

  public ArrayList<Disciplina> get_disciplinas() {
    return this.disciplinas;
  }

  public void set_coordenador(Coordenador coordenador) {
    this.coordenador = coordenador;
  }

  public Coordenador get_coordenador() {
    return this.coordenador;
  }
}
