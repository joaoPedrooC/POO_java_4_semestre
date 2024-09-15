package Aula06.Exercicio04;

import java.util.Date;

public class Reserva {
  private Cliente cliente;
  private Quarto quarto;
  private int dias_reservados;
  private Date data_reserva;

  public Reserva(Cliente cliente, Quarto quarto, int dias_reservados, Date data_reserva) {
    this.cliente = cliente;
    this.quarto = quarto;
    this.dias_reservados = dias_reservados;
    this.data_reserva = data_reserva;
  }

  public Float calcular_total(float valorSolteiro, float valorCasal) {
    return this.quarto.get_tipo() == "Solteiro" ? valorSolteiro * this.dias_reservados : valorCasal * this.dias_reservados;
  }

  public Quarto get_quarto() {
    return this.quarto;
  }

  public Cliente get_cliente() {
    return this.cliente;
  }

  public String get_data() {
    return "Reservado em: " + this.data_reserva + " por " + this.dias_reservados + " dias";
  }
}
