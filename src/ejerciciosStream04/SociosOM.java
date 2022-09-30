package ejerciciosStream04;

import java.util.List;
import java.util.stream.Collectors;
import ejercicioStrema03.ClientesOM;

public class SociosOM {
	public static List<Socio> getSocios(){
		return ClientesOM.getClientes().stream().map((cliente)->{
			return new Socio(cliente.getNombre(),300f);
		}).collect(Collectors.toList());
	}
}
