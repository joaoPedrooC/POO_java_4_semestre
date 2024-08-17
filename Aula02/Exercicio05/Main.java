package Aula02.Exercicio05;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int qtdAlunos = scanner.nextInt();

    Disciplina disciplina = new Disciplina(qtdAlunos);

    for (int i = 0; i < qtdAlunos; i++) {
      double nota1 = scanner.nextDouble();
      double nota2 = scanner.nextDouble();
      double nota3 = scanner.nextDouble();

      disciplina.InserirAluno(nota1, nota2, nota3);
    }

    double mediaTotal = disciplina.CalcularMediaNotas();
    System.out.println("Media total: " + mediaTotal);
    
    double mediaNotaMinima = disciplina.CalcularMediaNotas(scanner.nextDouble());
    System.out.println("Media com nota minima determinada: " + mediaNotaMinima);
    
    int totalReprovados = disciplina.ContarAlunosReprovados();
    System.out.println("Total de alunos reprovados: " + totalReprovados);

    scanner.close();
  }
}
