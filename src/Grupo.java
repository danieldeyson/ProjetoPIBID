import java.util.List;

public class Grupo {
	private Tarefa tarefa;
	private String codigoGrupo;
	private List <Aluno> alunos;
	public Grupo(Tarefa tarefa, String codigoGrupo){
		this.tarefa = tarefa;
		this.codigoGrupo=codigoGrupo;
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
	public String getCodigoGrupo(){
		return this.codigoGrupo;
	}
}
 