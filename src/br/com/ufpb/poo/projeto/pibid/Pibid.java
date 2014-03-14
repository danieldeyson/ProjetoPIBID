package br.com.ufpb.poo.projeto.pibid;
import java.util.List;

public class Pibid {
	
	private GerenciadorPibid gerenciador;
	
	
	public Pibid(){
		this.gerenciador= new GerenciadorPibid();	
	}
	
	public void cadastraCoordenador(Coordenador coord){
		gerenciador.cadastraCoordenador(coord);	
	}
	
	public void cadastrarAluno(Aluno aluno){
		gerenciador.cadastraAluno(aluno);
	}
	
	public void cadastrarTarefa(Tarefa tarefa){
		gerenciador.cadastraTarefa(tarefa);
	}
	
	public void cadastrarGrupo(Grupo grupo) {
		gerenciador.cadastrarGrupo(grupo);
	}
	
	public void cadastrarAlunosEmGrupo(){
		gerenciador.cadastrarAlunosEmGrupo();
	}
	
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return gerenciador.getListaDeCoordenadoresCriados();
	}
	
	public List<Aluno> getListaDeAlunosCriados(){
		return gerenciador.getListaDeAlunosCriados();
	}

	public List<Tarefa> getListaDeTarefas() {
		return gerenciador.getListaDeTarefas();
	}
	
	public Grupo pesquisarGrupo(String codigo){
		return gerenciador.pesquisarGrupo(codigo);
	}
	
	public Aluno pesquisaAluno(String matricula){
		return gerenciador.pesquisaAluno(matricula);
	}
	
	public void removerAlunoPelaMatricula(String matricula)throws AlunoInexistenteException{
		gerenciador.removerAlunoPelaMatricula(matricula);
	}
	
	public void removerCoordenador(Coordenador c){
		gerenciador.removerCoordenador(c);
	}

	public void cadastrarParticipante(Aluno a,Grupo g) {
		this.gerenciador.cadastrarParticipante(a,g);
		
	}
}
 