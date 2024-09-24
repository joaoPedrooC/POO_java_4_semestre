package Aula07.Exercicio08;

public class Custa {
  private String data;
  private String descricao;
  private double valor;

  public Custa(String data, String descricao, double valor) {
    this.descricao = descricao;
    this.valor = valor;
    this.data = data;
  }

  public String get_data() {
    return this.data;
  }

  public String get_descricao() {
    return this.descricao;
  }

  public double get_valor() {
    return this.valor;
  }
}
