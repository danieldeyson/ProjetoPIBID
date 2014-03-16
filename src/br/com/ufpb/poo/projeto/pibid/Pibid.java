package br.com.ufpb.poo.projeto.pibid;
import java.util.List;

public class Pibid {
	
	private GerenciadorPibid gerenciador;
	private GerenciadorDeMaterial gerenciadorMaterial;
	
	public Pibid(){
		this.gerenciador= new GerenciadorPibid();
		this.gerenciadorMaterial = new GerenciadorDeMaterial();
	}
	
	//PARTE DE CADASTROS
	public void cadastrarAluno(Aluno aluno){
		this.gerenciador.cadastraAluno(aluno);
	}
	
	public void cadastraCoordenador(Coordenador coord){
		this.gerenciador.cadastraCoordenador(coord);	
	}
	
	public void cadastrarAlunosEmGrupo(){
		this.gerenciador.cadastrarAlunosEmGrupo();
	}
	
	public void cadastrarTarefa(Tarefa tarefa){
		this.gerenciador.cadastraTarefa(tarefa);
	}
	
	public void cadastrarGrupo(Grupo grupo) {
		this.gerenciador.cadastrarGrupo(grupo);
	}
	
	public void cadastrarParticipante(Aluno a,Grupo g) {
		this.gerenciador.cadastrarParticipante(a,g);
		
	}
	
	public void cadastrarMaterial(Material m){
		this.gerenciadorMaterial.cadastrarMaterial(m);
	}

	//PARTE DE ADICIONAR
	public void adicionarTarefaAoGrupo(Tarefa t, Grupo g){
		this.gerenciador.adicionarTarefaAoGrupo(t, g);
	}
	
	public void adicionarQuantidadeDeMaterial(String codigo, int quantidade){
		this.gerenciadorMaterial.adicionarQuantidadeDeMaterial(codigo, quantidade);
	}
	
	// PARTE DE GETS
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return this.gerenciador.getListaDeCoordenadoresCriados();
	}
	
	public List<Aluno> getListaDeAlunosCriados(){
		return this.gerenciador.getListaDeAlunosCriados();
	}

	public List<Tarefa> getListaDeTarefas() {
		return this.gerenciador.getListaDeTarefas();
	}
	
	public List<Grupo> getListaDeGrupo(){
		return this.gerenciador.getListaDeGrupos();
	}
	
	public List<Tarefa> getListaDeTarefasCadastradasEmUmGrupo(Grupo g) {
		return this.gerenciador.getListaDeTarefasCadastradasEmUmGrupo(g);
	}
	
	public List <Material> getListaDeMateriais (){
		return this.gerenciadorMaterial.getListaDeMateriais();
	}
	
	public Material getMaterial (String codigo){
		return this.gerenciadorMaterial.getMaterial(codigo);
	}
	// PARTE DE PESQUISAS
	public Grupo pesquisarGrupo(String codigo){
		return this.gerenciador.pesquisarGrupo(codigo);
	}
	
	public Aluno pesquisaAluno(String matricula){
		return this.gerenciador.pesquisaAluno(matricula);
	}
	
	public Coordenador pesquisarCoordenador(String siape){
		return this.gerenciador.pesquisarCoordenador(siape);
	}
	
	public Tarefa pesquisarTarefa(String codTarefa){
		return this.gerenciador.pesquisarTarefa(codTarefa);
	}
	
	public Material pesquisarMaterial (String codMaterial){
		return this.gerenciadorMaterial.pesquisarMaterial(codMaterial);
	}

	// PARTE DE REMOÇÕES
	public void removerAlunoPelaMatricula(String matricula){
		this.gerenciador.removerAlunoPelaMatricula(matricula);
	}
	
	public void removerCoordenadorPeloSiape(String siape){
		this.gerenciador.removerCoordenadorPeloSiape(siape);
	}
	public void removerTarefa(String cod) {
		this.gerenciador.removerTarefa(cod);
	}
	public void removerTarefaDoGrupo(Tarefa t, Grupo g){
		this.gerenciador.removerTarefaDoGrupo(t,g);
	}
	
	public void removerMaterial(String codMaterial){
		this.gerenciadorMaterial.removerMaterial(codMaterial);
	}

}
 