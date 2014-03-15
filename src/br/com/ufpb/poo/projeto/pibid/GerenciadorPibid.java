package br.com.ufpb.poo.projeto.pibid;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class GerenciadorPibid{
	
	private List<Aluno> alunos=new LinkedList<Aluno>();
	private List<Coordenador> coordenadores=new LinkedList<Coordenador>();
	private List<Grupo> grupos= new LinkedList<Grupo>();
	private List<Tarefa> tarefas= new LinkedList<Tarefa>();
	private Grupo grupo;
	
	//PARTE DE CADASTRO
	public void cadastraAluno(Aluno aluno){
		boolean existe=false;
		for (Aluno a: this.alunos){
			if(a.getMatricula().equals(aluno.getMatricula())){
				existe=true;
				break;
			}
		}
		if(existe==false){
			this.alunos.add(aluno);
		}
		else{
			throw new AlunoExistenteException("Aluno Existente!");
		}
	}
	
	public void cadastraCoordenador(Coordenador coo1) {
		boolean existe=false;
		for (Coordenador c: this.coordenadores){
			if(c.getMatricula().equals(coo1.getMatricula())){
				existe=true;
				break;
			}
		}
		if(existe==false){
			this.coordenadores.add(coo1);
		}
		else{
			throw new CoordenadorExistenteException("Coordenador Existente!");
		}
	}
	
	public void cadastrarParticipante(Aluno a,Grupo g) {
		g.cadastrarParticipante(a);
		
	}
	
	public void cadastrarGrupo(Grupo grupo){
		this.grupos.add(grupo);
	}
	
	public void cadastraTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);	
	}
	
	public void cadastrarAlunosEmGrupo(){
		Tarefa t = new Tarefa("Ministrar curso de Scratch");
		Grupo g = new Grupo(t,"123");
		Aluno a = new Aluno("Deyvison","12234576");
		Aluno a1 = new Aluno("Tayna","53344545");
		g.cadastrarParticipante(a);
		g.cadastrarParticipante(a1);
	}
	
    //PARTE DE ADICIONAR
	public void adicionarTarefaAoGrupo(Tarefa t, Grupo g){
		for(Grupo x: this.grupos){
			if(x.getCodigoGrupo().equals(g.getCodigoGrupo())){
				x.listTarefas().add(t);
				break;
				
			}
		}		
	}
	
	// PARTE DE GETS
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return this.coordenadores;	
	}

	public List<Aluno> getListaDeAlunosCriados(){
		return this.alunos;
	}
	
	public List<Tarefa> getListaDeTarefas() {
		return this.tarefas;
	}
	
	public List<Grupo> getListaDeGrupos(){
		return this.grupos;
	}
	
	//PARTE DE PESQUISAS
	public Grupo pesquisarGrupo(String codigo){
		for(Grupo i: this.grupos){
			if(i.getCodigoGrupo().equals(codigo)){
				return i;
			}
		}
		return null;
	}
	
	public Aluno pesquisaAluno(String matricula){
		
		for ( Aluno a: alunos){
			if(a.getMatricula().equals(matricula)){
				
				return a;
			}
		}
		throw new AlunoInexistenteException ("Aluno Inexistente!");
	}

	public Coordenador pesquisarCoordenador(String siape){
		
		for ( Coordenador c: this.coordenadores){
			if ( c.getMatricula().equals(siape)){
				return c;
			}
		}
		throw new CoordenadorInexistenteException ("Coordenador Inexistente!");
	}
    
	public Tarefa pesquisarTarefa(Tarefa t){
		for (Tarefa x : this.tarefas) {
			if (x.getDescricao().equals(t.getDescricao())) {
				return x;
			}
		}
		return null;
	}
	//PARTE DE REMO��O
	public void removerAlunoPelaMatricula(String matricula) {
		
		boolean removeu = false;
		
		for (Aluno x: this.alunos){
			
			if (x.getMatricula().equals(matricula)){
				removeu = true;
				this.alunos.remove(x);
				break;
			}
			
			
		}
		if(removeu ==false){
			throw new AlunoInexistenteException("Imposs�vel remover, pois n�o existe!");
		}
			
	}
	
	public void removerCoordenadorPeloSiape(String siape){
		boolean removeu = false;
		
		for (Coordenador c: this.coordenadores){
			
			if(c.getMatricula().equals(siape)){
				removeu = true;
				this.coordenadores.remove(c);
				break;
			}
		}
		if(removeu == false){
			throw new CoordenadorInexistenteException("Imposs�vel remover, pois n�o existe!");
		}
	}
	
	public void removerTarefaDoGrupo(Tarefa t, Grupo g){
		for(Grupo x: this.grupos){
			if(x.getCodigoGrupo().equals(g.getCodigoGrupo())){
				for(Tarefa y: this.tarefas){
					if(y.getDescricao().equalsIgnoreCase(t.getDescricao())){
						this.tarefas.remove(t);
						
					}
				}
				
				
			}
		}	
		
	}
		
}
