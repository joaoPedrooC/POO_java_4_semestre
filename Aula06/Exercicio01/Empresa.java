import java.util.ArrayList;

public class Empresa {
  private String nome;
  private ArrayList<Departamento> departamentos;

  public Empresa(String nome) {
    this.departamentos = new ArrayList<Departamento>();
    this.nome = nome;
  }

  public void adicionar_departamento(Departamento departamento) {
    this.departamentos.add(departamento);
  }

  public ArrayList<Departamento> listar_departamentos() {
    return this.departamentos;
  }

  public String get_nome() {
    return this.nome;
  }
}
