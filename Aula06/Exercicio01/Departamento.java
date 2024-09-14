import java.util.ArrayList;

public class Departamento {
  private String nome;
  private ArrayList<Funcionario> funcionarios;

  public Departamento(String nome) {
    this.funcionarios = new ArrayList<Funcionario>();
    this.nome = nome;
  }

  public void adicionar_funcionario(Funcionario funcionario) {
    this.funcionarios.add(funcionario);
  }

  public ArrayList<Funcionario> listar_funcionarios() {
    return this.funcionarios;
  }

  public String get_nome() {
    return this.nome;
  }
}
