package ejercicioStrema03;

public class Socio {
	private String nombre;
	private float saldo;
	
	public Socio(String nombre, float saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
