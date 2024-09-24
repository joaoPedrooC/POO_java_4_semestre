package Aula07.Exercicio08;

import java.util.ArrayList;
import java.util.Scanner;

public class Escritorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<PessoaFisica> clientes_pf = new ArrayList<PessoaFisica>();
    ArrayList<PessoaJuridica> clientes_pj = new ArrayList<PessoaJuridica>();
    ArrayList<Secretaria> secretarias = new ArrayList<Secretaria>();
    ArrayList<Advogado> advogados = new ArrayList<Advogado>();
    ArrayList<Processo> processos = new ArrayList<Processo>();

    while(true) {
      System.out.println("1.Cadastrar cliente PJ\n2.Cadastrar cliente PF\n3.Cadastrar secretaria\n4.Cadastrar advogado\n5.Cadastrar processo\n6.Consultar informacoes\n7.Sair");
      int op = scanner.nextInt();
      scanner.nextLine();

      if (op == 1) {
        System.out.println("Informe o nome do cliente:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o login do cliente:");
        String login = scanner.nextLine();

        System.out.println("Informe a senha do cliente:");
        String senha = scanner.nextLine();

        System.out.println("Informe o cnpj do cliente:");
        String cnpj = scanner.nextLine();

        PessoaJuridica cliente_pj = new PessoaJuridica(nome, login, senha, cnpj);
        clientes_pj.add(cliente_pj);
      } else if (op == 2) {
        System.out.println("Informe o nome do cliente:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o login do cliente:");
        String login = scanner.nextLine();

        System.out.println("Informe a senha do cliente:");
        String senha = scanner.nextLine();

        System.out.println("Informe o cpf do cliente:");
        String cpf = scanner.nextLine();

        PessoaFisica cliente_pf = new PessoaFisica(nome, login, senha, cpf);
        clientes_pf.add(cliente_pf);
      } else if (op == 3) {
        System.out.println("Informe o nome da secretaria:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o login da secretaria:");
        String login = scanner.nextLine();

        System.out.println("Informe a senha da secretaria:");
        String senha = scanner.nextLine();

        System.out.println("Informe o cpf da secretaria:");
        String cpf = scanner.nextLine();

        System.out.println("Informe o numero da carteira da secretaria:");
        String numero_carteira = scanner.nextLine();
        
        Secretaria secretaria = new Secretaria(nome, login, senha, cpf, numero_carteira);
        secretarias.add(secretaria);
      } else if(op == 4) {
        System.out.println("Informe o nome do advogado:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o login do advogado:");
        String login = scanner.nextLine();

        System.out.println("Informe a senha do advogado:");
        String senha = scanner.nextLine();

        System.out.println("Informe o cpf do advogado:");
        String cpf = scanner.nextLine();

        System.out.println("Informe o numero da OAB do advogado:");
        String numero_oab = scanner.nextLine();

        Advogado advogado = new Advogado(nome, login, senha, cpf, numero_oab);
        advogados.add(advogado);
      } else if (op == 5) {
        System.out.println("Informe o código do processo:");
        int codigo_processo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o tribunal que o processo será julgado:");
        String tribunal = scanner.nextLine();

        System.out.println("Informe a vara:");
        String vara = scanner.nextLine();

        System.out.println("Informe o nome do cliente:");
        String nome_cliente = scanner.nextLine();

        Pessoa cliente = new Pessoa(nome_cliente);

        System.out.println("Informe o nome da pessoa da parte contraria:");
        String nome_parte_contraria = scanner.nextLine();

        Pessoa parte_contraria = new Pessoa(nome_parte_contraria);

        System.out.println("Informe o nome da secretaria que abriu o processo:");
        String nome_secretaria = scanner.nextLine();

        System.out.println("Informe o nome do advogado responsável pelo processo:");
        String nome_advogado = scanner.nextLine();

        Secretaria secretaria = null;
        for (Secretaria s : secretarias) {
          if (s.get_nome().equalsIgnoreCase(nome_secretaria)) {
            secretaria = s;
          }
        }

        Advogado advogado = null;
        for (Advogado a : advogados) {
          if (a.get_nome().equalsIgnoreCase(nome_advogado)) {
            advogado = a;
          }
        }
        
        System.out.println("Informe o status do processo:");
        String status = scanner.nextLine();

        System.out.println("Informe a quantidade de custas do processo:");
        int quantidade_custas = scanner.nextInt();
        scanner.nextLine();

        Processo processo = new Processo(codigo_processo, tribunal, vara, cliente, parte_contraria, status, secretaria, advogado);

        while (quantidade_custas > 0) {
          System.out.println("Informe a data da custa:");
          String data = scanner.nextLine();

          System.out.println("Informe a descricao da custa:");
          String descricao = scanner.nextLine();

          System.out.println("Informe o valor da custa:");
          double valor = scanner.nextDouble();
          scanner.nextLine();
          
          Custa custa = new Custa(data, descricao, valor);
          processo.adicionar_custa(custa);

          quantidade_custas--;
        }

        processos.add(processo);
      } else if (op == 6) {
        System.out.println("\n******* Clientes cadastrados *******");
        for (PessoaFisica cliente_fisico : clientes_pf) {
          System.out.println("Nome: " + cliente_fisico.get_nome() + " | CPF: " + cliente_fisico.get_cpf() + " | Login: " + cliente_fisico.get_login()
          + " Senha: " + cliente_fisico.get_senha());
        }
        
        for (PessoaJuridica cliente_juridico : clientes_pj) {
          System.out.println("Nome: " + cliente_juridico.get_nome() + " | CNPJ: " + cliente_juridico.get_cnpj() + " | Login: " + cliente_juridico.get_login()
          + " Senha: " + cliente_juridico.get_senha());
        }
        
        System.out.println("\n******* Advogados cadastrados *******");
        for (Advogado advogado : advogados) {
          System.out.println("Nome: " + advogado.get_nome() + " | CPF: " + advogado.get_cpf() + " | Login: " + advogado.get_login()
          + " Senha: " + advogado.get_senha() + " | Numero OAB: " + advogado.get_registro_oab());
        }

        System.out.println("\n******* Secretarios cadastrados *******");
        for (Secretaria secretaria : secretarias) {
          System.out.println("Nome: " + secretaria.get_nome() + " | CPF: " + secretaria.get_cpf() + " | Login: " + secretaria.get_login()
          + " Senha: " + secretaria.get_senha() + " | Numero carteira: " + secretaria.get_numero_carteira());
        }
        
        System.out.println("\n******* Processos cadastrados *******");
        for (Processo processo : processos) {
          System.out.println(
            "Código do processo: " + processo.get_codigo_processo() + " | Status: " + processo.get_status() + " | Cliente: " +
            processo.get_cliente().get_nome() + " | Tribunal: " + processo.get_tribunal() + " | Vara: " + processo.get_vara() + 
            " | Parte contraria:" + processo.get_parte_contraria().get_nome() + " | Advogado responsavel: " +
            processo.get_advogado_responsavel().get_nome() + " | Secretario: " + processo.get_secretaria().get_nome() +
            "\n Despezas: R$ " + processo.calcular_total()
          );
        }
      } else if (op == 7) {
        break;
      }
    }

    scanner.close();
  }
}
