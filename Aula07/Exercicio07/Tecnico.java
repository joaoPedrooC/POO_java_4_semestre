package Aula07.Exercicio07;

import java.util.ArrayList;

public class Tecnico {
  private int codigo_tecnico;
  public String nome;
  ArrayList<Ocorrencia> ocorrencias;

  public Tecnico(int codigo_tecnico, String nome) {
    this.codigo_tecnico = codigo_tecnico;
    this.nome = nome;

    this.ocorrencias = new ArrayList<Ocorrencia>();
  }

  public void adicionar_ocorrencia(Ocorrencia ocorrencia) {
    this.ocorrencias.add(ocorrencia);
  }

  public int get_codigo_tecnico() {
    return this.codigo_tecnico;
  }

  public ArrayList<Ocorrencia> get_ocorrencias() {
    return this.ocorrencias;
  }
}
