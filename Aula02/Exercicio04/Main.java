package Aula02.Exercicio04;

public class Main {
  public static void main(String[] args) {
    Livro livro = new Livro("Livro aleatorio", 255);
    livro.setPaginasLidas(25);

    System.out.println("Titulo do livro: " + livro.getTitulo());
    System.out.println("Quantidade de paginas do livro: " + livro.getQtdPaginas());
    System.out.println("Paginas lidas: " + livro.getPaginasLidas());

    float progressoLeitura = livro.verificarProgresso();
    System.out.format("Você já leu %.2f por cento do livro", progressoLeitura);
  }
}
