

import java.util.Scanner;
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		/**
		 * En este ejercicio vamos a pedir a nuestro programa que nos diga en que posici�n se encuentra un n�mero especificado.
		 */
		Documentacion d = new Documentacion();
		Scanner sc = new Scanner(System.in);
		int[] a = {1,2,4,5,2,24,45,65,3,10};
		try {
			d.BuscarPosdeNum(a);
		}catch (Exception e){
			System.out.println("Este n�mero no se encuentra en el array");
		}
		
	}

}
