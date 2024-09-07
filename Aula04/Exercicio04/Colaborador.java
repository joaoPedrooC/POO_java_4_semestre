package Aula04.Exercicio04;

public class Colaborador extends PessoaFisica {
  private String ctps;
  private String pis;
  private String tituloEleitor;
  private boolean reservista;
  private String estadoCivil;
  private int numDependentes;
  private boolean ativo;
  private String setor;
  private String cargo;
  private float salario;
  private String telefone1;
  private String telefone2;
  private String emailPessoal;
  private String emailCorporativo;

  public String getCtps() {
    return this.ctps;
  }

  public String getPis() {
    return this.pis;
  }
  
  public String getTituloEleitor() {
    return this.tituloEleitor;
  }

  public boolean getReservista() {
    return this.reservista;
  }

  public String getEstadoCivil() {
    return this.estadoCivil;
  }

  public int getNumDependentes() {
    return this.numDependentes;
  }

  public boolean getAtivo() {
    return this.ativo;
  }

  public String getSetor() {
    return this.setor;
  }

  public String getCargo() {
    return this.cargo;
  }

  public float getSalario() {
    return this.salario;
  }

  public String getTelefone() {
    return "Telefone (1): " + this.telefone1 + "\nTelefone (2): " + this.telefone2;
  }

  public String getEmail() {
    return "E-mail pessoal: " + this.emailPessoal + "\nE-mail corporativo: " + this.emailCorporativo;
  }

  public void setCtps(String ctps) {
    this.ctps = ctps;
  }

  public void setPis(String pis) {
    this.pis = pis;
  }
  
  public void setTituloEleitor(String tituloEleitor) {
    this.tituloEleitor = tituloEleitor;
  }

  public void setReservista(boolean reservista) {
    this.reservista = reservista;
  }

  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public void setNumDependentes(int numDependentes) {
    this.numDependentes = numDependentes;
  }

  public void setAtivo(boolean ativo) {
    this.ativo = ativo;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public void setTelefone1(String telefone1) {
    this.telefone1 = telefone1;
  }

  public void setTelefone2(String telefone2) {
    this.telefone2 = telefone2;
  }

  public void setEmailPessoal(String emailPessoal) {
    this.emailPessoal = emailPessoal;
  }

  public void setEmailCorporativo(String emailCorporativo) {
    this.emailCorporativo = emailCorporativo;
  }

  public void admitir() {
    this.ativo = true;
  }

  public void demitir() {
    this.ativo = false;
  }
}
