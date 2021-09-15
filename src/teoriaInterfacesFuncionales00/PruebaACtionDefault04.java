package teoriaInterfacesFuncionales00;

public class PruebaACtionDefault04 {
	public static void main(String[] args) {
		ActionDefault02 actionOne=new ActionDefault02() {
		};
		actionOne.doit();
		ActionDefault02 actionTwo=new ActionDefault02() {
			@Override
			public void doit() {
				System.out.println("corrijo a mi padre porque esto no es una herencia");
			}
		};
		actionTwo.doit();
	}
}
