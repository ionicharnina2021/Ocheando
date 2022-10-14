package ejercicioStream08;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class GatosRepository {
	private Set<Gato> gatos=new HashSet<>();

	public Set<Gato> getGatos() {
		return gatos;
	}

	public void setGatos(Set<Gato> gatos) {
		this.gatos = gatos;
	}

	public boolean add(Gato e) {
		return gatos.add(e);
	}

	public void ejemplo() {
		//para hacer depuracion
//		Stream cc=gatos.stream().filter(()->);
//		System.out.println();
//		Stream ca=cc.map().filter()
//		System.out.println();
//		.collect();
		//para hacer log
//		gatos
//			.stream()
//			.filter(()->)
//			.map()
////			.peek((a)->{syso})
//			.filter()
//			.collect();
	}
	public int size() {
		return gatos.size();
	}
	
	
}
