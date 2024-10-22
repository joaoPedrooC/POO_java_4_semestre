package Aula10.Exercicio03;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    File arquivo = new File("Figuras.txt");

    ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
    ArrayList<Retangulo> retangulos = new ArrayList<Retangulo>();
    ArrayList<Quadrado> quadrados = new ArrayList<Quadrado>();
    ArrayList<Circulo> circulos = new ArrayList<Circulo>();

    while(true) {
      System.out.println("1.Triangulo\n2.Retangulo\n3.Quadrado\n4.Circulo\n5.Sair");
      int op = scanner.nextInt();

      if(op == 1) {
        System.out.println("Valor da base:");
        double base = scanner.nextDouble();

        System.out.println("Valor da altura:");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Cor do triangulo:");
        String cor = scanner.nextLine();

        Triangulo triangulo = new Triangulo(base, altura, cor);
        triangulos.add(triangulo);
      } else if(op == 2) {
        System.out.println("Valor do lado 1:");
        double lado1 = scanner.nextDouble();

        System.out.println("Valor do lado 2:");
        double lado2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Cor do retangulo:");
        String cor = scanner.nextLine();

        Retangulo retangulo = new Retangulo(lado1, lado2, cor);
        retangulos.add(retangulo);
      } else if(op == 3) {
        System.out.println("Valor dos lados:");
        double lado = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Cor do quadrado:");
        String cor = scanner.nextLine();

        Quadrado quadrado = new Quadrado(lado, cor);
        quadrados.add(quadrado);
      } else if(op == 4) {
        System.out.println("Raio:");
        double raio = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Cor do circulo:");
        String cor = scanner.nextLine();

        Circulo circulo = new Circulo(raio, cor);
        circulos.add(circulo);
      } else if (op == 5) break;
    }

    try {
      FileWriter escrita = new FileWriter(arquivo, true);
      System.out.println("Triangulos:");
      escrita.append("triangulos:\n");
      
      for (Triangulo triangulo : triangulos) {
        System.out.println(triangulo.toString());
        escrita.append(triangulo.toString().toLowerCase() + '\n');
      }

      System.out.println("Retangulos:");
      escrita.append("retangulos:\n");
      
      for (Retangulo retangulo : retangulos) {
        System.out.println(retangulo.toString());
        escrita.append(retangulo.toString().toLowerCase() + '\n');
      }

      System.out.println("Quadrados:");
      escrita.append("quadrados:\n");
      
      for (Quadrado quadrado : quadrados) {
        System.out.println(quadrado.toString());
        escrita.append(quadrado.toString().toLowerCase() + '\n');
      }

      System.out.println("Circulos:");
      escrita.append("circulos:\n");
      
      for (Circulo circulo : circulos) {
        System.out.println(circulo.toString());
        escrita.append(circulo.toString().toLowerCase() + '\n');
      }

      escrita.append("\n-------------------------------------\n");
      escrita.close();
    } catch (Exception e) {
      System.out.println("Erro ao acessar escrita");
    }

    scanner.close();
  }
}
