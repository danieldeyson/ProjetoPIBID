import static org.junit.Assert.*;
import java.util.LinkedList;
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
		Tarefa tarefa=new Tarefa("Ministrar aula de HTML");
		Grupo g = new Grupo(tarefa,"01");
		pibid.cadastrarTarefa(tarefa);
		List<Tarefa> lista=pibid.getListaDeTarefas();
		assertEquals(1,lista.size());
		assertEquals(tarefa,lista.get(0));
	}
	
	@Test
	public void removerAlunoTest(){
		Aluno a= new Aluno("Luana","81211021");
		pibid.removerAluno(a);
		List<Aluno> alunos = pibid.getListaDeAlunosCriados();
		assertEquals(0,alunos.size());
		
	}
	
	@Test
	public void removerCoordenadorTest(){
		Coordenador c= new Coordenador("Ana Liz","12345678");
		pibid.removerCoordenador(c);
		List<Coordenador> coord = pibid.getListaDeCoordenadoresCriados();
		assertEquals(0,coord.size());
		
	}
	
	@Test
	public void cadastrarGrupoTest(){
		Tarefa tarefa = new Tarefa("Ministrar Aula de Python");
		Grupo grupo = new Grupo(tarefa,"012");
		pibid.cadastrarGrupo(grupo);
		assertEquals(grupo,pibid.pesquisarGrupo("012"));
	}
	
	@Test
	public void pesquisarGrupoInexistenteTest(){
		Tarefa t = new Tarefa("Ministrar curso de HTML");
		Grupo g = new Grupo(t,"123");
		pibid.cadastrarGrupo(g);
		assertNull(pibid.pesquisarGrupo("321"));
	}

}
