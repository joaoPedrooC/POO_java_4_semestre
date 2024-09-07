package Aula04.Exercicio02;

public class Endereco {
  @SuppressWarnings("unused")
  private String rua;
  @SuppressWarnings("unused")
  private int numero;
  @SuppressWarnings("unused")
  private String bairro;
  @SuppressWarnings("unused")
  private String cep;
  @SuppressWarnings("unused")
  private Cidade cidade;

  public Endereco(String rua, String cep, String bairro, int numero, Cidade cidade) {
    this.rua = rua;
    this.cep = cep;
    this.bairro = bairro;
    this.numero = numero;
    this.cidade = cidade;
  }
}
