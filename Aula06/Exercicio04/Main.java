package Aula06.Exercicio04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Hotel> hoteis = new ArrayList<Hotel>();

    while (true) {
      System.out.println("Informe o nome do hotel ou tecle enter para sair:");
      String nomeHotel = scanner.nextLine();

      if (nomeHotel.length() == 0) {
        break;
      }

      System.out.println("Informe o valor da diaria de um quarto de solteiro e de casal:");
      float valorDiariaSolteiro = scanner.nextFloat(), valorDiariaCasal = scanner.nextFloat();

      Hotel hotel = new Hotel(nomeHotel, valorDiariaSolteiro, valorDiariaCasal);
      scanner.nextLine();
          
      System.out.println("Informe a quantidade de quartos do hotel:");
      int qtdQuartos = scanner.nextInt();

      for(int i = 0; i < qtdQuartos; i++) {
        System.out.println("Informe o numero do quarto:");
        int numeroQuarto = scanner.nextInt();
        
        System.out.println("Informe se o quarto está reservado:");
        boolean reservado = scanner.nextBoolean();
        scanner.nextLine();
        
        System.out.println("Informe o tipo do quarto (Solteiro - Casal):");
        String tipoQuarto = scanner.nextLine();

        Quarto quarto = new Quarto(numeroQuarto, tipoQuarto, reservado);

        hotel.adicionar_quarto(quarto);

        if (reservado) {
          System.out.println("Digite o nome do cliente ");
          String nomeCliente = scanner.nextLine();

          Cliente cliente = new Cliente(nomeCliente);

          System.out.println("Informe a quantidade de dias reservados:");
          int diasReservados = scanner.nextInt();
          scanner.nextLine();

          System.out.println("Informe a data de reserva (dd-mm-aaaa):");
          String dataReserva = scanner.nextLine();

          try {
            Date date = new SimpleDateFormat("dd-mm-yyyy").parse(dataReserva);
            Reserva reserva = new Reserva(cliente, quarto, diasReservados, date);

            hotel.adicionar_reserva(reserva);
          } catch (ParseException e) {
            e.printStackTrace();
          }
        }
      }

      hoteis.add(hotel);
    }

    for (Hotel hotel : hoteis) {
      System.out.println("\nNome do hotel: " + hotel.get_nome() + " | Valor arrecadado reservas: " + hotel.calcular_total_reservas());

      System.out.println("\nQuartos disponiveis:");
      for (Quarto quarto : hotel.get_quartos()) {
        if (!quarto.get_reservado()) {
          System.out.println("Quarto: " + quarto.get_informacoes());
        }
      }

      System.out.println("\nReservas:");
      for (Reserva reserva : hotel.get_reservas()) {
        Quarto quarto = reserva.get_quarto();

        System.out.println("Quarto " + quarto.get_informacoes() + " \nInformacoes de reserva:\n" + reserva.get_data() + '\n');
      }
    }

    scanner.close();
  }
}
