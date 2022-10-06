package ejercicioStream06bisbis;

public enum Materias {
	ingles, lengua, matematicas, fisica, tecnologia, historia, filosofia;
	public static Materias getMateria(int posicion) {
		return Materias.values()[posicion];
	}
}
