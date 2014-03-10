import java.util.LinkedList;
import java.util.List;

public class Grupo {
	private Tarefa tarefa;
	private String codigoGrupo;
	private List <Aluno> participantes;
	
	public Grupo(Tarefa tarefa, String codigoGrupo){
		this.tarefa = tarefa;
		this.codigoGrupo=codigoGrupo;
		this.participantes = new LinkedList<Aluno>();
	}
	public String getDescricao(){
		String aluno = "";
		for (Aluno t: this.participantes){
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
	public void cadastrarParticipante(Aluno a) {
		this.participantes.add(a);
		
	}
	public List<Aluno> listParticipantes(){
		return this.participantes;
	}
	
}
 