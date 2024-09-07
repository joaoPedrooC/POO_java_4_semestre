package Aula05.Exercicio03;

public class Pessoa {
  private String nome;
  private int cpf;
  @SuppressWarnings("unused")
  private static int contador;

  public Pessoa(String nome, int cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public int getCpf() {
    return this.cpf;
  }

  public String getNome() {
    return this.nome;
  }

  public void Imprime() {
    System.out.println("Nome: " + this.nome + " | CPF: " + this.cpf);
  }
}
