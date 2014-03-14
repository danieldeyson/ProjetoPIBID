package br.com.ufpb.poo.projeto.pibid;
import java.util.List;

public class Pibid {
	
	private GerenciadorPibid gerenciador;
	
	
	public Pibid(){
		this.gerenciador= new GerenciadorPibid();	
	}
	
	public void adicionarTarefaAoGrupo(Tarefa t, Grupo g){
		this.gerenciador.adicionarTarefaAoGrupo(t, g);
	}
	
	public void cadastraCoordenador(Coordenador coord){
		this.gerenciador.cadastraCoordenador(coord);	
	}
	
	public void cadastrarAluno(Aluno aluno){
		this.gerenciador.cadastraAluno(aluno);
	}
	
	public void cadastrarTarefa(Tarefa tarefa){
		this.gerenciador.cadastraTarefa(tarefa);
	}
	
	public void cadastrarGrupo(Grupo grupo) {
		this.gerenciador.cadastrarGrupo(grupo);
	}
	
	public void cadastrarAlunosEmGrupo(){
		this.gerenciador.cadastrarAlunosEmGrupo();
	}
	
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return this.gerenciador.getListaDeCoordenadoresCriados();
	}
	
	public List<Aluno> getListaDeAlunosCriados(){
		return this.gerenciador.getListaDeAlunosCriados();
	}

	public List<Tarefa> getListaDeTarefas() {
		return this.gerenciador.getListaDeTarefas();
	}
	
	public Grupo pesquisarGrupo(String codigo){
		return this.gerenciador.pesquisarGrupo(codigo);
	}
	
	public Aluno pesquisaAluno(String matricula){
		return this.gerenciador.pesquisaAluno(matricula);
	}
	public Coordenador pesquisarCoordenador(String siape){
		return this.gerenciador.pesquisarCoordenador(siape);
	}
	
	public void removerAlunoPelaMatricula(String matricula){
		this.gerenciador.removerAlunoPelaMatricula(matricula);
	}
	
	public void removerCoordenadorPeloSiape(String siape){
		this.gerenciador.removerCoordenadorPeloSiape(siape);
	}

	public void cadastrarParticipante(Aluno a,Grupo g) {
		this.gerenciador.cadastrarParticipante(a,g);
		
	}
}
 