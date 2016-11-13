package sistema.entidades;

import java.util.ArrayList;

public class Curso {
	
	private int identificador;
	private String descricao;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	public void addAluno(Aluno aluno)
	{
		alunos.add(aluno);
	}
	
	public Aluno getAl(int i)
	{
		return alunos.get(i);
	}
	
	public Professor getProfessor(int i ){
		return professores.get(i);
	}
	
	public void addProfessor(Professor professor){
		professores.add(professor);
	}
	
	public ArrayList<Professor> getProfessores(){
		return professores;
	}
	
	public void removeAluno(int aluno){
		alunos.remove(aluno);
	
	}
}