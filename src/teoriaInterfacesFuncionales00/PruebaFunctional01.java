package teoriaInterfacesFuncionales00;

public class PruebaFunctional01 {
	public static void main(String[] args) {
		ActionFunctional00 actionFunctional00=new ActionFunctional00() {
			
			@Override
			public void doit() {
				System.out.println("estoy siendo implementado");
				
			}
		};
		actionFunctional00.doit();
		//Como hacemos esto con lambda
		ActionFunctional00 other=()->{System.out.println("vengo de una lmbda");};
		other.doit();
		
	}
}
