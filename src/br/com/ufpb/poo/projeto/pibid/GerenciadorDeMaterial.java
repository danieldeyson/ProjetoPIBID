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
	
	public void removerMaterial (String codMaterial){
		boolean removeu = false;
		for(Material m: this.materiais){
			if(m.getCodMaterial().equals(codMaterial)){
				this.materiais.remove(m);
				removeu = true;
			}
		}
		if(removeu == false){
			throw new MaterialInexistenteException("Material Inexistente!");
		}
	}
	
	public Material pesquisarMaterial(String codigoMaterial){
		for(Material m: this.materiais){
			if(m.getCodMaterial().equals(codigoMaterial)){
				return m;
			}
		}
		throw new MaterialInexistenteException ("Material Inexistente!");		
	}
	
}
