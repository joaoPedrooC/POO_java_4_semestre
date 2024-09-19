public class Contato extends Pessoa {
  private String numero;

  public Contato(String nome, Endereco endereco, String numero) {
    super(nome, endereco);
    this.numero = numero;
  }

  public String getTelefone() {
    return this.numero;
  }
}
