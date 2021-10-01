package ejercicioStrema03;

import java.util.ArrayList;

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
	public static void main(String[] args) {

	}

}
