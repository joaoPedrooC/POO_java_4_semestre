package Aula06.Exercicio02;

import java.util.ArrayList;

public class Estudante {
  private String nome;
  private String matricula;
  private ArrayList<Float> notas;

  public Estudante() {}

  public String get_nome() {
    return this.nome;
  }

  public void set_nome(String nome) {
    this.nome = nome;
  }

  public String get_matricula() {
    return this.matricula;
  }

  public void set_matricula(String matricula) {
    this.matricula = matricula;
  }

  public ArrayList<Float> get_notas() {
    return this.notas;
  }

  public void set_notas(ArrayList<Float> notas) {
    this.notas = notas;
  }

  public Float calcular_media() {
    float resultado = 0;
    
    for (Float nota : this.notas) {
      resultado += nota;
    }

    return resultado / this.notas.size();
  }
}
