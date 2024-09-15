package Aula06.Exercicio04;

import java.util.ArrayList;

public class Hotel {
  private String nome;
  private float valor_reserva_s;
  private float valor_reserva_c;
  private ArrayList<Reserva> reservas;
  private ArrayList<Quarto> quartos;

  public Hotel(String nome, float valor_reserva_s, float valor_reserva_c) {
    this.nome = nome;
    this.valor_reserva_s = valor_reserva_s;
    this.valor_reserva_c = valor_reserva_c;

    this.reservas = new ArrayList<Reserva>();
    this.quartos = new ArrayList<Quarto>();
  }

  public void adicionar_reserva(Reserva reserva) {
    this.reservas.add(reserva);
  }

  public void adicionar_quarto(Quarto quarto) {
    this.quartos.add(quarto);
  }

  public Float calcular_total_reservas() {
    float total = 0;
    for (Reserva reserva : this.reservas) {
      total += reserva.calcular_total(this.valor_reserva_s, this.valor_reserva_c);
    }

    return total;
  }

  public String get_nome() {
    return this.nome;
  }

  public ArrayList<Reserva> get_reservas() {
    return this.reservas;
  }

  public ArrayList<Quarto> get_quartos() {
    return this.quartos;
  }
}
