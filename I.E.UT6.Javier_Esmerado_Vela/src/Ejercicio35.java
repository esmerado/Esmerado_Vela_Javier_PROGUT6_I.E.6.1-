

import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio35 {

	public static void main(String[] args) {
/**
 * Crear una agenda electr�nica
 */
		Scanner sc = new Scanner(System.in);
		Documentacion d = new Documentacion();
		String[] a = new String[3];
		int num;
		
		
		do {
			System.out.println("Qu� acci�n desea realizar: ");
			System.out.println("1 - Introducir valores");
			System.out.println("2 - Eliminar valores");
			System.out.println("3 - Ver valores");
			System.out.println("4 - Modificar valores");
			System.out.println("0 - Salir");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Introduzca el nombre: ");
				a[0] = sc.next();
				System.out.println("Introduzca la direcci�n: ");
				a[1] = sc.next();
				System.out.println("Introduzca el n�mero de tel�fono: ");
				a[2] = sc.next();
				break;
			
			case 2:
				System.out.println("Introduzca el nombre: ");
				a[0] = null;
				a[1] = null;
				a[2] = null;break;
				
			case 3:
				if (a[0] == null) {
					System.out.println("No hay ning�n dato introducido");
				}else {
					System.out.println("Sus datos son: ");
					System.out.println("Nombre: "+a[0]);
					System.out.println("Direcci�n: "+a[1]);
					System.out.println("Tel�fono: "+a[2]);
				}break;
			case 4:
				if (a[0] == null) {
					System.out.println("No hay ning�n valor introducido!!");
				}else {
					System.out.println("Introduzca el nombre: ");
					a[0] = sc.next();
					System.out.println("Introduzca la direcci�n: ");
					a[1] = sc.next();
					System.out.println("Introduzca el n�mero de tel�fono: ");
					a[2] = sc.next();
					System.out.println("Valores modificados!!");
				}break;

			}
		}while (num != 0);
		
		System.out.println("HASTA PRONTO!!!!");
	}

}
