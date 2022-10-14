package ejerciciosStream04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio02 {
	public Stream<Integer> dame() {
		return Arrays.asList(3, 4, 5, 14).stream()
				.sorted((a, b) -> {
						return b - a;});
//				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> collect3 = Arrays.asList(3, 4, 5, 14);
		List<Integer> collect = collect3.stream().sorted((a, b) -> {
			return b - a;
		}).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect5 = Arrays.asList(3, 7, 5, 2);
		// resultado es 2,5,7,3
		Collections.reverse(collect5);
		System.out.println(collect5);

		// una lista de cinco o seis socios.
		// haz reverse
		List<Socio> socios = SociosOM.getSocios();
		System.out.println(socios);
		Collections.reverse(socios);
		System.out.println(socios);
	}
}
