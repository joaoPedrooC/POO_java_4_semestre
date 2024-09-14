import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Empresa> empresas = new ArrayList<Empresa>();

    while (true) {
      System.out.println("Digite o nome da empresa ou tecle enter para sair:");

      String nome = scanner.nextLine();
      if (nome.length() == 0) {
        break;
      }

      System.out.println("Cadastre o nome do departamento:");
      String nome_departamento = scanner.nextLine();

      Empresa empresa = new Empresa(nome);
      Departamento departamento = new Departamento(nome_departamento);

      System.out.println("Digite a quantidade de funcionarios do departamento:");
      int qtd_funcionarios = scanner.nextInt();
      scanner.nextLine();

      for (int i = 0; i < qtd_funcionarios; i++) {
        System.out.println("Nome do funcionario:");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Cargo do funcionario:");
        String cargo = scanner.nextLine();

        System.out.println("Salario do funcionario:");
        float salario = scanner.nextFloat();
        scanner.nextLine();

        Funcionario funcionario = new Funcionario();
        funcionario.set_nome(nomeFuncionario);
        funcionario.set_cargo(cargo);
        funcionario.set_salario(salario);

        departamento.adicionar_funcionario(funcionario);
      }

      empresa.adicionar_departamento(departamento);
      empresas.add(empresa);
    }

    for (Empresa empresa : empresas) {
      ArrayList<Departamento> departamentos = empresa.listar_departamentos();
      System.out.println("Nome da empresa: " + empresa.get_nome());

      for (Departamento departamento : departamentos) {
        ArrayList<Funcionario> funcionarios = departamento.listar_funcionarios();
        
        System.out.println("Funcionarios do departamento " + departamento.get_nome());
        for (Funcionario funcionario : funcionarios) {
          System.out.println("Nome: " + funcionario.get_nome() + " | Salario: " + funcionario.get_salario() + " | Cargo: " + funcionario.get_cargo());
        }
      }
    }

    scanner.close();
  }
}
