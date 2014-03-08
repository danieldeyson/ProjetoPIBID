import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PibidTest {
	Pibid pibid;
	
	@Before
	public void Inicializar() {
		this.pibid = new Pibid();
	}
	
	@Test
	public void cadastraCoordenadorTest(){
		Coordenador coord= new Coordenador("Ana Liz","12345678");
		pibid.cadastraCoordenador(coord);
		List<Coordenador> lista = pibid.getListaDeCoordenadoresCriados();
		assertEquals(1,lista.size());
		assertEquals(coord, lista.get(0));
	}
	
	@Test
	public void cadastraAlunoTest(){
		Aluno aluno= new Aluno("Luana Costa","81211021");
		pibid.cadastrarAluno(aluno);
		List<Aluno> list=pibid.getListaDeAlunosCriados();
		assertEquals(1,list.size());
		assertEquals(aluno,list.get(0));
	}
	
	@Test
	public void cadastrarTarefasTest(){
		Aluno aluno=new Aluno("Deyvison","81212121");
		Tarefa tarefa=new Tarefa(aluno,"Elaborar Apostilas");
		pibid.cadastrarTarefa(tarefa);
		List<Tarefa> lista=pibid.getListaDeTarefas();
		assertEquals(1,lista.size());
		assertEquals(tarefa,lista.get(0));
	}
	
}
