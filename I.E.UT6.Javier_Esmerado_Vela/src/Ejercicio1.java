
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
 * En este ejercicio vamos a añadir elementos a nuestro array, que se van a pedir por teclado.
 */
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
	
		System.out.println("Introduce el primer número: ");
		array[0] = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		array[1] = sc.nextInt();
		System.out.println("Introduce el tercer número: ");
		array[2] = sc.nextInt();
		System.out.println("Introduce el cuarto número: ");
		array[3] = sc.nextInt();
		System.out.println("Introduce el quinto número: ");
		array[4] = sc.nextInt();

		System.out.println("Estos son los números que ha introducido: ");
		for (int i = 0; array.length > i; i++) {
			System.out.println(array[i]);
		}
		
	}

}
