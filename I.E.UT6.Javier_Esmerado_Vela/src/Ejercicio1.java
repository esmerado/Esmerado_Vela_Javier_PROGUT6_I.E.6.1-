
/**
 * Ejercicio 1
 */
import java.awt.print.Printable;
import java.util.Scanner;
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
/**
 * En este ejercicio vamos a a�adir elementos a nuestro array, que se van a pedir por teclado.
 */
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
	
		System.out.println("Introduce el primer n�mero: ");
		array[0] = sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		array[1] = sc.nextInt();
		System.out.println("Introduce el tercer n�mero: ");
		array[2] = sc.nextInt();
		System.out.println("Introduce el cuarto n�mero: ");
		array[3] = sc.nextInt();
		System.out.println("Introduce el quinto n�mero: ");
		array[4] = sc.nextInt();

		System.out.println("Estos son los n�meros que ha introducido: ");
		for (int i = 0; array.length > i; i++) {
			System.out.println(array[i]);
		}
		
	}

}
