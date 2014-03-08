import java.util.List;

public class Pibid {
	private GerenciadorPibid gerenciador;
	
	public Pibid(){
		this.gerenciador= new GerenciadorPibid();	
	}
	
	public void cadastraCoordenador(Coordenador coo){
		gerenciador.cadastraCoordenador(coo);	
	}
	
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return gerenciador.getListaDeCoordenadoresCriados();
	}


}
 