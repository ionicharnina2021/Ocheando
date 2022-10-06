package ejercicioStream06bisbis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAlumnoOm {

	@Test
	void test() {
		int i = 4;
		assertEquals(i, AlumnoOM.getAlumnos().size());
		AlumnoOM.getAlumnos().stream()
			.forEach((alumno)->{
				int j = 7;
				assertEquals(j, alumno.getNotas().values().size());
			});
	}

}
