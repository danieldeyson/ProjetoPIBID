public class Pibid {
	private GerenciadorPibid gerenciador;
	
	public Pibid(){
		this.gerenciador= new GerenciadorPibid();	
	}
	
	public void CadastraCoordenador(Coordenador coo){
		gerenciador.CadastraCoordenador(coo);	
	}
	

}
