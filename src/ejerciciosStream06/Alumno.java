package ejerciciosStream06;

import java.util.Arrays;
import java.util.List;

public class Alumno {
	private final List<Materias> materias=Arrays.asList(Materias.values());
	private List<Integer> notas;
	private String nombre;
	
	public Alumno(List<Integer> notas, String nombre) {
		super();
		this.notas = notas;
		this.nombre = nombre;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public String getNombre() {
		return nombre;
	}
	
}
