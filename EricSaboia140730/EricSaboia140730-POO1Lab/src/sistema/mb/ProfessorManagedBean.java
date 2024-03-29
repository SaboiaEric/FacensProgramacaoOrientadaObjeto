package sistema.mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.DAO.ProfessorDAO;
import sistema.modelos.Professor;


@ManagedBean(name="mbProfessor")
@SessionScoped
public class ProfessorManagedBean {
	private ProfessorDAO professorDAO = new ProfessorDAO();
    private Professor novoProfessor = new Professor();
    private Professor ProfessorAtual;
    
    /*GET AND SETS*/
	public ProfessorDAO getProfessorDAO() {
		return professorDAO;
	}

	public void setProfessorDAO(ProfessorDAO professorDAO) {
		this.professorDAO = professorDAO;
	}

	public Professor getNovoProfessor() {
		return novoProfessor;
	}

	public void setNovoProfessor(Professor novoProfessor) {
		this.novoProfessor = novoProfessor;
	}

	public Professor getProfessorAtual() {
		return ProfessorAtual;
	}

	public void setProfessorAtual(Professor professorAtual) {
		ProfessorAtual = professorAtual;
	}
    /*FIM GET AND SETS*/
    
	/*BOT�ES GERAL*/
	public String salvar(){
		professorDAO.salvar(novoProfessor);
		novoProfessor = new Professor();
		return "menu";
	}
	/*FIM BOT�ES GERAL*/

	/*Retonar um ArrayList de PROFESSOR cadastrado na professorDAO*/
	public ArrayList<Professor> getProfessores()
	{
		return professorDAO.getProfessores();
	}

}
