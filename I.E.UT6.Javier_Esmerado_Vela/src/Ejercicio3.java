

import java.util.Scanner;
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio3 {
/**
 *
 * @param args
 */
	public static void main(String[] args) {
	/**
	 * En este ejercicio vamos a a�adir n�mero a un array y mediante 2 "for" vamos a intercambiar la posici�n de los n�meros	
	 */
		 try (Scanner scan = new Scanner(System.in)) {
	            int i;
	            int[] a = new int[10]; 

	            System.out.println("Indique los n�meros del array: ");

	            for (i = 0; i < a.length; i++) {
	                System.out.print("posici�n " +i+ " = ");
	                a[i]=scan.nextInt();
	            }
	            int j = 0;
	            int k = 0;

	            for (i = 0; i < a.length; i+=2) {

	                j=a[i];
	                k=a[i+1];

	                a[i]=k;
	                a[i+1]=j;

	                System.out.print("posici�n " +i+ " intercambiada = " +a[i]+ "\n");
	                System.out.print("posici�n " +(i+1)+ " intercambiada = " +a[i+1]+ "\n");

	            }

	        }
		
		
	}
}
