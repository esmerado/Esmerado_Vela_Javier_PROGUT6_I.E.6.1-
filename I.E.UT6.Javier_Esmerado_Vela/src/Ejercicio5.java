

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
	 * En este ejercicio vamos a ir introduciendo mediante teclado sólo múltiplos de 3, los que no lo sean no se van a almacenar.	
	 */
		System.out.println("¿Cuántos valores desea introducir en el array?");
		//Especificamos de que tamaño queremos que sea nuestro array
		int a[] = new int[sc.nextInt()];
		int i = 0;
		
		System.out.println("Debe itroducir múltiplos de 3");
		do {
			int num = sc.nextInt();
			if (num % 3 == 0) {
				a[i] = num;
				//Pasa a la siguiente posición del array si el número es múltiplo de 3
				i++;
				System.out.println("Introduzca otro número: ");
			}else {
				System.out.println("Número no múltiplo de tres, vuelva a introducir otro número!!");
				
			}
		}while (i < a.length);
		 for (i = 0; i < a.length; i++) {
			 System.out.println(a[i]);
		 }
		
	}

}
