package ejercicioStream06bisbis;

import java.util.List;
import java.util.stream.Collectors;

public class AlumnoService {
	private AlumnosRepository alumnosRepository = new AlumnosRepository();

	public List<Alumno> getAlumnosAprobados() {
		return alumnosRepository.findAll().stream()
				.filter((alumno) -> {
					return alumno.alumnoAprobado();})
				.collect(Collectors.toList());
	}

	public List<AlumnoResponse> getInfoAlumnosAprobados() {
		return getAlumnosAprobados().stream()
				.map((alumno) -> {
					return new AlumnoResponse(alumno);})
				.collect(Collectors.toList());
	}
}
