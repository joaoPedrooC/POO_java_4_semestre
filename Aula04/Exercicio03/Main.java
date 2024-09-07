package Aula04.Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Onibus> onibus = new ArrayList<Onibus>();
    ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      String placa;
      int op, ano;

      System.out.println("1.Cadastrar Onibus\n2.Cadastrar Caminhao");
      op = scanner.nextInt();

      if (op == -1) break;
      else if(op == 1) {
        placa = scanner.next();
        ano = scanner.nextInt();

        int assentos = scanner.nextInt();

        Onibus bus = new Onibus(placa, ano, assentos);
        onibus.add(bus);
      } else {
        placa = scanner.next();
        ano = scanner.nextInt();

        int eixos = scanner.nextInt();

        Caminhao cam = new Caminhao(placa, ano, eixos);
        caminhoes.add(cam);
      }
    }

    for (Onibus bus : onibus) {
      System.out.println(bus.getPlaca() + " " + bus.getAno() + " " + bus.getAssentos());
    }

    for (Caminhao caminhao : caminhoes) {
      System.out.println(caminhao.getPlaca() + " " + caminhao.getAno() + " " + caminhao.getEixos());
    }

    scanner.close();
  }
}
