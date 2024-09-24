package Aula07.Exercicio08;

import java.util.ArrayList;

public class Processo {
  private int codigo_processo;
  private String tribunal;
  private String vara;
  private Pessoa cliente;
  private Pessoa parte_contraria;
  private String status;
  private Secretaria secretaria;
  private Advogado advogado_responsavel;
  private ArrayList<Custa> custas;

  public Processo(int codigo_processo, String tribunal, String vara, Pessoa cliente, Pessoa parte_contraria, String status, Secretaria secretaria, Advogado advogado_responsavel) {
    this.codigo_processo = codigo_processo;
    this.tribunal = tribunal;
    this.vara = vara;
    this.cliente = cliente;
    this.parte_contraria = parte_contraria;
    this.status = status;
    this.secretaria = secretaria;
    this.advogado_responsavel = advogado_responsavel;

    this.custas = new ArrayList<Custa>();
  }

  public int get_codigo_processo() {
    return this.codigo_processo;
  }

  public String get_tribunal() {
    return this.tribunal;
  }

  public String get_vara() {
    return this.vara;
  }

  public Pessoa get_cliente() {
    return this.cliente;
  }

  public Pessoa get_parte_contraria() {
    return this.parte_contraria;
  }

  public String get_status() {
    return this.status;
  }

  public Secretaria get_secretaria() {
    return this.secretaria;
  }

  public Advogado get_advogado_responsavel() {
    return this.advogado_responsavel;
  }

  public ArrayList<Custa> get_custa() {
    return this.custas;
  }

  public void adicionar_custa(Custa custa) {
    this.custas.add(custa);
  }

  public double calcular_total() {
    double total = 0;

    for (Custa custa : custas) {
      total += custa.get_valor();
    }

    return total;
  }
}
