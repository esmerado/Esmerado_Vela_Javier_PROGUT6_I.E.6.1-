

import java.util.Scanner;
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	/**
	 * En este ejercicio vamos a ir introduciendo mediante teclado s�lo m�ltiplos de 3, los que no lo sean no se van a almacenar.	
	 */
		System.out.println("�Cu�ntos valores desea introducir en el array?");
		//Especificamos de que tama�o queremos que sea nuestro array
		int a[] = new int[sc.nextInt()];
		int i = 0;
		
		System.out.println("Debe itroducir m�ltiplos de 3");
		do {
			int num = sc.nextInt();
			if (num % 3 == 0) {
				a[i] = num;
				//Pasa a la siguiente posici�n del array si el n�mero es m�ltiplo de 3
				i++;
				System.out.println("Introduzca otro n�mero: ");
			}else {
				System.out.println("N�mero no m�ltiplo de tres, vuelva a introducir otro n�mero!!");
				
			}
		}while (i < a.length);
		 for (i = 0; i < a.length; i++) {
			 System.out.println(a[i]);
		 }
		
	}

}
