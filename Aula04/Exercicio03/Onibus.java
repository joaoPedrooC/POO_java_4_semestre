package Aula04.Exercicio03;

public class Onibus extends Veiculo {
  private int assentos;

  public Onibus(String placa, int ano, int assentos) {
    super(placa, ano);
    this.assentos = assentos;
  }

  public void setAssentos(int assentos) {
    this.assentos = assentos;
  }

  public int getAssentos() {
    return this.assentos;
  }

  public void exibirDados() {
    super.exibirDados();
    System.out.println("Assentos: " + this.assentos);
  }
}
