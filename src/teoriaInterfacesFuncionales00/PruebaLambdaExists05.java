package teoriaInterfacesFuncionales00;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PruebaLambdaExists05 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		//La forma standard de hacer esto. Pero observa la interfaz comparator f3
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(names.toString());
		Collections.sort(names, (a,b)->{return b.compareTo(a);});
		System.out.println(names.toString());
	}
}
