package sistema.DAO;

import java.util.ArrayList;

import sistema.modelos.Aluno;

public class AlunoDAO {
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void salvar(Aluno aluno){
		alunos.add(aluno);
	}
	
	//Retonar o curso com ID idAluno
	public Aluno getAlunoById (int idAluno)
	{
			for(int i=0; i< alunos.size(); i++)
				if(idAluno == alunos.get(i).getMatricula())
					return alunos.get(i);
			
			return null;
	}
}
