import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio29 {

	public static void main(String[] args) {
/**
 * Verificar si una cadena de texto almacenada en la String nif, es un NIF correcto
*  o no.
 */
		Scanner sc = new Scanner(System.in);
		Documentacion d = new Documentacion();
		String nif;
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		
		System.out.println("Introduzca su NIF con formato XXXXXXXXL: ");
		nif = sc.next();
		Matcher mat = patron.matcher(nif);
		char[] a = nif.toCharArray(); 
		
		while(!mat.matches()){
	           System.out.println("El DNI introducido es incorrecto, por favor introduzca un DNI válido.");
	           System.out.print("Introduce un DNI correcto: ");
	           nif = sc.nextLine();
	           mat = patron.matcher(nif);
	        }
		System.out.println("El DNI " + nif + " es válido.");
	}

}
