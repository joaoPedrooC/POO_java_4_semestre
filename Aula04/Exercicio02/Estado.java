package Aula04.Exercicio02;

public class Estado {
  private String nome;
  private String sigla;

  public Estado(String nome, String sigla) {
    this.nome = nome;
    this.sigla = sigla;
  }

  public String getNome() {
    return this.nome;
  }
  
  public String getSigla() {
    return this.sigla;
  }
}
