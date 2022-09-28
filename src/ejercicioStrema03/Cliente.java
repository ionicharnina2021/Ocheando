package ejercicioStrema03;

public class Cliente extends Persona {

	private float descuento=0f;
	

	public Cliente(String DNI, String nombre) {
		super(DNI, nombre);
	}

	public Cliente(String DNI, String nombre, float descuento) {
		this(DNI,nombre);
		this.descuento = descuento;
	}

	public float getDescuento() {
		return descuento;
	}

	private void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	
}
