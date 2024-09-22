package Aula07.Exercicio07;

import java.util.ArrayList;

public class Ocorrencia {
  private int codigo_ocorrencia;
  public String problema;
  private String data_abertura;
  private Status status;
  private ArrayList<Equipamento> equipamentos;

  public Ocorrencia(int codigo_ocorrencia, String problema, String data_abertura, Status status, ArrayList<Equipamento> equipamentos) {
    this.codigo_ocorrencia = codigo_ocorrencia;
    this.problema = problema;
    this.data_abertura = data_abertura;

    this.status = status;
    this.equipamentos = equipamentos;
  }

  public int get_codigo_ocorrencia() {
    return this.codigo_ocorrencia;
  }

  public String get_data_abertura() {
    return this.data_abertura;
  }

  public Status get_status() {
    return this.status;
  }

  public ArrayList<Equipamento> get_equipamentos() {
    return this.equipamentos;
  }
}
