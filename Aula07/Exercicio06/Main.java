package Aula07.Exercicio06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Curso> cursos = new ArrayList<Curso>();

    while (true) {
      System.out.println("1.Cadastrar curso\n2.Listar cursos\n3.Sair");
      int op = scanner.nextInt();
      scanner.nextLine();

      if (op == 1) {
        System.out.println("Informe o nome do curso:");
        String nome_curso = scanner.nextLine();

        System.out.println("Informe o codigo do curso:");
        int codigo_curso = scanner.nextInt();

        
        System.out.println("Informe o código do coordenador:");
        int codigo_coordenador = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Informe o nome do coordenador do curso:");
        String nome_coordenador = scanner.nextLine();
        
        Coordenador coordenador = new Coordenador(codigo_coordenador, nome_coordenador);
        Curso curso = new Curso(codigo_curso, nome_curso, coordenador);
        
        System.out.println("Informe a quantidade de disciplinas do curso " + nome_curso + ":");
        int quantidade_disciplinas = scanner.nextInt();
        
        while (quantidade_disciplinas > 0) {
          System.out.println("Informe o codigo da disciplina:");
          int codigo_disciplina = scanner.nextInt();
          scanner.nextLine();

          System.out.println("Informe o nome da disciplina:");
          String nome_disciplina = scanner.nextLine();

          System.out.println("Informe os creditos da disciplina:");
          int creditos = scanner.nextInt();
          
          System.out.println("Informe a quantidade de professores da disciplina " + nome_disciplina + ":");
          int quantidade_professores = scanner.nextInt();
          scanner.nextLine();

          Disciplina disciplina = new Disciplina(codigo_disciplina, nome_disciplina, creditos);

          while (quantidade_professores > 0) {
            System.out.println("Informe a matricula do professor:");
            int matricula_professor = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe o nome do professor:");
            String nome_professor = scanner.nextLine();

            Professor professor = new Professor(matricula_professor, nome_professor);
            disciplina.adicionar_professor(professor);

            quantidade_professores--;
          }

          curso.adicionar_disciplina(disciplina);

          quantidade_disciplinas--;
        }

        System.out.println("Informe a quantidade de alunos do curso:");
        int quantidade_alunos = scanner.nextInt();

        while (quantidade_alunos > 0) {
          System.out.println("Informe o RA do aluno:");
          int ra = scanner.nextInt();
          scanner.nextLine();
          
          System.out.println("Informe o nome do aluno:");
          String nome = scanner.nextLine();

          Aluno aluno = new Aluno(ra, nome);
          curso.adicionar_aluno(aluno);

          quantidade_alunos--;
        }

        cursos.add(curso);
      } else if (op == 2) {
        System.out.println("********** Cursos **********");
        for (Curso curso : cursos) {
          Coordenador coordenador = curso.get_coordenador();

          System.out.println("\nNome do curso: " + curso.get_nome() + " | Código: " + curso.get_codigo_curso() + "\nCoordenador: " + coordenador.get_nome() + " Código coord.: " + coordenador.get_codigo_coordenador());

          System.out.println("\n********** Disciplinas **********");
          for (Disciplina disciplina : curso.get_disciplinas()) {
            System.out.println("Código da disciplina: " + disciplina.get_codigo_disciplina() + " | Nome da disciplina: " + disciplina.get_nome()
            + " Creditos da disciplina: " + disciplina.get_creditos());
            
            
            System.out.println("\n********** Professores da disciplina **********");
            for (Professor professor : disciplina.get_professores()) {
              System.out.println("Matricula do professor: " + professor.get_matricula() + " | Nome: " + professor.get_nome());
            }
          }
          
          System.out.println("\n********** Professores da disciplina **********");
          for (Aluno aluno : curso.get_alunos()) {
            System.out.println("RA do aluno:" + aluno.get_ra() + " | Nome: " + aluno.get_nome());
          }

          System.out.println("\n********************");
        }
      } else if (op == 3) {
        break;
      }
    }

    scanner.close();
  }
}
