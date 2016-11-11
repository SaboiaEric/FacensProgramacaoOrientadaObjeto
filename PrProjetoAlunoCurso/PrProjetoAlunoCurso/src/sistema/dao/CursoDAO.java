package sistema.dao;

import java.util.ArrayList;

import sistema.entidades.*;

public class CursoDAO {
	
	public ArrayList<Curso> cursos = new ArrayList<Curso>();

	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	
	public void salvar (Curso curso)
	{
		cursos.add(curso);
	}
	
	public Curso getCursoById (int idCurso)
	{
		for(int i=0; i< cursos.size(); i++)
			if(idCurso == cursos.get(i).getIdentificador())
				return cursos.get(i);
		
		return null;
	}
	
	public void deletarAluno(int ra)
	{
		for(int i=0; i< cursos.size(); i++)
			if(ra == cursos.get(i).getAl(i).getRa())
				cursos.remove(i);
	}
}
