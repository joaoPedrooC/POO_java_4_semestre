public class Aluno {
  private String nome;
  
  private double nota1;
  private double nota2;
  private double nota3;
  private double media;

  public Aluno(String nome, double nota1, double nota2, double nota3) {
    this.nome = nome;

    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  private double Somar() {
    return this.nota1 + this.nota2 + this.nota3;
  }

  private double CalcularMedia() {
    this.media = this.Somar()/3;

    return this.media;
  }

  public String ResultadoFinal() {
    double media = this.CalcularMedia();

    return media >= 6 ? "O aluno " + this.nome + " está aprovado!" : media >= 4 ? "O aluno " + this.nome + " está de recuperação!" : "O aluno " + this.nome + " está reprovado!";
  }
}
