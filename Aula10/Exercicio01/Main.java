import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    File arquivo = new File("log.txt");

    while (true) {
      try {
        String texto = scanner.nextLine();
        if(texto.equals("-1")) break;
  
        FileWriter escrita = new FileWriter(arquivo, true);
        escrita.append(texto + '\n');
        escrita.close();
      } catch (Exception e) {
        System.out.println("Erro ao acessar o arquivo de escrita");
      }
    }

    if (arquivo.exists()) {
      try {
        Scanner leitura_arquivo = new Scanner(arquivo);
        
        while (leitura_arquivo.hasNextLine()) {
          System.out.println(leitura_arquivo.nextLine() + '\n');
        }

        leitura_arquivo.close();
      } catch (Exception e) {
        System.out.println("Erro ao acessar o arquivo de leitura");
      }
    }

    scanner.close();
  }
}
