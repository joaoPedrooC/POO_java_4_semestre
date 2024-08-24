package Aula03.Exercicio03;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int qtdAlunos, qtdProfessores;
    
    System.out.println("Informe a quantidade de alunos: ");
    qtdAlunos = scanner.nextInt();

    System.out.println("Informe a quantidade de professores: ");
    qtdProfessores = scanner.nextInt();

    Aluno[] alunos = new Aluno[qtdAlunos];
    Professor[] professores = new Professor[qtdProfessores];

    System.out.println("Adicionar alunos:\n");
    for (int i = 0; i < qtdAlunos; i++) {
      String nome, curso;
      int idade;

      System.out.println("Informe o nome do aluno: ");
      nome = scanner.next();

      System.out.println("Informe a idade do aluno: ");
      idade = scanner.nextInt();

      System.out.println("Informe o curso do aluno: ");
      curso = scanner.next();

      alunos[i] = new Aluno();

      alunos[i].setNome(nome);
      alunos[i].setIdade(idade);
      alunos[i].setCurso(curso);
    }

    System.out.println("Adicionar professores:\n");
    for (int i = 0; i < qtdProfessores; i++) {
      String nome, formacao;
      int idade;

      System.out.println("Informe o nome do professor: ");
      nome = scanner.next();

      System.out.println("Informe a idade do professor: ");
      idade = scanner.nextInt();

      System.out.println("Informe a formacao do professor: ");
      formacao = scanner.next();

      professores[i] = new Professor();

      professores[i].setNome(nome);
      professores[i].setIdade(idade);
      professores[i].setFormacao(formacao);
    }

    System.out.println("Professores:\n");
    for (Professor professor : professores) {
      System.out.println("Professor: " + professor.getNome() + " Formacao: " + professor.getFormacao());
    }

    System.out.println("Alunos:\n");
    for (Aluno aluno : alunos) {
      System.out.println("Aluno: " + aluno.getNome() + " Curso: " + aluno.getCurso());
    }

    scanner.close();
  }
}
