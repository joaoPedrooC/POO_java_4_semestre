package Aula07.Exercicio07;

import java.util.ArrayList;

public class Departamento {
  private int codigo_departamento;
  public String nome;

  ArrayList<Usuario> usuarios;
  ArrayList<Tecnico> tecnicos;

  public Departamento(int codigo_departamento, String nome) {
    this.codigo_departamento = codigo_departamento;
    this.nome = nome;

    this.usuarios = new ArrayList<Usuario>();
    this.tecnicos = new ArrayList<Tecnico>();
  }

  public void adicionar_usuario(Usuario usuario) {
    this.usuarios.add(usuario);
  }

  public void adicionar_tecnico(Tecnico tecnico) {
    this.tecnicos.add(tecnico);
  }

  public int get_codigo_departamento() {
    return this.codigo_departamento;
  }

  public ArrayList<Usuario> get_usuarios() {
    return this.usuarios;
  }

  public ArrayList<Tecnico> get_tecnicos() {
    return this.tecnicos;
  }
}
