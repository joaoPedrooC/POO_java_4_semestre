package Aula07.Exercicio08;

public class Secretaria extends PessoaFisica {
  private String numero_carteira;

  public Secretaria(String nome, String login, String senha, String cpf, String numero_carteira) {
    super(nome, login, senha, cpf);

    this.numero_carteira = numero_carteira;
  }

  public String get_numero_carteira() {
    return this.numero_carteira;
  }
}
