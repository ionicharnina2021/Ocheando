package ejercicioStream06bis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlumnoServiceTest {
	AlumnoService alumnoService=new AlumnoService();
	int aprobados=3;
	@Test
	void test() {
		assertEquals(aprobados, alumnoService.getAlumnosAprobados().size());
	}
	
	@Test
	void testResponse() {
		assertEquals(aprobados, alumnoService.getInfoAlumnosAprobados().size());
		alumnoService.getInfoAlumnosAprobados()
		.forEach((alumno)->{System.out.println(alumno);});
	}

}
