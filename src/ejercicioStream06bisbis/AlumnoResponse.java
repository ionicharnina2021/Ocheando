package ejercicioStream06bisbis;

import java.util.LinkedList;
import java.util.List;

public class AlumnoResponse {
	private String nombre;
	private List<String> materiasSuspensas;
	private String nombres="";
	
	
	public AlumnoResponse(Alumno alumno) {
		super();
		this.nombre = alumno.getNombre();
		this.materiasSuspensas=new LinkedList<>();
		addMateriaSuspensa(alumno.getMateriasSuspensas());
	}

	void addMateriaSuspensa(Materias materia) {
		materiasSuspensas.add(materia.toString());
	}
	private void addMateriaSuspensa(List<Materias> materias) {
		materias.forEach((materia)->{
			addMateriaSuspensa(materia);
		});
	}
	
	@Override
	public String toString() {
		materiasSuspensas.forEach((nombre)->{nombres+=nombre+" ";});
		return nombre+": "+nombres;
	}
	
}
