package Aula07.Exercicio02;

public class Homem extends PessoaIMC {
  public Homem(String nome, double altura, double peso) {
    super(nome, altura, peso);
  }

  public String calculaIMC() {
    double imc = this.get_peso() / (this.get_altura() * this.get_altura());

    if (imc < 20.7) {
      return "Abaixo do peso ideal";
    } else if (imc < 26.4) {
      return "Peso ideal";
    }

    return "Acima do peso ideal";
  }
}
