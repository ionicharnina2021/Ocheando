package groupby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import ejercicioStream08.Gato;
import ejercicioStream08.GatoOM;
import ejercicioStream08.GatosRepository;
import ejercicioStream08.Raza;

public class TeoriaGrouping2 {
	GatosRepository gatosRepository = new GatosRepository();

	public TeoriaGrouping2() {
		super();
		addOneThousandCats();
	}
	public void teoriaUno() {
		Map<Raza, List<Gato>> collect = gatosRepository.getGatos().stream()
		.collect(Collectors.groupingBy(gato->gato.getRaza()));
		System.out.println();
	}
	public void teoriaDos() {
		Map<Raza, Long> collect = gatosRepository.getGatos().stream()
				.collect(Collectors.groupingBy(t->t.getRaza(),Collectors.counting()));
		System.out.println(collect);						
	}
	public void teoriaTres() {
		Map<Raza, Double> collect = gatosRepository.getGatos().stream()
				.collect(Collectors
						.groupingBy(
								t->t.getRaza(),
								Collectors.averagingDouble(
										(gato)
										->{return gato.getEdad();})));
		System.out.println(collect);
	}
	

	public boolean addOneThousandCats() {
		GatoOM gatoOM = new GatoOM();
		int thousand = 1000;
		do {
			gatosRepository.add(gatoOM.getRandomCat());
		} while (gatosRepository.size() < thousand);
		return true;
	}

}
