package teoriaOptional01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class ArrayadorTest {

	@Test
	void test() {
		Optional<ArrayList<String>> optional=Optional.ofNullable(new Arrayador().getArray("holas"));
		ArrayList<String> resultado=optional.orElse(new ArrayList<>());
		System.out.println(resultado.size());
		
		//sin optional
		ArrayList<String> array = new Arrayador().getArray("hola");
		if(array==null) {
			array=new ArrayList<>();
		}
		System.out.println(array.size());
	}

}
