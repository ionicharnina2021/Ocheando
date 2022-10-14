package groupby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import ejercicioStream08.Gato;
import ejercicioStream08.GatoOM;
import ejercicioStream08.GatosRepository;
import ejercicioStream08.Raza;

public class TeoriaGrouping {
	GatosRepository gatosRepository = new GatosRepository();

	public TeoriaGrouping() {
		super();
		addOneThousandCats();
	}

	public Map<Raza, Long> findCatsByRaceUno() {
		Map<Raza, Long> razasMap = new HashMap<>();
		Raza[] values = Raza.values();
		for (Raza raza : values) {
			razasMap.put(raza, (long) 0);
		}
		for (Entry<Raza, Long> entrada : razasMap.entrySet()) {
			for (Gato gato : gatosRepository.getGatos()) {
				if (gato.getRaza().equals(entrada.getKey())) {
					entrada.setValue(entrada.getValue() + 1);
				}
			}
		}
		return razasMap;
	}

	public Map<Raza, Long> findCatsByRaceDos() {
		Map<Raza, Long> razasMap = new HashMap<>();
		Raza[] values = Raza.values();
		for (Raza raza : values) {
			razasMap.put(raza, (long) 0);
		}
		for (Entry<Raza, Long> entrada : razasMap.entrySet()) {
			entrada.setValue(gatosRepository.getGatos().stream().filter((gato) -> {
				return gato.getRaza().equals(entrada.getKey());
			}).count());
		}
		return razasMap;
	}

	public Map<Raza, Long> findCatsByRaceTres() {
		Map<Raza, Long> razasMap = new HashMap<>();
		Raza[] values = Raza.values();
		for (Raza raza : values) {
			razasMap.put(raza, (long) 0);
		}
		razasMap.entrySet().stream().forEach((entrada) -> {
			entrada.setValue(gatosRepository.getGatos().stream().filter((gato) -> {
				return gato.getRaza().equals(entrada.getKey());
			}).count());
		});
		return razasMap;
	}

	public Map<Raza, Long> findCatsByRaceCuatro() {
		Map<Raza, Long> razasMap = new HashMap<>();
		Arrays.asList(Raza.values()).stream().forEach((raza) -> {
			razasMap.put(raza, (long) 0);
		});
		razasMap.entrySet().stream().forEach((entrada) -> {
			entrada.setValue(gatosRepository.getGatos().stream().filter((gato) -> {
				return gato.getRaza().equals(entrada.getKey());
			}).count());
		});
		return razasMap;
	}

	public Map<Raza, Long> findCatsByRaceCinco() {
		Map<Raza, Long> razasMap = Arrays.asList(Raza.values()).stream().collect(Collectors.toMap((Raza raza) -> {
			return raza;
		}, (value) -> {
			return 0l;
		}));
		razasMap.entrySet().stream().forEach((entrada) -> {
			entrada.setValue(gatosRepository.getGatos().stream().filter((gato) -> {
				return gato.getRaza().equals(entrada.getKey());
			}).count());
		});
		return razasMap;
	}

	public Map<Raza, Long> findCatsByRaceSeis() {
//		Map<Raza, Long> razasMap =Arrays.asList(Raza.values()).stream()
//				.collect(Collectors
//						.toMap((Raza raza)->{return raza;},(value)->{return ;}))
//				.entrySet().stream().forEach((entrada)->{
//			entrada.setValue(gatosRepository.getGatos().stream()
//					.filter((gato)->{return gato.getRaza().equals(entrada.getKey());})
//					.count());
//		});
//		return razasMap;
		return null;
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
