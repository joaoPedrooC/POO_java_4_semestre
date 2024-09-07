package Aula04.Exercicio01;

import java.util.ArrayList;

public class RevistaCientifica {
  @SuppressWarnings("unused")
  private String titulo;
  @SuppressWarnings("unused")
  private int numero;

  private ArrayList<Edicao> edicoes = new ArrayList<Edicao>();

  public RevistaCientifica(String titulo, int numero) {
    this.titulo = titulo;
    this.numero = numero;
  }

  public void InserirEdicao(Edicao edicao) {
    this.edicoes.add(edicao);
  }

  public ArrayList<Edicao> getEdicao() {
    return this.edicoes;
  }
}
