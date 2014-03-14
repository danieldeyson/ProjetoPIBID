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
	
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return this.coordenadores;	
	}
	
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
	
	public List<Aluno> getListaDeAlunosCriados(){
		return this.alunos;
	}
	
	public void cadastraTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);	
	}
	
	public List<Tarefa> getListaDeTarefas() {
		return this.tarefas;
	}
	
	public void cadastrarGrupo(Grupo grupo){
		this.grupos.add(grupo);
	}
	
	public List<Grupo> getListaDeGrupos(){
		return this.grupos;
	}
	
	public void cadastrarAlunosEmGrupo(){
		//TERMINAR
	}
	
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
	public void removerAlunoPelaMatricula(String matricula) {
		
		boolean removeu = false;
		
		for (Aluno x: this.alunos){
			
			if (x.getMatricula().equals(matricula)){
				removeu = true;
				this.alunos.remove(x);
			}
			
			
		}
		if(removeu ==false){
			throw new AlunoInexistenteException("Impossível remover, pois não existe!");
		}
			
	}
	
	public void removerCoordenadorPeloSiape(String siape){
		boolean removeu = false;
		
		for (Coordenador c: this.coordenadores){
			
			if(c.getMatricula().equals(siape)){
				removeu = true;
				this.coordenadores.remove(c);
			}
		}
		if(removeu == false){
			throw new CoordenadorInexistenteException("Impossível remover, pois não existe!");
		}
	}

	public void cadastrarParticipante(Aluno a,Grupo g) {
		g.cadastrarParticipante(a);
		
	}	
}
