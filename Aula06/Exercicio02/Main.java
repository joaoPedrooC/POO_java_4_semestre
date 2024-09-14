package Aula06.Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Escola> escolas = new ArrayList<Escola>();

    while (true) {
      String nome;

      System.out.println("Digite o nome da escola a ser cadastrada ou tecle enter para sair:");
      nome = scanner.nextLine();

      if (nome.length() == 0) {
        break;
      }

      Escola escola = new Escola();
      escola.set_nome(nome);

      System.out.println("Informe a quantidade de cursos da escola " + nome + ":");
      int qtdCursos = scanner.nextInt();
      scanner.nextLine();

      for(int i = 0; i < qtdCursos; i++) {
        System.out.println("Nome do curso:");
        String nomeCurso = scanner.nextLine();

        Curso curso = new Curso();
        curso.set_nome(nomeCurso);
  
        System.out.println("Informe a quantidade de alunos do curso " + nomeCurso + ":");
        int qtdAlunos = scanner.nextInt();
        scanner.nextLine();

        for (int j = 0; j < qtdAlunos; j++) {
          String nomeAluno, matricula;
          ArrayList<Float> notas = new ArrayList<Float>();

          System.out.println("Nome do aluno " + (j + 1) + ":");
          nomeAluno = scanner.nextLine();

          System.out.println("Matricula do aluno " + (j + 1) + ":");
          matricula = scanner.nextLine();

          System.out.println("Informe 4 notas do aluno " + (j + 1) + ":");
          notas.add(scanner.nextFloat());
          notas.add(scanner.nextFloat());
          notas.add(scanner.nextFloat());
          notas.add(scanner.nextFloat());
          scanner.nextLine();

          Estudante estudante = new Estudante();
          estudante.set_nome(nomeAluno);
          estudante.set_matricula(matricula);
          estudante.set_notas(notas);

          curso.adicionar_estudante(estudante);
        }

        System.out.println("Informe a quantidade de professores do curso " + nomeCurso + ":");
        int qtdProfessores = scanner.nextInt();
        scanner.nextLine();

        for (int j = 0; j < qtdProfessores; j++) {
          String nomeProfessor, nomeDisciplina;

          System.out.println("Nome do professor " + (j + 1) + ":");
          nomeProfessor = scanner.nextLine();

          System.out.println("Disciplina do professor " + (j + 1) + ":");
          nomeDisciplina = scanner.nextLine();

          Professor professor = new Professor();
          professor.set_nome(nomeProfessor);
          professor.set_disciplina(nomeDisciplina);

          curso.adicionar_professor(professor);
        }

        escola.adicionar_curso(curso);
      }

      escolas.add(escola);
    }

    for (Escola escola : escolas) {
      System.out.println("Escola: " + escola.get_nome());

      for (Curso curso : escola.listar_cursos()) {
        String nomeCurso = curso.get_nome();

        System.out.println("******** Estudantes do curso " + nomeCurso + ":");
        for (Estudante estudante : curso.listar_estudantes()) {
          System.out.println("Nome: " + estudante.get_nome() + " | Matricula: " + estudante.get_matricula() + " | Media: " + estudante.calcular_media());
        }

        System.out.println("******** Professores do curso " + nomeCurso + ":");
        for (Professor professor : curso.listar_professores()) {
          System.out.println("Nome: " + professor.get_nome() + " | Disciplina: " + professor.get_disciplina());
        }

        System.out.println("\n");
      }
    }

    scanner.close();
  }
}
