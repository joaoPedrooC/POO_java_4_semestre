package Aula04.Exercicio04;

import java.util.Date;

public class PessoaFisica extends Pessoa {
  private String cpf;
  private String rg;
  private String genero;
  private Date nascimento;

  public String getCpf() {
    return this.cpf;
  }

  public String getRg() {
    return this.rg;
  }

  public String getGenero() {
    return this.genero;
  }

  public Date getNascimento() {
    return this.nascimento;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void setNascimento(Date nascimento) {
    this.nascimento = nascimento;
  }
}
