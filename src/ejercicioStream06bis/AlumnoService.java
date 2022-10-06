package ejercicioStream06bis;

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
					AlumnoResponse alumnoResponse = new AlumnoResponse(alumno.getNombre());
					List<Integer> notas = alumno.getNotas();
					for (int i = 0; i < notas.size(); i++) {
						if (notas.get(i) < 5) {
							alumnoResponse.addMateriaSuspensa(Materias.getMateria(i));
						}
					}
					return alumnoResponse;})
				.collect(Collectors.toList());
	}
}
