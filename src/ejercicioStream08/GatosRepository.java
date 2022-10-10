package ejercicioStream08;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class GatosRepository {
	private Set<Gato> gatos=new HashSet<>();

	public boolean add(Gato e) {
		return gatos.add(e);
	}

	public void ejemplo() {
		//para hacer depuracion
		Stream cc=gatos.stream().filter(()->);
		System.out.println();
		cc.map().filter().collect();
		//para hacer log
		gatos.stream().filter(()->)
		.peek((obj)->{syso})		
		.map().filter().collect();
	}
	public int size() {
		return gatos.size();
	}
	
	
}
