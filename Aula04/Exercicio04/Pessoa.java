package Aula04.Exercicio04;

public class Pessoa {
  private int id;
  private String nome;
  private String nomeFantasia;
  private String logradouro;
  private int numero;
  private String complemento;
  private String bairro;
  private String cep;
  private String cidade;
  private String uf;

  public int getId() {
    return this.id;
  }

  public int getNumero() {
    return this.numero;
  }

  public String getNome() {
    return this.nome;
  }

  public String getNomeFantasia() {
    return this.nomeFantasia;
  }

  public String getLogradouro() {
    return this.logradouro;
  }

  public String getComplemento() {
    return this.complemento;
  }
  
  public String getBairroString() {
    return this.bairro;
  }
  
  public String getCep() {
    return this.cep;
  }

  public String getCidade() {
    return this.cidade;
  }

  public String getUf() {
    return this.uf;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }
  
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }
  
  public void setNumero(int numero) {
    this.numero = numero;
  }
  
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }
}
