package ejercicioStream08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GatoOMTest {

	@Test
	void test() {
		GatoOM gom=new GatoOM();
		for (int i = 0; i < 100; i++) {
			System.out.println(gom.getRandomCat().toString());
		}
	}

}
