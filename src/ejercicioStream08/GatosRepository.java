package ejercicioStream08;

import java.util.HashSet;
import java.util.Set;

public class GatosRepository {
	private Set<Gato> gatos=new HashSet<>();

	public boolean add(Gato e) {
		return gatos.add(e);
	}

	public int size() {
		return gatos.size();
	}
	
	
}
