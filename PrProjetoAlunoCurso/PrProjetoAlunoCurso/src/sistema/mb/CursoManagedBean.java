package sistema.mb;

import java.util.ArrayList;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import sistema.dao.CursoDAO;
import sistema.entidades.Curso;
import sistema.entidades.Aluno;

@ManagedBean(name="mbCurso")
@SessionScoped

public class CursoManagedBean {
	
	private CursoDAO cursoDAO = new CursoDAO();
    private Curso novoCurso = new Curso();
    private Aluno  novoAluno;
    private Curso cursoAtual;
    
    public String salvar()
    {
    	cursoDAO.salvar(novoCurso);
		novoCurso = new Curso();
		return "menu";
    }
    
    public ArrayList <Curso> getCursos()
	{
		return cursoDAO.getCursos();
	}
    
    public String deletarAluno(String idCurso)
    {
    	cursoDAO.deletarAluno(Integer.parseInt(idCurso));
    	return "listarAlunosCursos";
    }
    
    public String verAlunos(String idCurso)
	{
		cursoAtual = cursoDAO.getCursoById(Integer.parseInt(idCurso));
		return "listarAlunosCursos";
	}
	
	public String criarAluno()
	{
		novoAluno = new Aluno();
		return "cadastroAluno";
		
	}
	
	
	public String salvarAluno()
	{
		cursoAtual.addAluno(novoAluno);
		novoAluno.setCurso(cursoAtual);
		return "listarAlunosCursos";
		
	}

	public Curso getNovoCurso() {
		return novoCurso;
	}

	public void setNovoCurso(Curso novoCurso) {
		this.novoCurso = novoCurso;
	}

	public Aluno getNovoAluno() {
		return novoAluno;
	}

	public void setNovoAluno(Aluno novoAluno) {
		this.novoAluno = novoAluno;
	}

	public Curso getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(Curso cursoAtual) {
		this.cursoAtual = cursoAtual;
	}
	
	public String deletarAluno(int idAluno){
		cursoAtual.removeAluno(idAluno);
		
		return "listarAlunosCursos";
	}
	

}
