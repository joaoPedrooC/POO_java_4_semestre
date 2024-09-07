package Aula04.Exercicio01;

import java.util.ArrayList;

public class Edicao {
  private int numero;
  private ArrayList<Artigo> artigos = new ArrayList<Artigo>();

  public Edicao(int numero) {
    this.numero = numero;
  }

  public void InserirArtigo(String artigo) {
    Artigo novoArtigo = new Artigo(artigo);
    this.artigos.add(novoArtigo);
  }

  public ArrayList<Artigo> getArtigos() {
    return this.artigos;
  }

  public int getNumero() {
    return this.numero;
  }
}
