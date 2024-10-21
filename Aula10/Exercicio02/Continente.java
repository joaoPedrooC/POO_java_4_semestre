package Aula10.Exercicio02;

import java.util.ArrayList;

public class Continente {
  public String nome;
  ArrayList<Pais> paises;

  public Continente(String nome) {
    this.nome = nome;
    this.paises = new ArrayList<Pais>();
  }

  public void adicionar_pais(Pais pais) {
    this.paises.add(pais);
  }

  public float get_dimensao_continente() {
    float total = 0;

    for (Pais pais : this.paises) {
      total += pais.dimensao_territorial;
    }

    return total;
  }

  public int get_populacao_total() {
    int total = 0;

    for (Pais pais : this.paises) {
      total += pais.populacao;
    }

    return total;
  }

  public String get_pais_maior_populacao() {
    int maior = 0;
    String nome_pais = "";

    for (Pais pais : this.paises) {
      if(pais.populacao > maior) {
        maior = pais.populacao;
        nome_pais = pais.nome;
      }
    }

    return nome_pais;
  }

  public String get_pais_menor_populacao() {
    int menor = 1000000;
    String nome_pais = "";

    for (Pais pais : this.paises) {
      if(pais.populacao < menor) {
        menor = pais.populacao;
        nome_pais = pais.nome;
      }
    }

    return nome_pais;
  }

  public String get_pais_maior_dimensao() {
    float maior = 0;
    String nome_pais = "";

    for (Pais pais : this.paises) {
      if(pais.dimensao_territorial > maior) {
        maior = pais.dimensao_territorial;
        nome_pais = pais.nome;
      }
    }

    return nome_pais;
  }
  
  public String get_pais_menor_dimensao() {
    float menor = 10000000;
    String nome_pais = "";

    for (Pais pais : this.paises) {
      if(pais.dimensao_territorial < menor) {
        menor = pais.dimensao_territorial;
        nome_pais = pais.nome;
      }
    }

    return nome_pais;
  }
}
