package ejercicioStream07;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class Ejercicio01
{
	public List<Integer> solucion() {
		return new Random()
		.ints(1, 100)
		.limit(20)
		.boxed()
		.filter((numero)->{return numero>10;})
//		.forEach((filtrado)->{System.out.println(filtrado);});
		.collect(Collectors.toList());
	}
//	1. Genere 10 números aleatorios que van del 1 al 100
//	y colóquelos en una matriz Coloque los números mayores
//	o iguales a 10 en la matriz 
//	en un conjunto de listas e imprímalos en la consola.
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		 int [] arr = new int [10]; // Indica la longitud
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100+1);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=10)
				al.add(arr[i]);
		}
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

