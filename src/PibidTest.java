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
	
	@Test(expected = CoordenadorExistenteException.class)
	public void testarCadastroCoordenadorDuplicadoTest() throws CoordenadorExistenteException{
		Coordenador coord = new Coordenador("Ana Liz","12345678");
		Coordenador coord2 = new Coordenador("Ana Liz","12345678");
		pibid.cadastraCoordenador(coord);
		pibid.cadastraCoordenador(coord2);
		
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
		pibid.cadastrarGrupo(g);
		List<Tarefa> lista=pibid.getListaDeTarefas();
		assertEquals(1,lista.size());
		assertEquals(tarefa,lista.get(0));
	}
	
	@Test 
	public void cadastrarAlunosEmGrupoTest(){
		Tarefa t = new Tarefa("Ministrar curso de Scratch");
		Grupo g = new Grupo(t,"123");
		pibid.cadastrarGrupo(g);
		Aluno a = new Aluno("Deyvison","12234576");
		Aluno a1 = new Aluno("Tayna","53344545");
		g.cadastrarParticipante(a);
		g.cadastrarParticipante(a1);
		List<Aluno> participantes = g.listParticipantes();
		assertEquals(2, participantes.size());
		assertEquals(a, participantes.get(0));
		assertEquals(a1, participantes.get(1));	
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
	
	@Test
	public void pesquisaAlunoTest(){
		Aluno a = new Aluno("Luana","81211067");
		pibid.cadastrarAluno(a);
		assertEquals(a,pibid.pesquisaAluno("81211067"));	
	}
	
	@Test(expected = AlunoInexistenteException.class)
	public void removerAlunoPelaMatriculaTest() throws AlunoInexistenteException{
		Aluno a= new Aluno("Luana","81211021");
		pibid.removerAlunoPelaMatricula(a.getMatricula());
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
}
