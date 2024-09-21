package Aula07.Exercicio06;

import java.util.ArrayList;

public class Disciplina {
  private int codigo_disciplina;
  private String nome;
  private int creditos;
  private ArrayList<Professor> professores;

  public Disciplina(int codigo_disciplina, String nome, int creditos) {
    this.codigo_disciplina = codigo_disciplina;
    this.nome = nome;
    this.creditos = creditos;

    this.professores = new ArrayList<Professor>();
  }

  public void adicionar_professor(Professor professor) {
    this.professores.add(professor);
  }

  public void set_codigo_disciplina(int codigo_disciplina) {
    this.codigo_disciplina = codigo_disciplina;
  }

  public void set_nome(String nome) {
    this.nome = nome;
  }

  public void set_creditos(int creditos) {
    this.creditos = creditos;
  }

  public int get_codigo_disciplina() {
    return this.codigo_disciplina;
  }

  public String get_nome() {
    return this.nome;
  }

  public int get_creditos() {
    return this.creditos;
  }

  public ArrayList<Professor> get_professores() {
    return this.professores;
  }
}
