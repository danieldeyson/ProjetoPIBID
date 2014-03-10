import java.util.List;

public class Pibid {
	private GerenciadorPibid gerenciador;
	
	public Pibid(){
		this.gerenciador= new GerenciadorPibid();	
	}
	
	public void cadastraCoordenador(Coordenador coord){
		gerenciador.cadastraCoordenador(coord);	
	}
	
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return gerenciador.getListaDeCoordenadoresCriados();
	}
	public void cadastrarAluno(Aluno aluno){
		gerenciador.cadastraAluno(aluno);
	}
	public List<Aluno> getListaDeAlunosCriados(){
		return gerenciador.getListaDeAlunosCriados();
	}

	public List<Tarefa> getListaDeTarefas() {
		return gerenciador.getListaDeTarefas();
	}
	public void cadastrarTarefa(Tarefa tarefa){
		gerenciador.cadastraTarefa(tarefa);
	}
	public void removerAluno(Aluno a){
		gerenciador.removerAluno(a);
	}
	public void removerCoordenador(Coordenador c){
		gerenciador.removerCoordenador(c);
	}
	
}
 