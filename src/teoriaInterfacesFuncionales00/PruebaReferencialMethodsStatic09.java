package teoriaInterfacesFuncionales00;

public class PruebaReferencialMethodsStatic09 {
	public static void main(String[] args) {
		Converter<Float, String> conv=new Converter<Float, String> () {

			@Override
			public Float convert(String f) {
				return Float.valueOf(f);
			}

		
		};
		Converter<Float, String> conv2=(a)->{return Float.valueOf(a);};
		//Podemos usar referencias directas a metodos estaticos
		Converter<Float, String> converter=Float::valueOf;
		Float convert = converter.convert("4");
		//Se le dice el metodo estatico que debe usar. Se podrá utilizar si cumple con los tipos
		Converter<Float, String> converterOfMyOwn=ParaConverter::convertir;
		System.out.println(converterOfMyOwn.convert("alumina"));
		converterOfMyOwn=Float::valueOf;
		System.out.println(converterOfMyOwn.convert("9"));

		//Esta da fallo porque la firma de converir String convertir(Float valor)
		//es diferente de T convert(F f) en Converter
//		Converter<Float, String> converterOfMyOwnTwo=ParaConverterBack::convertir;
	}
}
class ParaConverter{
	public static Float convertir(String valor) {
		if(valor.startsWith("a")) {
			return 5f;
		}
		return -1f;
	}
}
class ParaConverterBack{
	public static String convertir(Float valor) {
		if(valor==5f) {
			return "cinco";
		}
		return "nada";
	}
}
