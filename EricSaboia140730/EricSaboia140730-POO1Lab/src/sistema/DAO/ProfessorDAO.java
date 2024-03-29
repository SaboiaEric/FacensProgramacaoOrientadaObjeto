package sistema.DAO;

import java.util.ArrayList;

import sistema.modelos.Professor;

public class ProfessorDAO {
	private ArrayList<Professor> professores = new ArrayList<Professor>();

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void salvar(Professor professor){
		professores.add(professor);
	}
	
	public Professor getProfessorById(int idProfessor){
		for(int i=0; i< professores.size(); i++)
			if(idProfessor == professores.get(i).getNumero())
				return professores.get(i);
		
		return null;
	}
	
}
