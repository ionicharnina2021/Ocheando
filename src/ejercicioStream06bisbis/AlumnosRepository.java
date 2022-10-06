package ejercicioStream06bisbis;

import java.util.List;

public class AlumnosRepository {
	private List<Alumno> alumnos=AlumnoOM.getAlumnos();

	public List<Alumno> findAll() {
		return alumnos;
	}
	
}
