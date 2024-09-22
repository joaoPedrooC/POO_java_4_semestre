package Aula07.Exercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

    while (true) {
      System.out.println("1.Cadastrar departamento\n2.Cadastrar usuario\n3.Cadastrar tecnico\n4.Cadastrar ocorrencia\n5.Atualizar status ocorrencia\n6.Exibir informacoes\n7.Sair");
      int op = scanner.nextInt();
      scanner.nextLine();

      if (op == 1) {
        System.out.println("Informe o código do departamento:");
        int codigo_departamento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o nome do departamento:");
        String nome_departamento = scanner.nextLine();
        
        Departamento departamento = new Departamento(codigo_departamento, nome_departamento);
        departamentos.add(departamento);
      } else if (op == 2) {
        System.out.println("Informe o código do departamento que o usuário deverá ser adicionado:");
        int codigo_departamento = scanner.nextInt();

        boolean encontrado = false;

        System.out.println("Informe o código do usuário a ser cadastrado:");
        int codigo_usuario = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o nome do usuário:");
        String nome = scanner.nextLine();

        Usuario usuario = new Usuario(codigo_usuario, nome);

        for (Departamento departamento : departamentos) {
          if (departamento.get_codigo_departamento() == codigo_departamento) {
            departamento.adicionar_usuario(usuario);
            encontrado = true;
          }
        }

        if (!encontrado) {
          System.out.println("Departamento não encontrado!\n");
        }
      } else if (op == 3) {
        System.out.println("Informe o código do departamento que o técnico deverá ser adicionado:");
        int codigo_departamento = scanner.nextInt();

        boolean encontrado = false;

        System.out.println("Informe o código do técnico a ser cadastrado:");
        int codigo_tecnico = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o nome do técnico:");
        String nome = scanner.nextLine();

        Tecnico tecnico = new Tecnico(codigo_tecnico, nome);

        for (Departamento departamento : departamentos) {
          if (departamento.get_codigo_departamento() == codigo_departamento) {
            departamento.adicionar_tecnico(tecnico);
            encontrado = true;
          }
        }

        if (!encontrado) {
          System.out.println("Departamento não encontrado!\n");
        }
      } else if (op == 4) {
        System.out.println("Informe o codigo do departamento em que foi solicitada uma ocorrencia:");
        int codigo_departamento = scanner.nextInt();

        boolean departamento_encontrado = false;

        for (Departamento departamento : departamentos) {
          if (departamento.get_codigo_departamento() == codigo_departamento) {
            departamento_encontrado = true;

            boolean usuario_encontrado = false, tecnico_encontrado = false;

            System.out.println("Informe o codigo do usuario que gerou uma ocorrencia:");
            int codigo_usuario = scanner.nextInt();

            System.out.println("Informe o código do técnico responsável pela ocorrência:");
            int codigo_tecnico = scanner.nextInt();
            
            System.out.println("Informe o código da ocorrência:");
            int codigo_ocorrencia = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Descreva o problema:");
            String problema = scanner.nextLine();

            System.out.println("Informe a data de abertura da ocorrência");
            String data_abertura = scanner.nextLine();

            System.out.println("Informe o código de status da ocorrência:");
            int codigo_status = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe o status da ocorrência:");
            String status_ocorrencia = scanner.nextLine();

            Status status = new Status(codigo_status, status_ocorrencia);

            System.out.println("Informe a quantidade de equipamentos necessários para resolver a ocorrência:");
            int quantidade_equipamentos = scanner.nextInt();
            
            ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();

            while (quantidade_equipamentos > 0) {
              System.out.println("Informe o código do equipamento:");
              int codigo_equipamento = scanner.nextInt();
              scanner.nextLine();

              System.out.println("Informe o nome do equipamento:");
              String nome_equipamento = scanner.nextLine();

              Equipamento equipamento = new Equipamento(codigo_equipamento, nome_equipamento);
              equipamentos.add(equipamento);

              quantidade_equipamentos--;
            }

            Ocorrencia ocorrencia = new Ocorrencia(codigo_ocorrencia, problema, data_abertura, status, equipamentos);

            for (Usuario usuario : departamento.get_usuarios()) {
              if (usuario.get_codigo_usuario() == codigo_usuario) {
                usuario_encontrado = true;
                usuario.adicionar_ocorrencia(ocorrencia);
              }
            }

            for (Tecnico tecnico : departamento.get_tecnicos()) {
              if (tecnico.get_codigo_tecnico() == codigo_tecnico) {
                tecnico_encontrado = true;
                tecnico.adicionar_ocorrencia(ocorrencia);
              }
            }

            if (!usuario_encontrado) {
              System.out.println("Usuário não encontrado!");
            }

            if (!tecnico_encontrado) {
              System.out.println("Técnico não encontrado!");
            }
          }
        }

        if (!departamento_encontrado) {
          System.out.println("Departamento não encontrado!");
        }
      } else if (op == 5) {
        System.out.println("Informe o código do departamento:");
        int codigo_departamento = scanner.nextInt();

        System.out.println("Informe o código do técnico responsável pela ocorrência:");
        int codigo_tecnico = scanner.nextInt();

        System.out.println("Informe o código da ocorrência:");
        int codigo_ocorrencia = scanner.nextInt();

        System.out.println("Informe o novo código de status:");
        int codigo_status = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o novo status:");
        String novo_status = scanner.nextLine();

        boolean encontrado = false;

        for (Departamento departamento : departamentos) {
          if (codigo_departamento == departamento.get_codigo_departamento()) {
            for (Tecnico tecnico : departamento.get_tecnicos()) {
              if (codigo_tecnico == tecnico.get_codigo_tecnico()) {
                for (Ocorrencia ocorrencia : tecnico.get_ocorrencias()) {
                  if (codigo_ocorrencia == ocorrencia.get_codigo_ocorrencia()) {
                    ocorrencia.get_status().set_codigo_status(codigo_status);
                    ocorrencia.get_status().set_status(novo_status);

                    encontrado = true;
                  }
                }
              }
            }
          }
        }

        if(!encontrado) {
          System.out.println("Não foi possivel atualizar o status: Chave(s) inválida(s)!");
        }
      } else if (op == 6) {
        for (Departamento departamento : departamentos) {
          System.out.println("Departamento: " + departamento.nome + " | Código: " + departamento.get_codigo_departamento());

          System.out.println("\n");
          System.out.println("********* Usuários *********");
          for (Usuario usuario : departamento.get_usuarios()) {
            System.out.println("Nome: " + usuario.nome + " | Código: " + usuario.get_codigo_usuario() + " | Qtd ocorrências: " + usuario.get_ocorrencias().size());

            System.out.println("********* Ocorrências *********");
            for (Ocorrencia ocorrencia : usuario.get_ocorrencias()) {
              System.out.println("Código: " + ocorrencia.get_codigo_ocorrencia() + " | Problema: " + ocorrencia.problema + "\nData de abertura: " + ocorrencia.get_data_abertura());
            }
          }

          System.out.println("\n");

          System.out.println("********* Técnicos *********");
          for (Tecnico tecnico : departamento.get_tecnicos()) {
            System.out.println("Código: " + tecnico.get_codigo_tecnico() + " | Nome: " + tecnico.nome + " | Qtd ocorrências: " + tecnico.get_ocorrencias().size());

            System.out.println("********* Ocorrências *********");
            for (Ocorrencia ocorrencia : tecnico.get_ocorrencias()) {
              Status status = ocorrencia.get_status();

              System.out.println("Código: " + ocorrencia.get_codigo_ocorrencia() + " | Cód. status: " + status.get_codigo_status() + " | Status: " + status.get_status());

              System.out.println("\n");
              System.out.println("********* Equipamentos para solucao *********");
              for (Equipamento equipamento : ocorrencia.get_equipamentos()) {
                System.out.println("Código: " + equipamento.get_codigo_equipamento() + " | Nome: " + equipamento.nome);
              }
            }
          }

          System.out.println("\n\n");
        }
      } else if (op == 7) {
        break;
      }
    }

    scanner.close();
  }
}
