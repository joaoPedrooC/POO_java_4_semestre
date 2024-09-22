package Aula07.Exercicio07;

public class Status {
  private int codigo_status;
  private String status;

  public Status(int codigo_status, String status) {
    this.codigo_status = codigo_status;
    this.status = status;
  }

  public int get_codigo_status() {
    return this.codigo_status;
  }

  public String get_status() {
    return this.status;
  }

  public void set_codigo_status(int codigo_status) {
    this.codigo_status = codigo_status;
  }

  public void set_status(String status) {
    this.status = status;
  }
}
