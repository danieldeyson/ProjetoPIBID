import java.util.List;

public class Grupo {
	private Tarefa tarefa;
	private List <Aluno> alunos;
	public Grupo(Tarefa tarefa, List <Aluno> alunos){
		this.tarefa = tarefa;
		this.alunos = alunos;
	}
	public String getDescricao(){
		String aluno = "";
		for (Aluno t: this.alunos){
			aluno += t.getNome() + "\n";
		}
		return "Tarefa: " + this.tarefa + "\n Alunos: "+aluno ;
	}
	public String toString(){
		return getDescricao();
	}
}
 