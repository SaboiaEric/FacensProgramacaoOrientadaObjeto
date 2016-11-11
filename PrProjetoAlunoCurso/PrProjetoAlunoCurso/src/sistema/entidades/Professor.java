package sistema.entidades;

import java.util.ArrayList;

public class Professor {
	 private int numero;
	 private String nome;
	 private ArrayList<Curso> cursos;

	 public Professor(){
	   
	 }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	 
}
