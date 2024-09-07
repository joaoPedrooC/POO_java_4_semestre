package Aula04.Exercicio02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
  public static void main() {
    ArrayList<Vendedor> equipe_venda = new ArrayList<Vendedor>();
    ArrayList<Gerente> equipe_gerencia = new ArrayList<Gerente>();

    Scanner scanner = new Scanner(System.in);
    
    int op;
    
    while (true) {
      System.out.println("1.Cadastrar Vendedor\n2.Cadastrar Gerente\n3.Exibir Informacoes\n-1.Sair: ");
      op = scanner.nextInt();
      scanner.nextLine();

      if (op == -1) {
        break;
      } else if (op == 1) {
        String nome, cpf, cidade, bairro, rua, estado, sigla, cep, nascimento;
        int num_endereco;
        float salario;

        System.out.println("Nome: ");
        nome = scanner.nextLine();
        
        System.out.println("CPF: ");
        cpf = scanner.next();
        
        System.out.println("Nascimento: ");
        nascimento = scanner.next();
        
        System.out.println("Salario: ");
        salario = scanner.nextFloat();
        cidade = scanner.nextLine();

        System.out.println("Cidade: ");
        cidade = scanner.nextLine();

        System.out.println("Bairro: ");
        bairro = scanner.nextLine();

        System.out.println("Rua: ");
        rua = scanner.nextLine();
        
        System.out.println("Numero Endereco: ");
        num_endereco = scanner.nextInt();

        System.out.println("CEP: ");
        cep = scanner.next();

        System.out.println("Estado: ");
        estado = scanner.nextLine();

        System.out.println("Sigla Estado: ");
        sigla = scanner.next();

        Estado estadoVendedor = new Estado(estado, sigla);
        Cidade cidadeVendedor = new Cidade(cidade, estadoVendedor);
        Endereco enderecoVendedor = new Endereco(rua, cep, bairro, num_endereco, cidadeVendedor);

        try {
          Date DataNascimento = new SimpleDateFormat("dd-mm-yyyy").parse(nascimento);
          Vendedor vendedor = new Vendedor(nome, DataNascimento, cpf, enderecoVendedor, salario);

          equipe_venda.add(vendedor);
        } catch (Exception e) {
         e.printStackTrace(); 
        }
      } else if(op == 2) {
        String nome, cpf, cidade, bairro, rua, estado, sigla, cep, nascimento;
        int num_endereco;
        float salario;

        System.out.println("Nome: ");
        nome = scanner.next();
        
        System.out.println("CPF: ");
        cpf = scanner.next();
        
        System.out.println("Nascimento: ");
        nascimento = scanner.next();
        
        System.out.println("Salario: ");
        salario = scanner.nextFloat();

        System.out.println("Cidade: ");
        cidade = scanner.nextLine();

        System.out.println("Bairro: ");
        bairro = scanner.nextLine();

        System.out.println("Rua: ");
        rua = scanner.nextLine();
        
        System.out.println("Numero Endereco: ");
        num_endereco = scanner.nextInt();

        System.out.println("CEP: ");
        cep = scanner.next();

        System.out.println("Estado: ");
        estado = scanner.nextLine();

        System.out.println("Sigla Estado: ");
        sigla = scanner.next();

        Estado estadoVendedor = new Estado(estado, sigla);
        Cidade cidadeVendedor = new Cidade(cidade, estadoVendedor);
        Endereco enderecoVendedor = new Endereco(rua, cep, bairro, num_endereco, cidadeVendedor);

        try {
          Date DataNascimento = new SimpleDateFormat("dd-mm-yyyy").parse(nascimento);
          Gerente vendedor = new Gerente(nome, DataNascimento, cpf, enderecoVendedor, salario);

          equipe_gerencia.add(vendedor);
        } catch (Exception e) {
         e.printStackTrace(); 
        }
      } else {
        System.out.println("Vendedores:");
        for (Vendedor vendedor : equipe_venda) {
          System.out.println(
            "Nome: " + vendedor.getNome() + " Salario: " + vendedor.getSalario() + " CPF: " + vendedor.getCpf() + " Nascimento: " + vendedor.getNascimento()
          );
        }

        System.out.println("Gerencia:");
        for (Gerente gerente : equipe_gerencia) {
          System.out.println(
            "Nome: " + gerente.getNome() + " Salario: " + gerente.getSalario() + " CPF: " + gerente.getCpf() + " Nascimento: " + gerente.getNascimento()
          );
        }

      }
    }

    scanner.close();
  }
}
