package Aula05.Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Professor> professores = new ArrayList<Professor>();
    ArrayList<Coordenador> coordenadores = new ArrayList<Coordenador>();

    String nome, curso;
    double salario;
    int cpf, opcao;

    while (true) {
      System.out.println("1.Sair\n2.Cadastrar professor\n3.Cadastrar Coordenador\n4.Relatorio");
      opcao = scanner.nextInt();

      if (opcao == 1) {
        break;
      } else if (opcao == 4) {
        
        System.out.println("Professores ********");
        for (Professor professor : professores) {
          System.out.println("Nome: " + professor.getNome() + " | CPF: " + professor.getCpf() + " | Salario: " + professor.getSalario());
        }
        
        System.out.println("Coordenadores ********");
        for (Coordenador coordenador : coordenadores) {
          System.out.println("Nome: " + coordenador.getNome() + " | CPF: " + coordenador.getCpf() + " | Salario: " + coordenador.getSalario() + " | Coordenador do curso de: " + coordenador.getCurso());
        }

      } else {
        scanner.nextLine();
  
        System.out.println("Nome:");
        nome = scanner.nextLine();
  
        System.out.println("CPF:");
        cpf = scanner.nextInt();
  
        System.out.println("Salario (R$):");
        salario = scanner.nextDouble();
  
        if (opcao == 2) {
          Professor professor = new Professor(nome, cpf, salario);
          professores.add(professor);
        } else if (opcao == 3) {
          scanner.nextLine();
          System.out.println("Curso que " + nome + " coordena:");
          curso = scanner.nextLine();
  
          Coordenador coordenador = new Coordenador(nome, cpf, salario, curso);
          coordenadores.add(coordenador);
        }
      }
      
    }
  }
}
