package Aula02.Exercicio02;

public class TimeVolei {
  private int TotalJogadores;
  private Jogador []Jogadores;

  public TimeVolei() {
    this.Jogadores = new Jogador[6];
    this.TotalJogadores = 0;
  }

  public void InserirJogador(String nome, int idade, double altura) {
    if(this.TotalJogadores < 6) {
      Jogador novoJogador = new Jogador(nome, idade, altura);
      this.Jogadores[this.TotalJogadores] = novoJogador;

      this.TotalJogadores++;

      System.out.println("Jogador adicionado a equipe!");
      return;
    }

    System.out.println("Limite de jogadores atingido (6)");
  }

  public String RetornarMenorJogador() {
    double menorAltura = this.TotalJogadores > 0 ? this.Jogadores[0].RetornarAltura() : 0;
    int indiceMenorJogador = 0;

    for (int i = 0; i < this.TotalJogadores; i++) {
      double alturaAtual = this.Jogadores[i].RetornarAltura();
      
      if (menorAltura > alturaAtual) {
        menorAltura = alturaAtual;
        indiceMenorJogador = i;
      }
    }

    return "O menor jogador é: " + this.Jogadores[indiceMenorJogador].RetornarNome();
  }

  // Parte dois do exercício / Exercício 03

  public String RetornarMaiorJogador() {
    double maiorAltura = this.TotalJogadores > 0 ? this.Jogadores[0].RetornarAltura() : 0;
    int indiceMaiorJogador = 0;

    for (int i = 0; i < this.TotalJogadores; i++) {
      double alturaAtual = this.Jogadores[i].RetornarAltura();
      
      if (maiorAltura < alturaAtual) {
        maiorAltura = alturaAtual;
        indiceMaiorJogador = i;
      }
    }

    return "O maior jogador é: " + this.Jogadores[indiceMaiorJogador].RetornarNome();
  }

  public String RetornarMaiorJogadorFiltroIdade(int idade) {
    double maiorAltura = -1;
    int indiceMaiorJogador = 0;

    for (int i = 0; i < this.TotalJogadores; i++) {
      double alturaAtual = this.Jogadores[i].RetornarAltura();
      int idadeAtual = this.Jogadores[i].RetornarIdade();

      if (maiorAltura < alturaAtual && idadeAtual > idade) {
        maiorAltura = alturaAtual;
        indiceMaiorJogador = i;
      }
    }

    return maiorAltura > -1 ? "O maior jogador com mais de " + idade + " anos é: " + this.Jogadores[indiceMaiorJogador].RetornarNome()
    : "Não há jogadores com mais de " + idade + " anos.";
  }

  public int RetornarQuantidadeJogadoresFiltrandoIdade(int idade) {
    int quantidadeJogadores = 0;

    for (int i = 0; i < this.TotalJogadores; i++) {
      int idadeAtual = this.Jogadores[i].RetornarIdade();

      quantidadeJogadores += idadeAtual == idade ? 1 : 0;
    }

    return quantidadeJogadores;
  }

  public int RetornarMaiorJogadorFiltroAltura(double altura) {
    int quantidadeJogadores = 0;

    for (int i = 0; i < this.TotalJogadores; i++) {
      double alturaAtual = this.Jogadores[i].RetornarAltura();

      quantidadeJogadores += alturaAtual > altura ? 1 : 0;
    }

    return quantidadeJogadores;
  }

  public double CalcularMediaIdades() {
    double media = 0;

    for (int i = 0; i < this.TotalJogadores; i++) {
      media += this.Jogadores[i].RetornarIdade();
    }

    return media/this.TotalJogadores;
  }

  public double CalcularMediaIdades(double altura) {
    int quantidadeJogadores = 0;
    double media = 0;

    for (int i = 0; i < this.TotalJogadores; i++) {
      if (this.Jogadores[i].RetornarAltura() > altura) {
        media += this.Jogadores[i].RetornarIdade();
        quantidadeJogadores++;
      }
    }

    return media/quantidadeJogadores;
  }
}
