

import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
/**
 * En este ejercicio vamos a crear un array con 25 n�mero.
 * Al pedir al usuario un n�mero nos va a decir cu�ntas veces se repite ese n�mero en nuestro array.
 */
		Documentacion d = new Documentacion();
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		d.ArrayNumAleatorios(a, 0, 10);
		d.RepUnN�mero(a);
		
		
		
	}

}
