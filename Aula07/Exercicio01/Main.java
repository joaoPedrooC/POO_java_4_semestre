package Aula07.Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Empresa> empresas = new ArrayList<Empresa>();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Informe o nome da empresa que deseja cadastrar ou tecle enter para sair:");
      String nome = scanner.nextLine();

      if (nome.length() == 0) {
        break;
      }

      System.out.println("Informe o cnpj da empresa:");
      String cnpj = scanner.nextLine();

      Empresa empresa = new Empresa(nome, cnpj);
      empresas.add(empresa);

      System.out.println("Informe a quantidade de departamentos da empresa:");
      int qtd_departamentos = scanner.nextInt();
      scanner.nextLine();

      while (qtd_departamentos > 0) {
        String nome_departamento = scanner.nextLine();

        Departamento departamento = new Departamento(nome_departamento);
        empresa.adicionar_departamento(departamento);

        System.out.println("Informe a quantidade de funcionarios do departamento " + nome_departamento + ":");
        int qtd_funcionarios = scanner.nextInt();
        scanner.nextLine();
        
        while (qtd_funcionarios > 0) {
          System.out.println("Informe o nome dos funcionários e sua data de admissão:");
          String nome_funcionario = scanner.nextLine(), data_admissao = scanner.nextLine();

          System.out.println("Informe o salario do funcionario " + nome_funcionario + ":");
          double salario = scanner.nextDouble();
          scanner.nextLine();

          Funcionario funcionario = new Funcionario(nome_funcionario, data_admissao, salario);
          departamento.adicionar_funcionarios(funcionario);
          
          qtd_funcionarios--;
        }

        qtd_departamentos--;
      }
    }

    for (Empresa empresa : empresas) {
      System.out.println("Empresa: " + empresa.get_nome() + " | CNPJ: " + empresa.get_cnpj());
      System.out.println("******** Departamentos: ********");

      for (Departamento departamento : empresa.get_departamentos()) {
        System.out.println("Dep. " + departamento.get_nome() + ":");
        System.out.println("****** Funcionarios do departamento " + departamento.get_nome() + ":");

        departamento.aumento_salarial_departamento();

        for (Funcionario funcionario : departamento.get_funcionario()) {
          System.out.println("Nome: " + funcionario.get_nome() + " | Data de admissao: " + funcionario.get_data_admissao() + " | Salario com 10% de aumento: " + funcionario.get_salario());
        }
      }
    }

    scanner.close();
  }
}
