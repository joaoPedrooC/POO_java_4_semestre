package Aula07.Exercicio08;

public class Usuario extends Pessoa {
  protected String login;
  protected String senha;

  public Usuario(String nome, String login, String senha) {
    super(nome);
    
    this.login = login;
    this.senha = senha;
  }

  public String get_login() {
    return this.login;
  }

  public String get_senha() {
    return this.senha;
  }
}
