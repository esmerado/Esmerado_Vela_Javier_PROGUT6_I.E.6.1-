import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio28 {

	public static void main(String[] args) {
/**
 * Vamos a leer una cadena de car�cteres y ver si es un pal�ndromo.
 */
		Scanner sc = new Scanner(System.in);
		Documentacion d = new Documentacion();
		String string = new String();
		StringBuilder palindromo = new StringBuilder(string);
		StringBuilder sb = new StringBuilder(palindromo.reverse());
		System.out.println("Escriba la frase que quiera saber si es palindromo(todo min�scula): ");
		string = sc.next();
		
		//Condici�n para saber si en un pal�ndromo
		if (palindromo.toString().equals(sb.toString())) {
			System.out.println("Es pal�ndromo!!");
		}else {
			System.out.println("No es pal�ndromo!!");
		}
		
	}

}
