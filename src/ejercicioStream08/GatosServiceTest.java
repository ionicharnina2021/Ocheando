package ejercicioStream08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		Stream<Gato> stream = gatosService.getGatos().stream();
		System.out.println();
		
	}
	
	@Test
	void testCatsByRace() {
		gatosService.addOneThousandCats();
	}
	
}
