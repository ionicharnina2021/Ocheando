package teoriaInterfacesFuncionales00;

import java.util.Arrays;
import java.util.List;

public class PruebaLambdaScopes12 {
    static int outerStaticNum;
    int outerNum;
    int total=0;

    //Aqui podemos ver como el acceso a propiedades de una clase u objeto
    //esta completamente permitido, parece que ya no nos importa el efecto colateral
    void testScopes() {
        Converter<String,Integer> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<String,Integer> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
            
        };
      
        List<Integer> asList = Arrays.asList(56,43,4,5,66);
       
        asList.forEach((a)->{
        	total+=a;        	
        });
    }
    public void probcc() {
    	this.outerStaticNum=0;
    	this.outerNum=8;
    }
    public static void main(String[] args) {
        new PruebaLambdaScopes12().testScopes();
        System.out.println();
        String.valueOf(5);
    }
}
