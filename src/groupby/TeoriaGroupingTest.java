package groupby;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import ejercicioStream08.Raza;

class TeoriaGroupingTest {
	TeoriaGrouping teoriaGroping=new TeoriaGrouping();
	TeoriaGrouping2 teoriaGrouping2=new TeoriaGrouping2();

	@Test
	void testTeoriaUno() {
		teoriaGrouping2.teoriaUno();
		teoriaGrouping2.teoriaDos();
	}
	@Test
	void testFindCatsByRaceUno() {
		Map<Raza, Long> mapResult = teoriaGroping.findCatsByRaceUno();
		int thousand = 1000;
		assertEquals(thousand,mapResult.entrySet().stream()
				.mapToLong((entry)
						-> {return Long.valueOf(entry.getValue());})
				.sum());
	}
	@Test
	void testFindCatsByRaceDos() {
		Map<Raza, Long> mapResult = teoriaGroping.findCatsByRaceDos();
		int thousand = 1000;
		assertEquals(thousand,mapResult.entrySet().stream()
				.mapToLong((entry)
						-> {return Long.valueOf(entry.getValue());})
				.sum());
	}
	@Test
	void testFindCatsByRaceTres() {
		Map<Raza, Long> mapResult = teoriaGroping.findCatsByRaceTres();
		int thousand = 1000;
		assertEquals(thousand,mapResult.entrySet().stream()
				.mapToLong((entry)
						-> {return Long.valueOf(entry.getValue());})
				.sum());
	}
	@Test
	void testFindCatsByRaceCuatro() {
		Map<Raza, Long> mapResult = teoriaGroping.findCatsByRaceCuatro();
		int thousand = 1000;
		assertEquals(thousand,mapResult.entrySet().stream()
				.mapToLong((entry)
						-> {return Long.valueOf(entry.getValue());})
				.sum());
	}
	@Test
	void testFindCatsByRaceCinco() {
		Map<Raza, Long> mapResult = teoriaGroping.findCatsByRaceCinco();
		int thousand = 1000;
		assertEquals(thousand,mapResult.entrySet().stream()
				.mapToLong((entry)
						-> {return Long.valueOf(entry.getValue());})
				.sum());
	}

}
