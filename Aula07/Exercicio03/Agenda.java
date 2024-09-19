import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contato> contatos = new ArrayList<Contato>();

    while(true) {
      System.out.println("1.Cadastrar contato\n2.Buscar contato\n3.Imprimir agenda\n4.Sair");
      int op = scanner.nextInt();
      scanner.nextLine();

      if (op == 1) {
        System.out.println("Informe o nome do contato:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o nome da cidade do contato:");
        String nomeCidade = scanner.nextLine();

        System.out.println("Informe o nome do estado do contato:");
        String nomeEstado = scanner.nextLine();

        System.out.println("Informe o numero da rua:");
        String numeroRua = scanner.nextLine();

        System.out.println("Informe o numero do contato:");
        String numero = scanner.nextLine();
        
        Cidade cidade = new Cidade(nomeCidade);
        Estado estado = new Estado(nomeEstado);
        Endereco endereco = new Endereco(numeroRua, cidade, estado);

        Contato contato = new Contato(nome, endereco, numero);
        contatos.add(contato);
      } else if (op == 2) {
        System.out.println("Informe o nome do contato que deseja buscar:");
        String nomeContato = scanner.nextLine();
        boolean encontrado = false;

        for (Contato contato : contatos) {
          if (contato.getNome().equalsIgnoreCase(nomeContato)) {
            System.out.println("Contato encontrado!\nNome: " + contato.getNome() + " Endereco: " + contato.getEndereco().getCidade().getNomeCidade() + " " + contato.getEndereco().getEstado().getNomeEstado() + " N°" + contato.getEndereco().getRuaNumero() + " Contato: " + contato.getTelefone());
            encontrado = true;
          }
        }

        if (!encontrado) {
          System.out.println("Contato inexistente");
        }
      } else if (op == 3) {
        for (Contato contato : contatos) {
          System.out.println("Nome: " + contato.getNome() + " Endereco: " + contato.getEndereco().getCidade().getNomeCidade() + " " + contato.getEndereco().getEstado().getNomeEstado() + " N°" + contato.getEndereco().getRuaNumero() + " Contato: " + contato.getTelefone());
        }
      } else if (op == 4) {
        break;
      }
    }

    scanner.close();
  }
}
