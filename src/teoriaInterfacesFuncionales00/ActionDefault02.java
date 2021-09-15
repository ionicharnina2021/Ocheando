package teoriaInterfacesFuncionales00;

//La anotacion no permite una funcion por defecto
//01
//@FunctionalInterface
public interface ActionDefault02 {
	//00
	public default void doit() {
		System.out.println("por defecto hago esto");
	};
	
	//01
//	public void other();
}
