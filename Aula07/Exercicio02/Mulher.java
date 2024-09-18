package Aula07.Exercicio02;

public class Mulher extends PessoaIMC {
  public Mulher(String nome, double altura, double peso) {
    super(nome, altura, peso);
  }

  public String calculaIMC() {
    double imc = this.get_peso() / (this.get_altura() * this.get_altura());

    if (imc < 19) {
      return "Abaixo do peso ideal";
    } else if (imc < 25.8) {
      return "Peso ideal";
    }

    return "Acima do peso ideal";
  }
}
