package Aula04.Exercicio04;

import java.util.Date;

public class PessoaJuridica extends Pessoa {
  private String cnpj;
  private String inscricaoEstadual;
  private Date fundacao;

  public String getCnpj() {
    return this.cnpj;
  }

  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  
  public Date getFundacao() {
    return this.fundacao;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  public void setFuncadao(Date fundacao) {
    this.fundacao = fundacao;
  }
}
