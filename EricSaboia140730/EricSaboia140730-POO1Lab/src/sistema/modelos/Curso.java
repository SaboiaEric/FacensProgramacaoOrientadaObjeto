package sistema.modelos;

import java.util.ArrayList;

public class Curso{
	private int codigo;
	private String nome;
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;
	
	/*M�todos b�sicos*/
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	/*Fim M�todos b�sicos*/
	
	

}
