package teoriaParaStream02;

import java.util.Locale;

public class PruebaStringStream00 {
    public static void main(String[] args) {
        //Supongamos que tenemos un String
        String cadena = new String("      Molto Cadencioso");
        //Podemos aplicar un metodo que trabaje sobre el y devuelva otro String
        String cadena2 = cadena.toUpperCase();
        System.out.println(cadena2);
        //Sobre esta cadena podemos aplicar otro metodo de String porque es el retorn de la anterior
        String cadena3 = cadena2.toLowerCase();
        System.out.println(cadena3);
        // Esto vuelve a ser muy verboso. Podemos enlazar diferentes ejecuciones, como en una ristra
        // Si lo que retorna el metodo es del mimo tipo que el tipo del metodo llamador, esta ristra puede ser indefinida
        //Esta linea sustituye a todo lo de arriba. hace que sea mas corto, pero tambien menos leible
        System.out.println(cadena.toUpperCase().toLowerCase());
        //Es recomendable escribir cada llamada en una linea
        System.out.println(cadena
                .toUpperCase()
                .toLowerCase());
        // Yo podría hacer esto tan largo como quisiera si el metodo tiene un retorno de String
        // Esto se llama pipeline recibe ese nombre porque pipe significa tuberia. Una tuberia
        // en informatica es cuando conectamos dos operaciones para que la salida de una sea la entrada
        // de la siguiente en SSOO se usa el simbolo |
        // Cuando muchas pipes se encadenan se entienden que crean una linea de pipes
        System.out.println(cadena
                .toLowerCase()
                .replace("o", "a")
                .trim());
        System.out.println(cadena);
    }
}
