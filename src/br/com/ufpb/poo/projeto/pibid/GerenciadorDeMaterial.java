package br.com.ufpb.poo.projeto.pibid;

import java.util.LinkedList;
import java.util.List;

public class GerenciadorDeMaterial {
	private List<Material> materiais = new LinkedList<Material>();
	
	public void cadastrarMaterial(Material material){
			this.materiais.add(material);
	}
	
	public List <Material> getListaDeMateriais(){
		return this.materiais;
	}
	
}
