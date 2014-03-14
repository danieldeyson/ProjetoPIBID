package br.com.ufpb.poo.projeto.pibid;
public class Tarefa{
	private String descricao;
	
	public Tarefa(String descricao){
		this.descricao = descricao;
	}
	
	@Override
	public String toString(){
		return this.descricao;
	}
}
