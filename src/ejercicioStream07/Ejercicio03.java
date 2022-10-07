package ejercicioStream07;

import java.util.*;

public class Ejercicio03 {
	/*
	 * Reglas de bolas de dos colores: cada apuesta en la bola de dos colores consta
	 * de 6 n�meros de bolas rojas y 1 n�mero de bolas azules. El n�mero de bola
	 * roja se selecciona del 1 al 33; el n�mero de bola azul se selecciona del 1 al
	 * 16; genere aleatoriamente un n�mero de bola de doble color. (Requiere que no
	 * se repita el mismo n�mero de color)
	 */
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		int i = 0;
		while (i < 6) {
			Random rand = new Random();
			int randNum = rand.nextInt(33) + 1;
			if (!hs.contains(randNum)) {
				hs.add(randNum);
				i++;
			}
		}
		boolean flag = true;
		while (flag) {
			Random blue = new Random();
			int blueNum = blue.nextInt(16) + 1;
			if (!hs.contains(blueNum)) {
				hs.add(blueNum);
				flag = false;
			}
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}