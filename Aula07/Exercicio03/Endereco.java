public class Endereco {
  private String ruaNumero;
  private Cidade cidade;
  private Estado estado;

  public Endereco(String ruaNumero, Cidade cidade, Estado estado) {
    this.ruaNumero = ruaNumero;
    this.cidade = cidade;
    this.estado = estado;
  }

  public String getRuaNumero() {
    return this.ruaNumero;
  }

  public Cidade getCidade() {
    return this.cidade;
  }

  public Estado getEstado() {
    return this.estado;
  }
}
