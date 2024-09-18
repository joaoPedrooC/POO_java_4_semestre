package Aula07.Exercicio02;

public class PessoaIMC extends Pessoa {
  public PessoaIMC(String nome, double altura, double peso) {
    super(nome, altura, peso);
  }

  public String get_nome() {
    return this.nome;
  }

  public double get_altura() {
    return this.altura;
  }

  public double get_peso() {
    return this.peso;
  }
}
