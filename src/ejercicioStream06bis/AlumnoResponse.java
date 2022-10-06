package ejercicioStream06bis;

import java.util.LinkedList;
import java.util.List;

public class AlumnoResponse {
	private String nombre;
	private List<String> materiasSuspensas;
	private String nombres="";
	
	public AlumnoResponse(String nombre) {
		super();
		this.nombre = nombre;
		materiasSuspensas=new LinkedList<>();
	}

	void addMateriaSuspensa(Materias materia) {
		materiasSuspensas.add(materia.toString());
	}
	public void addMateriaSuspensa(List<Materias> materias) {
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
