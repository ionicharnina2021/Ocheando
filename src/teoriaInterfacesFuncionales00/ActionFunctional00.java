package teoriaInterfacesFuncionales00;

//Una interface con esta anotacion tiene UN SOLO metodo declarado
@FunctionalInterface
public interface ActionFunctional00 {
	//ESte es el metodo que hace de funcional
	public void doit();
	//No puede declarade un segundo metodo
//	public void doAnother();
	// We can declare another method
	public default void otro() {
		System.out.println("por si acaso");
	};
	// unless its a inherited method like in this case
	boolean equals(Object obj);
//	Since default methods are not abstract you're free to 
	//add default methods to your functional interface.
	String toString();
}
