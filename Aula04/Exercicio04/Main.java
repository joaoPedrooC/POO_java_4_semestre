package Aula04.Exercicio04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();
    ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<PessoaJuridica>();

    while (true) {
      int id, numeroEndereco, opcao;
      String nome, nomeFantasia, logradouro, complemento, bairro, cep, cidade, uf;

      System.out.println("0.Encerrar cadastro\n1.Cadastrar colaborador\n2.Cadastrar PJ");
      opcao = scanner.nextInt();
      scanner.nextLine();

      if (opcao == 0) {
        break;
      }

      System.out.println("ID: ");
      id = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Nome: ");
      nome = scanner.nextLine();
      
      System.out.println("Nome Fantasia: ");
      nomeFantasia = scanner.nextLine();
      
      System.out.println("Logradouro: ");
      logradouro = scanner.nextLine();
      
      System.out.println("Numero: ");
      numeroEndereco = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Complemento: ");
      complemento = scanner.nextLine();

      System.out.println("Bairro: ");
      bairro = scanner.nextLine();

      System.out.println("CEP: ");
      cep = scanner.nextLine();

      System.out.println("Cidade: ");
      cidade = scanner.nextLine();

      System.out.println("UF: ");
      uf = scanner.nextLine();

      if (opcao == 1) {
        Colaborador colaborador = new Colaborador();

        String cpf, rg, genero, nascimento, ctps, pis, tituloEleitor, estadoCivil, setor, cargo, telefone1, telefone2, emailPessoal, emailCorporativo;
        float salario;
        int numDependentes;
        boolean reservista, ativo;

        System.out.println("CPF: ");
        cpf = scanner.nextLine();

        System.out.println("RG: ");
        rg = scanner.nextLine();

        System.out.println("Genero: ");
        genero = scanner.nextLine();

        System.out.println("Data de Nascimento: (DD-MM-AAAA)");
        nascimento = scanner.nextLine();
        
        System.out.println("CTPS: ");
        ctps = scanner.nextLine();

        System.out.println("Pis: ");
        pis = scanner.nextLine();
        
        System.out.println("Titulo Eleitor: ");
        tituloEleitor = scanner.nextLine();

        System.out.println("Reservista: ");
        reservista = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Estado Civil: ");
        estadoCivil = scanner.nextLine();

        System.out.println("Numero Dependentes: ");
        numDependentes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ativo: ");
        ativo = scanner.nextBoolean();
        scanner.nextLine();
        
        System.out.println("Setor: ");
        setor = scanner.nextLine();

        System.out.println("Cargo: ");
        cargo = scanner.nextLine();

        System.out.println("Salario: ");
        salario = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Telefone (01): ");
        telefone1 = scanner.nextLine();

        System.out.println("Telefone (02): ");
        telefone2 = scanner.nextLine();

        System.out.println("E-mail Pessoal: ");
        emailPessoal = scanner.nextLine();

        System.out.println("E-mail Corporativo: ");
        emailCorporativo = scanner.nextLine();
        colaborador.setId(id);
        colaborador.setNome(nome);
        colaborador.setNomeFantasia(nomeFantasia);
        colaborador.setLogradouro(logradouro);
        colaborador.setNumero(numeroEndereco);
        colaborador.setComplemento(complemento);
        colaborador.setBairro(bairro);
        colaborador.setCep(cep);
        colaborador.setCidade(cidade);
        colaborador.setUf(uf);

        colaborador.setCpf(cpf);
        colaborador.setRg(rg);
        colaborador.setGenero(genero);

        try {
          Date nascimentoDate = new SimpleDateFormat("dd-mm-yyyy").parse(nascimento);
          colaborador.setNascimento(nascimentoDate);
        } catch (Exception e) {
          e.printStackTrace();
        }

        colaborador.setCtps(ctps);
        colaborador.setPis(pis);
        colaborador.setTituloEleitor(tituloEleitor);
        colaborador.setReservista(reservista);
        colaborador.setEstadoCivil(estadoCivil);
        colaborador.setNumDependentes(numDependentes);
        colaborador.setAtivo(ativo);
        colaborador.setSetor(setor);
        colaborador.setCargo(cargo);
        colaborador.setSalario(salario);
        colaborador.setTelefone1(telefone1);
        colaborador.setTelefone2(telefone2);
        colaborador.setEmailPessoal(emailPessoal);
        colaborador.setEmailCorporativo(emailCorporativo);

        colaboradores.add(colaborador);
      } else {
        PessoaJuridica pj = new PessoaJuridica();

        String cnpj, inscricaoEstadual, fundacaoString;

        System.out.println("CNPJ: ");
        cnpj = scanner.nextLine();

        System.out.println("Inscricao Estadual: ");
        inscricaoEstadual = scanner.nextLine();

        System.out.println("Data Fundacao: ");
        fundacaoString = scanner.nextLine();

        pj.setId(id);
        pj.setNome(nome);
        pj.setNomeFantasia(nomeFantasia);
        pj.setLogradouro(logradouro);
        pj.setNumero(numeroEndereco);
        pj.setComplemento(complemento);
        pj.setBairro(bairro);
        pj.setCep(cep);
        pj.setCidade(cidade);
        pj.setUf(uf);

        pj.setCnpj(cnpj);
        pj.setInscricaoEstadual(inscricaoEstadual);

        try {
          Date fundacao = new SimpleDateFormat("dd-mm-yyyy").parse(fundacaoString);
          pj.setFuncadao(fundacao);
        } catch (Exception e) {
          e.printStackTrace();
        }

        pessoasJuridicas.add(pj);
      }
    }

    System.out.println("Colaboradores:\n");
    for (Colaborador colaborador : colaboradores) {
      System.out.println(
        "Nome: " + colaborador.getNome() +
        "\nCPF: " + colaborador.getCpf() + "\nNome Fantasia: " + colaborador.getNomeFantasia() +
        "\nLogradouro: " + colaborador.getLogradouro() + "\nRG: " + colaborador.getRg() +
        "\nData de Nascimento: " + colaborador.getNascimento() + "\nSetor: " + colaborador.getSetor() +
        "\nCargo: " + colaborador.getCargo() + "\nSalario: " + colaborador.getSalario() + "Telefones: " + colaborador.getTelefone() +
        "\nE-mail: " + colaborador.getEmail() + '\n'
      );
    }

    System.out.println("PJs:\n");
    for (PessoaJuridica pj : pessoasJuridicas) {
      System.out.println(
        "Nome: " + pj.getNome() +
        "\nCNPJ: " + pj.getCnpj() + "\nNome Fantasia: " + pj.getNomeFantasia() +
        "\nLogradouro: " + pj.getLogradouro() + "\nInscricaoEstadual: " + pj.getInscricaoEstadual() +
        "\nFundacao: " + pj.getFundacao() + '\n');
    }

    scanner.close();
  }
}
