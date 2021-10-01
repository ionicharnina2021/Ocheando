package ejercicioStrema03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio02 {
	ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	// Duplica los kilometros mapeando
	public Ejercicio02() {
		super();
		vehiculos.add(new Vehiculo("1111AAA", Modelo.BMW, 10000));
		vehiculos.add(new Vehiculo("2222BBB", Modelo.AUDI, 20000));
		vehiculos.add(new Vehiculo("3333CCC", Modelo.OPEL, 30000));
		vehiculos.add(new Vehiculo("4444DDD", Modelo.BMW, 100000));
		vehiculos.add(new Vehiculo("5555EEE", Modelo.AUDI, 200000));
		vehiculos.add(new Vehiculo("6666FFF", Modelo.OPEL, 300000));
		vehiculos.add(new Vehiculo("7777GGG", Modelo.CITROEN, 0));
	}
	public List<Vehiculo> alteraCollecion(){
		//separando la funcion para verlo mejor
//		Function<Vehiculo, Vehiculo> mapeo = new Function<Vehiculo, Vehiculo>() {
//
//			@Override
//			public Vehiculo apply(Vehiculo t) {
//				t.setKilometros(t.getKilometros() * 2);
//				return t;
//			}
//		};
//		vehiculos.stream().map(mapeo).collect(Collectors.toList());
		return vehiculos.stream().map((v) -> {
			v.setKilometros(v.getKilometros() * 2);
			return v;
		}).collect(Collectors.toList());
		
	}
}
