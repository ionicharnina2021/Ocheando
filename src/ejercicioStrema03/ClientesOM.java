package ejercicioStrema03;

import java.util.ArrayList;
import java.util.List;

public class ClientesOM {

	static int dniClientes=1;
	static List<String> nombre=List.of("Juan","pedro","antonio","rafa","julio","andres");
	static List<Float> descuento=List.of(0f,10f,0f,0f,0f,10f);
	
	public static List<Cliente> getClientes() {
		ArrayList<Cliente> lista=new ArrayList<>();
		for (int i = 0; i < nombre.size(); i++) {
			lista.add(new Cliente(String.valueOf(dniClientes++), nombre.get(i), descuento.get(i)));
		}
		return lista;
	}
}
