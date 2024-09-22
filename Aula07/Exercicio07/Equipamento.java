package Aula07.Exercicio07;

public class Equipamento {
  private int codigo_equipamento;
  public String nome;

  public Equipamento(int codigo_equipamento, String nome) {
    this.codigo_equipamento = codigo_equipamento;
    this.nome = nome;
  }

  public int get_codigo_equipamento() {
    return this.codigo_equipamento;
  }
}
