package ejercicioStrema03;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Ejercicio02Test {

	@Test
	void test() {
		Ejercicio02 exercise = new Ejercicio02();
		Integer[] expected= {20000, 40000, 60000, 200000, 400000, 600000, 0};
		List<Vehiculo> alteraCollecion = exercise.alteraCollecion();
		ArrayList<Integer> kilometrajes=new ArrayList<>();
		alteraCollecion.stream().forEach((v)->{
			kilometrajes.add(v.getKilometros());
		});
		assertArrayEquals(expected, kilometrajes.toArray());
	}

}
