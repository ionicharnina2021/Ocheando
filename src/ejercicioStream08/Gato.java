package ejercicioStream08;

import java.util.Objects;

public class Gato {
	private String nombre;
	private byte edad;
	private Raza raza;

	public Gato(String nombre, byte edad, Raza raza) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, raza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre) && raza == other.raza;
	}

}
