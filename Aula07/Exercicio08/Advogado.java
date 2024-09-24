package Aula07.Exercicio08;

public class Advogado extends PessoaFisica {
  private String registro_oab;

  public Advogado(String nome, String login, String senha, String cpf, String registro_oab) {
    super(nome, login, senha, cpf);

    this.registro_oab = registro_oab;
  }

  public String get_registro_oab() {
    return this.registro_oab;
  }
}
