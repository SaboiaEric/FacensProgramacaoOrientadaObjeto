package sistema.mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.DAO.CursoDAO;
import sistema.modelos.Curso;

@ManagedBean(name="mbCurso")
@SessionScoped
public class CursoManagedBean {
	private CursoDAO cursoDAO = new CursoDAO();
    private Curso novoCurso = new Curso();
    private Curso cursoAtual;
    
    /*GETS AND SETS*/
	public CursoDAO getCursoDAO() {
		return cursoDAO;
	}
	public void setCursoDAO(CursoDAO cursoDAO) {
		this.cursoDAO = cursoDAO;
	}
	public Curso getNovoCurso() {
		return novoCurso;
	}
	public void setNovoCurso(Curso novoCurso) {
		this.novoCurso = novoCurso;
	}
	public Curso getCursoAtual() {
		return cursoAtual;
	}
	public void setCursoAtual(Curso cursoAtual) {
		this.cursoAtual = cursoAtual;
	}
	/*FIM GETS AND SETS*/
	
	/*BOTÕES GERAIS*/
	public String salvar(){
		cursoDAO.salvar(novoCurso);
		novoCurso = new Curso();
		return "menu";
	}
	/*FIM BOTÕES GERAIS*/
	
	/*Retonar um ArrayList de Curso cadastrado da CursoDAO*/
	public ArrayList<Curso> getCursos()
	{
		return cursoDAO.getCursos();
	}
    
}
