package teoriaParaStream02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaStream001 {

	public static void main(String[] args) {
		  String cosas[] = {"periplo", "nocturno", "cempua"};
	        List<String> cadenas =  Arrays.asList(cosas);
//	        Aqui se abre el stream.
	        Stream<String> stream = cadenas.stream();
//	        Stream<String> stream = cadenas.stream();
//	        //mientras se hagan operacion con el stream, no se cierra
	        Stream<String> filter = stream.filter((a)->{return a.length()>6;});
//	        Stream<String> filter = stream.filter((a)->{return a.length()>6;});
//	        //Cuando obtenemos el resultado (no retorna un stream) se cierra el stream
	        filter.collect(Collectors.toList());
//	        List<String> arrayList =filter.collect(Collectors.toList());
//	        System.out.println(arrayList);
//	        //Aqui falla al interntar acceder al stream porque collect ya lo cerro
//	        filter.count();
	        //la forma alternativa
	        List<String> oldCollect=new ArrayList<>();
	        for (String string : cadenas) {
	        	if(string.length()>6) {
	        		oldCollect.add(string);
	        	}
			}
	        
		List<String> collect = cadenas.stream()
	        		.filter((a)->{return a.length()>6;})
	        		.collect(Collectors.toList());
		
	}

	
	
	
	
	
	
	
	
	
}
