

import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio15 {

	public static void main(String[] args) {
	/**
	 * Vamos a crear un programa donde nos va a leer una secuencia de 20 números y nos va a alamacenar los factoriales
	 */
		Scanner S = new Scanner (System.in);
		int num, num2;
		int factorial = 1;
		int [] a = new int [20];
		
		do {
			System.out.println("Introduzca un número: ");
			num = S.nextInt();
		}while(num < 0);
		num2 = num;
		
		for(int i = 0; num2 > 0; i++) {
			a[i] = num2;
			num2--;
		}
		
		for(int i = 0; i < num; i++) {
			factorial *=  a[i];
		}
		
		System.out.println("El factorial es : "+factorial);
		
	}

}
