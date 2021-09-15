package teoriaInterfacesFuncionales00;

public class PruebaACtionFunctionalParametrized07 {
public static void main(String[] args) {
	ACtionFunctionalPArametrized06<Integer,String> action=(b)->{return Integer.valueOf(b);};
	int valor=action.convert("7");
	System.out.println(valor);
 }
}
