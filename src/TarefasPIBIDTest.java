import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TarefasPIBIDTest {
	
	Tarefa tarefa;
	
	@Before
	public void Inicializar() {
		this.tarefa = new Tarefa();
	}
	
	@Test
	public void verificarTarefaCriada(){
		assertNotNull(this.tarefa);
	}

	

}
