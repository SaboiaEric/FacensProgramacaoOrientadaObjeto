package sistema.mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.DAO.AlunoDAO;
import sistema.DAO.CursoDAO;
import sistema.modelos.Aluno;
import sistema.modelos.Curso;

@ManagedBean(name="mbAluno")
@SessionScoped
public class AlunoManagedBean {
	private AlunoDAO alunoDAO = new AlunoDAO();
    private Aluno novoAluno = new Aluno();
    private Aluno AlunoAtual;
    
    /*GETS AND SETS*/
	public AlunoDAO getAlunoDAO() {
		return alunoDAO;
	}
	public void setAlunoDAO(AlunoDAO alunoDAO) {
		this.alunoDAO = alunoDAO;
	}
	public Aluno getNovoAluno() {
		return novoAluno;
	}
	public void setNovoAluno(Aluno novoAluno) {
		this.novoAluno = novoAluno;
	}
	public Aluno getAlunoAtual() {
		return AlunoAtual;
	}
	public void setAlunoAtual(Aluno alunoAtual) {
		AlunoAtual = alunoAtual;
	}
	/*FIM GETS AND SETS*/
	
	/*BOT�ES GERAL*/
	public String salvar(){
		alunoDAO.salvar(novoAluno);
		novoAluno = new Aluno();
		return "menu";
	}
	/*FIM BOT�ES GERAL*/
	
	/*Retonar um ArrayList de ALUNO cadastrado da ALUNODAO*/
	public ArrayList<Aluno> getAlunos()
	{
		return alunoDAO.getAlunos();
	}

}
