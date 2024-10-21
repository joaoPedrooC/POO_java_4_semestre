package Aula10.Exercicio02;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    File arquivo = new File("Continente.txt");
    ArrayList<Continente> continentes = new ArrayList<Continente>();

    while (true) {
      try {
        System.out.println("Nome do continente ou -1 para sair:");
        String nome_continente = scanner.nextLine();

        if(nome_continente.equals("-1")) break;

        Continente continente = new Continente(nome_continente);

        System.out.println("Quantidade de paises do continente " + nome_continente + ":");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < qtd; i++) {
          System.out.println("Nome do pais:");
          String nome_pais = scanner.nextLine();

          System.out.println("Populacao:");
          int populacao = scanner.nextInt();
          
          System.out.println("Dimensao territorial:");
          float dimensao_territorial = scanner.nextFloat();
          scanner.nextLine();

          Pais pais = new Pais(nome_pais, populacao, dimensao_territorial);
          continente.adicionar_pais(pais);
        }

        continentes.add(continente);
      } catch (Exception e) {
        System.out.println("Tipo de dado inválido.");
      }
    }

    try {
      FileWriter escrita = new FileWriter(arquivo, true);

      for (Continente continente : continentes) {
        System.out.println("Nome do continente: " + continente.nome);
        System.out.println("Dimensao total: " + continente.get_dimensao_continente());
        System.out.println("Populacao: " + continente.get_populacao_total());
        System.out.println("Pais com maior populacao: " + continente.get_pais_maior_populacao());
        System.out.println("Pais com menor populacao: " + continente.get_pais_menor_populacao());
        System.out.println("Pais com maior dimensao territorial: " + continente.get_pais_maior_dimensao());
        System.out.println("Pais com menor dimensao territorial: " + continente.get_pais_menor_dimensao());
        
        escrita.append(("Nome do continente: " + continente.nome + '\n').toUpperCase());
        escrita.append(("Dimensao total: " + continente.get_dimensao_continente() + '\n').toUpperCase());
        escrita.append(("Populacao: " + continente.get_populacao_total() + '\n').toUpperCase());
        escrita.append(("Pais com maior populacao: " + continente.get_pais_maior_populacao() + '\n').toUpperCase());
        escrita.append(("Pais com menor populacao: " + continente.get_pais_menor_populacao() + '\n').toUpperCase());
        escrita.append(("Pais com maior dimensao territorial: " + continente.get_pais_maior_dimensao() + '\n').toUpperCase());
        escrita.append(("Pais com menor dimensao territorial: " + continente.get_pais_menor_dimensao() + '\n').toUpperCase());
        escrita.append("\n------------------------------\n");
      }

      escrita.close();
    } catch (Exception e) {
      System.out.println("Erro ao abrir arquivo de leitura.");
    }

    scanner.close();
  }
}
