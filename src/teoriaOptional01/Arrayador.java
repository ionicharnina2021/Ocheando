package teoriaOptional01;

import java.util.ArrayList;

public class Arrayador {
	public ArrayList<String> getArray(String something) {
		if (something.equals("hola")) {
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add(something);
			return arrayList;
		}
		return null;
	}
}
