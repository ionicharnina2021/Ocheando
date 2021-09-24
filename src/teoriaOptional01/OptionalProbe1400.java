package teoriaOptional01;

import java.util.ArrayList;
import java.util.Optional;

//https://www.adictosaltrabajo.com/2015/03/02/optional-java-8/
public class OptionalProbe1400 {
	public int probar(ArrayList<String> cosa) {
		return cosa.size();
	}

	public static void main(String[] args) {
		// 00
		// Supongamos el siguiente problema
		 ArrayList<String> palabras=null;
		// System.out.println(palabras.size());
		// Obviamente es un nullpointer
		// 01 una solucion posible es esta
		// ArrayList<String> palabras = null;
		// if (palabras != null)
		// System.out.println(palabras.size());
		// 02 java 8 nos da el envoltorio Optional
		// Es un singleton. Tenemos un objeto fijo EMPTY cuando no hay nada nuevo
		// Optional<Object> optional = Optional.empty();
		// obhserva que no hay nulo
		// System.out.println(optional);
		////////////////////////////////////////////////////////////////
		// optional=Optional.of(16);
		// System.out.println(optional.get());
		// Optional otro=Optional.of(25);
		// System.out.println(optional.get());
		// System.out.println("otro"+otro.get());
		////////////////////////////////////////////////////////////////
		// optional=Optional.ofNullable(null);
		// //Aqui no obtenemos el error de null
		// System.out.println(optional);
		////////////////////////////////////////////////////////////////
		// Me puedo preguntar si el valor esta presente o no
		// optional=Optional.ofNullable(null);
		// System.out.println(optional.isPresent());
		////////////////////////////////////////////////////////////////
		// tambien puedo obtener un valor por defecto
		// optional = Optional.ofNullable(null);
		// System.out.println(optional.orElse(35));
		////////////////////////////////////////////////////////////////
		// En cualquier caso lo que queremos es retornar valores optional

		// 03 En este caso no trabajamos con palabras, lo hacemos con un optional
		 palabras=new ArrayList<>();
		 palabras.add("hola");
		 ArrayList<String>palabrass=new ArrayList<>();
		 palabrass.add("hola");
		 palabrass.add("hola");
		Optional<ArrayList> optional = Optional.ofNullable(null);
//		Optional<ArrayList> optional = Optional.ofNullable(palabras);
		// Aqui obtenemos el valor dado o uno por defecto
		System.out.println(new OptionalProbe1400().probar(optional.orElse
		(palabrass)));

	}

}
