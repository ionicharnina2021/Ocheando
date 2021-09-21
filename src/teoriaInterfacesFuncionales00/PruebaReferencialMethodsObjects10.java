package teoriaInterfacesFuncionales00;

//java 11 Con una version anterior no podemos usar referencias a metodos
//no estaticas
public class PruebaReferencialMethodsObjects10 {
    public static void main(String[] args) {
        Something something = new Something();
        //pasando por referencia u nmetodo de objeto
        Converter<String, String>  converter = something::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);    // "J"
        //Usando metodos de construccion
        PersonFactory personFactory=Person::new;
        Person person=personFactory.create("Obdulio");
        System.out.println(person.toString());
        //La sobercarga no es posible
//        person=personFactory.create("Jairo","Tristancho");
//        System.out.println(person.toString());
    }

}
class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}
@FunctionalInterface
interface PersonFactory<P extends Person> {
    P create(String firstName);
    //no se puede sobrecargar porque entonces no es una IF
//    P create(String firstName,String secondName);
}
class Person{
	public String nombre;
	public String apellido="";
	
	public Person(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Person(String nombre) {
		super();
		this.nombre = nombre;
	}
	

	


	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", apellido=" + apellido + "]";
	}


	
	
}