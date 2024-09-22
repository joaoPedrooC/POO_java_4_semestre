package Aula07.Exercicio07;

import java.util.ArrayList;

public class Usuario {
  private int codigo_usuario;
  public String nome;
  private ArrayList<Ocorrencia> ocorrencias;

  public Usuario(int codigo_usuario, String nome) {
    this.codigo_usuario = codigo_usuario;
    this.nome = nome;

    this.ocorrencias = new ArrayList<Ocorrencia>();
  }

  public void adicionar_ocorrencia(Ocorrencia ocorrencia) {
    this.ocorrencias.add(ocorrencia);
  }
  
  public int get_codigo_usuario() {
    return this.codigo_usuario;
  }

  public ArrayList<Ocorrencia> get_ocorrencias() {
    return this.ocorrencias;
  }
}
