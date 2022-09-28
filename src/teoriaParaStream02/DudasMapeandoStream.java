package teoriaParaStream02;

import java.util.List;
import java.util.stream.Collectors;

import ejercicioStrema03.Cliente;
import ejercicioStrema03.ClientesOM;
import ejercicioStrema03.Socio;

public class DudasMapeandoStream {
	public static void main(String[] args) {
		// transformacion de valores
		List<Integer> lista = List.of(2, 4, 5, 7);
		List<Integer> duplicador = lista.stream()
				.map((a) -> {
					return a * 2;
				})
				.collect(Collectors.toList());
		// transformacion y filtro
		List<Cliente> clientes = ClientesOM.getClientes();
		List<String> collect = clientes.stream()
			.map((a) -> {
				return a.getNombre();})
			.collect(Collectors.toList());
		// transformacion a otra cosa
		List<Socio> collect2 = clientes.stream()
				.map((a)->{return new Socio(a.getNombre(), 333-a.getDescuento());})
				.collect(Collectors.toList());;
	}
}
