import java.util.LinkedList;
import java.util.List;

public class GerenciadorPibid{
	private List<Aluno> alunos=new LinkedList<Aluno>();
	private List<Coordenador> coordenadores=new LinkedList<Coordenador>();

	public void cadastraCoordenador(Coordenador coo1) {
		this.coordenadores.add(coo1);
		
	}
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return this.coordenadores;
		
	}

}
