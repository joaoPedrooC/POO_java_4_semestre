package Aula04.Exercicio03;

import java.text.SimpleDateFormat;

public class Veiculo {
  private String placa;
  private int ano;

  public Veiculo() {}

  public Veiculo(String placa, int ano) {
    this.placa = placa;
    this.ano = ano;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  @SuppressWarnings("deprecation")
  public void setAno(String ano) {
    try {
      this.ano = new SimpleDateFormat("dd-mm-yyyy").parse(ano).getYear();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public String getPlaca() {
    return this.placa;
  }

  public int getAno() {
    return this.ano;
  }

  public void exibirDados() {
    System.out.println("\nPlaca: " + this.placa + " / Ano: " + this.ano);
  }
}
