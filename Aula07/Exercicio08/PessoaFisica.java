package Aula07.Exercicio08;

public class PessoaFisica extends Usuario {
  protected String cpf;

  public PessoaFisica(String nome, String login, String senha, String cpf) {
    super(nome, login, senha);

    this.cpf = cpf;
  }

  public String get_cpf() {
    return this.cpf;
  }
}
