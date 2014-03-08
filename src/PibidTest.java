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
		Coordenador coo= new Coordenador("Ana Liz","12345678");
		pibid.cadastraCoordenador(coo);
		List<Coordenador> lista = pibid.getListaDeCoordenadoresCriados();
		assertEquals(1,lista.size());
		assertEquals(coo, lista.get(0));
	}
	
	
}
