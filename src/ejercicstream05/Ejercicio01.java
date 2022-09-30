package ejercicstream05;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio01 {
	private static Integer suma;

	public static void main(String[] args) {
		List<Integer> collect = new Random().ints(1, 100).limit(20).boxed().collect(Collectors.toList());
		System.out.println(collect);
		collect.stream().forEach((a) -> {
			Ejercicio01.suma += a;
		});
		System.out.println("la suma es " + Ejercicio01.suma + " y la media es " + Ejercicio01.suma / collect.size());

		System.out.println("la suma es " + collect.stream().mapToInt(a -> a).sum());
		System.out.println("la media es " + collect.stream().mapToInt(a -> a).average());
	}
}
