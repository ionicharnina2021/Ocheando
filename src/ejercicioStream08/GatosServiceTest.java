package ejercicioStream08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GatosServiceTest {
	GatosService gatosService;
	
	@BeforeEach
	public void beforeEach() {
		gatosService = new GatosService();
	}
	
	@Test
	void testAddOneThousandCats()  {
		assertTrue(gatosService.addOneThousandCats());
	}
	
	@Test
	void testCatsByRace() {
		gatosService.addOneThousandCats();
	}
	
}
