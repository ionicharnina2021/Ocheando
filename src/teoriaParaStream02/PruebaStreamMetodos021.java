package teoriaParaStream02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.stream.Stream;


public class PruebaStreamMetodos021 {

	public static void main(String[] args) {
		String cosas[] = { "periplo", "nocturno", "cempua" };
		List<String> cadenas = Arrays.asList(cosas);
		// Que metodos tenemos
		Stream<String> stream = cadenas.stream();
		// Ahora vamos a ver metodos que neceitan una lambda para funcionar
		// Estos necesitan un Predicate
		// el predicate es una IF y no necesita esta sintaxis
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() > 6;
			}
		};
		// System.out.println(stream.allMatch((t) -> {
		// return t.length() > 5;
		// }));
		// stream.anyMatch();
		// List<String> collect = stream.dropWhile((t) -> {
		// return t.length() > 6;
		// }).collect(Collectors.toList());
		// System.out.println(collect);
		// stream.noneMatch();
		// stream.takeWhile();

		// Estos necesitan un Consumer
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub

			}
		};
		// stream.forEach((t)->{System.out.println(t);});

		// stream.forEachOrdered();
		// stream.peek();

		// Estos necesitan un Supplier
		Supplier<String> supplier = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		// Estos una funcion
		Function<String,String> function=new Function() {

			@Override
			public Object apply(Object t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
//		 stream.map();
//       stream.flatMap();
//       stream.flatMapToDouble();
//       stream.flatMapToInt();
//       stream.flatMapToLong();
//       stream.mapToDouble();
//       stream.mapToInt();
//       stream.mapToLong();
		
		 // Las que necesitan un comparador
//      stream.max();
//      stream.min();
//      stream.sorted();
		
//      // METODOS QUE NO RETORNAN UN STREAM
//      // que retorna  optional
//      stream.findFirst();
		
//      //cuenta los elementos
//      stream.count();
		
//      // retorna el tipo con BinaryOperator
//      stream.reduce();
	}

}
