package ejercicioStream07;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio02 {
	public void solucion() {
//		Arrays.asList( "12345", "67891", "12347809933", "98765432102", "67891", "12347809933" )
//		.stream()
//		.collect(Collectors.groupingBy(w -> w, Collectors.counting()));
//		System.out.println();
		Arrays.asList( "12345", "67891", "12347809933", "98765432102", "67891", "12347809933" )
		.stream()
		.distinct().collect(Collectors.toList());
	}
	/*
	 * La matriz conocida almacena un lote de números QQ. El número QQ más largo es
	 * de 11 dígitos y el más corto es de 5 dígitos String [] strs = {"12345",
	 * "67891", "12347809933", "98765432102", "67891", "12347809933" }. Almacene
	 * todos los números qq en la matriz en LinkedList, elimine los elementos
	 * repetidos en la lista e imprima todos los elementos en la lista con un
	 * iterador y un bucle for mejorado.
	 */
	public static void main(String[] args) {
		// método uno:
		new Ejercicio02().solucion();
		String[] strs = { "12345", "67891", "12347809933", "98765432102", "67891", "12347809933" };
		LinkedList<String> al = new LinkedList<String>();
		for (int i = 0; i < strs.length; i++) {
			al.add(strs[i]);
		}
		for (int j = 0; j < al.size(); j++) {
			for (int k = j + 1; k < al.size(); k++) {
				if (al.get(j).equals(al.get(k))) {
					al.remove(k);
				}
			}
		}
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Método 2: usar Set directamente
		LinkedHashSet<String> al1 = new LinkedHashSet<String>();
		al.add("12345");
		al.add("67891");
		// Debido a que el método equals del objeto String es determinar si dos cadenas
		// son iguales, no hay necesidad de reescribir el método equals
		al.add("12347809933");
		al.add("98765432102");
		al.add("67891");
		al.add("12347809933");
		Iterator it1 = al1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
