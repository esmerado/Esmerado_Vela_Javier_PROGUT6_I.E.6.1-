
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {
/**
 * Vamos a crear un array con 20 n�mero por ejemplo y luego vamos a preguntar si un n�mero est� dentro del array y nuestro programa nos lo va a decir.
 */
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		int num;
		int n;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Introduzca 20 n�meros");
			n = sc.nextInt();
			a[i] = n;
		}
		
		System.out.println("Introduce el n�mero que desea buscar:");
		num = sc.nextInt();
		
		Arrays.sort(a);
		if (Arrays.binarySearch(a, num) > 0) {
			System.out.println("El n�mero "+num+" est� en el array");
		}else {
			System.out.println("El n�mero "+num+" no est� en el array");
		}
	}

}
