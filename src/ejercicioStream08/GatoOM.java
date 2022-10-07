package ejercicioStream08;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GatoOM {
	List<String> nombres = Arrays.asList("Pitín", " Wifi", " Flash", " Apolo", " Ratón", " Oreo", " Rayo", " Odín", " Max", " Poker", "Alan",
			" Yael", " Otto", " Kuno", " Max", " Ian", " Kai", " Nic", " Roi", " Joe", " Vito", " Iker", "Orión",
			" Leo", " Khan", " Rajin", " Jade", " Tabby", " Kin", " Elvis", " Baboo", " Nilo", "Ninja", " Batman",
			" Night", " Dark", " Shadow", " Sauron", " Kuro", " Morito", " Tizón", " Salem", "Silver", " Bolín",
			" Amaru", " Joel", " Luc", " Naim", " Teo", " Umi", " Dorian", " Adel" );

	byte edadMaxima = 7;

	public Gato getRandomCat() {
		Random randon=new Random();
		return new Gato(nombres.get(randon.nextInt(nombres.size())),(byte)randon.nextInt(edadMaxima+1),Raza.values()[randon.nextInt(Raza.values().length)]);
	}
}
