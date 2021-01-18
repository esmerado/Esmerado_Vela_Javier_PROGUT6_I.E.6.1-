

import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
/**
 * En este ejercicio vamos a crear un array con 25 número.
 * Al pedir al usuario un número nos va a decir cuántas veces se repite ese número en nuestro array.
 */
		Documentacion d = new Documentacion();
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		d.ArrayNumAleatorios(a, 0, 10);
		d.RepUnNúmero(a);
		
		
		
	}

}
