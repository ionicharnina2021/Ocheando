package teoriaOptional01;

import java.util.Optional;
import java.util.function.Consumer;

public class PruebaOptional1401 {
    public static void main(String[] args) {
        //Esto hacia falta. o tal vez no. Pretende evitar los problemas de nullpointer
        //Es la interfaz Optional Guava https://github.com/google/guava
        //Aunque esto es costoso para el procesador
        //java 1.8
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent( (s) 
        		-> System.out.println(s.charAt(0)));
        //VEamos
        optional.ifPresent(new Consumer<String>() {
			@Override
			public void accept(String t) {
				t.charAt(0);
				
			}
        	
		});
    }
}
