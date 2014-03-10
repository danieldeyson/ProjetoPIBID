import java.util.LinkedList;
import java.util.List;

public class GerenciadorPibid{
	private List<Aluno> alunos=new LinkedList<Aluno>();
	private List<Coordenador> coordenadores=new LinkedList<Coordenador>();
	private List<Grupo> grupos= new LinkedList<Grupo>();
	private List<Tarefa> tarefas= new LinkedList<Tarefa>();

	public void cadastraCoordenador(Coordenador coo1) {
		this.coordenadores.add(coo1);
		
	}
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return this.coordenadores;	
	}
	public void cadastraAluno(Aluno aluno){
		this.alunos.add(aluno);
	}
	public List<Aluno> getListaDeAlunosCriados(){
		return this.alunos;
	}
	public List<Tarefa> getListaDeTarefas() {
		return this.tarefas;
	}
	public void cadastraTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);
		
	}
	public void removerAluno(Aluno a){
		this.alunos.remove(a);
	}
	public void removerCoordenador(Coordenador c){
		this.coordenadores.remove(c);
	}

}
