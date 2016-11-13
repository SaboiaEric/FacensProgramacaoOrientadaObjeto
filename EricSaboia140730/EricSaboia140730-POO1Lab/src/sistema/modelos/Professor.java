package sistema.modelos;

import java.util.ArrayList;

public class Professor extends Pessoa{
	private int numero;
	private String nome;
	private ArrayList<Curso> cursos;
	
	/*Métodos básicos*/
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}


	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	/*Fim Métodos básicos*/
	
	
}
