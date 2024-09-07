package Aula05.Exercicio03;

public class Coordenador extends Professor {
  private String curso;

  public Coordenador(String nome, int cpf, double salario, String curso) {
    super(nome, cpf, salario);
    this.curso = curso;
  }

  public double getSalario() {
    return super.getSalario();
  }

  public String getCurso() {
    return this.curso;
  }

  public void Imprime() {
    super.Imprime();
    System.out.println("| Coordenador do curso: " + this.curso);
  }
}
