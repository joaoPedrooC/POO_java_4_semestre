package Aula06.Exercicio04;

public class Quarto {
  @SuppressWarnings("unused")
  private int numero;
  private String tipo;
  @SuppressWarnings("unused")
  private Boolean reservado;

  public Quarto(int numero, String tipo, Boolean reservado) {
    this.numero = numero;
    this.tipo = tipo;
    this.reservado = reservado;
  }

  public String get_tipo() {
    return this.tipo;
  }

  public boolean get_reservado() {
    return this.reservado;
  }

  public String get_informacoes() {
    return "Numero: " + this.numero + " | Tipo: " + this.tipo;
  }
}
