package ejercicioStrema03;

public abstract class Persona {
	// propiedades
	private String dni;
	private String nombre;

	// Getters and Setters
	public String getDNI() {
		return dni;
	}

	public void setDNI(String DNI) {
		this.dni = DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// metodos
	public Persona(String DNI, String nombre) {
		// TODO Auto-generated constructor stub
		setDNI(DNI);
		setNombre(nombre);
	}

}
