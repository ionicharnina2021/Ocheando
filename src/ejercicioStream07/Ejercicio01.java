package ejercicioStream07;


import java.util.*;
public class Ejercicio01
{
//	1. Genere 10 n�meros aleatorios que van del 1 al 100
//	y col�quelos en una matriz Coloque los n�meros mayores
//	o iguales a 10 en la matriz 
//	en un conjunto de listas e impr�malos en la consola.
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

