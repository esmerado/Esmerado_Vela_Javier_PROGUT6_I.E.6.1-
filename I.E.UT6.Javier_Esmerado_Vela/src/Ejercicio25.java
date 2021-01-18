import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio25 {

	public static void main(String[] args) {
/**
 * Vamos a sustituir las palabras que tengan un carácter en blanco
 */
		Documentacion d = new Documentacion();
		String[] a = {"Nadia"," ","Javi"," ","JaviJR"," ","Lando"," ","Matilda"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Array sin modificar");
		d.ImprimirStringArray(a);
		for(int i = 0; i < a.length; i++) {
			if(a[i] == " ") {
				
			}else {
				System.out.println("¿Que nuevo nombre desea introducir?");
				a[i] = sc.next();
			}
		}
		System.out.println("Array modificado!!");
		d.ImprimirStringArray(a);
	}

}
