package Aula07.Exercicio08;

public class PessoaJuridica extends Usuario {
  protected String cnpj;

  public PessoaJuridica(String nome, String login, String senha, String cnpj) {
    super(nome, login, senha);

    this.cnpj = cnpj;
  }

  public String get_cnpj() {
    return this.cnpj;
  }
}
