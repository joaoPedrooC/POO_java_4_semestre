package Aula05.Exercicio01;

public class Contador {
  private int contador;

  public Contador() {
    this.contador = 0;
  }

  public void Zerar() {
    this.contador = 0;

    System.out.println("O contador foi zerado!\n\n");
  }

  public void Incrementar() {
    this.contador++;

    System.out.println("O contador foi incrementado!\n\n");
  }

  public int getContador() {
    return this.contador;
  }
}
