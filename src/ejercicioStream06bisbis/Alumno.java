package ejercicioStream06bisbis;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Alumno {
	private Map<Materias,Integer> notas;
	private String nombre;
	private List<Materias> suspensas;
	
	public Alumno(List<Integer> notasNumericas, String nombre) {
		super();
		convertirNotasNumericas(notasNumericas);
		this.nombre = nombre;
	}

	private void convertirNotasNumericas(List<Integer> notasNumericas) {
		notas=new HashMap<>();
		for (int i = 0; i < notasNumericas.size(); i++) {
			notas.put(Materias.getMateria(i), notasNumericas.get(i));
		}
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public boolean alumnoAprobado() {
			int maximasSuspensas = 2;
			return this.getNotas().values().stream()
			.filter((nota)->{
					int minimaNotaAprobado = 5;
					return nota<minimaNotaAprobado;
				})
			.count()<maximasSuspensas;
	}
	
	Map<Materias,Integer> getNotas() {
		return this.notas;
	}

	public List<Materias> getMateriasSuspensas(){
		suspensas=new LinkedList<>();
		this.getNotas().entrySet().stream()
		.forEach((entry)->{
			if(entry.getValue()<5) {
				suspensas.add(entry.getKey());
			}			
		});
		return suspensas;
	}
}
