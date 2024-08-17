package Aula02.Exercicio05;

public class Disciplina {
  private int totalAlunos;
  private int qtdAlunos = 0;
  private Aluno[] alunos;

  public Disciplina(int totalAlunos) {
    this.totalAlunos = totalAlunos;
    this.alunos = new Aluno[totalAlunos];
  }

  public void InserirAluno(double nota1, double nota2, double nota3) {
    if (qtdAlunos < totalAlunos) {
      alunos[qtdAlunos] = new Aluno(nota1, nota2, nota3);
      qtdAlunos++;
      System.out.println("Aluno inserido!");
      return;
    }

    System.out.println("Não é possível inserir o aluno: limite atingido!");
  }

  public double CalcularMediaNotas() {
    double media = 0;
    
    for (Aluno aluno : this.alunos) {
      if (aluno != null) {
        media += aluno.getSomaNotas();
      }
    }

    return media / this.qtdAlunos;
  }

  public double CalcularMediaNotas(double notaMinima) {
    double media = 0;
    int qtdNotasValidadas = 0;
    
    for (Aluno aluno : this.alunos) {
      double[] notas = aluno.getNotas();

      for (double nota : notas) {
        if (nota >= notaMinima) {
          media+=nota;
          qtdNotasValidadas++;
        }
      }
    }

    return media / qtdNotasValidadas;
  }

  public int ContarAlunosReprovados() {
    int quantidadeReprovados = 0;

    for (Aluno aluno : this.alunos) {
      if (aluno.calcularMedia() < 4) {
        quantidadeReprovados++;
      }
    }

    return quantidadeReprovados;
  }
}
