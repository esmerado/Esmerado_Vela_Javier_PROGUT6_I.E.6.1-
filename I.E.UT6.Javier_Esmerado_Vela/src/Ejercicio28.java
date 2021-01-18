import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio28 {

	public static void main(String[] args) {
/**
 * Vamos a leer una cadena de carácteres y ver si es un palíndromo.
 */
		Scanner sc = new Scanner(System.in);
		Documentacion d = new Documentacion();
		String string = new String();
		StringBuilder palindromo = new StringBuilder(string);
		StringBuilder sb = new StringBuilder(palindromo.reverse());
		System.out.println("Escriba la frase que quiera saber si es palindromo(todo minúscula): ");
		string = sc.next();
		
		//Condición para saber si en un palíndromo
		if (palindromo.toString().equals(sb.toString())) {
			System.out.println("Es palíndromo!!");
		}else {
			System.out.println("No es palíndromo!!");
		}
		
	}

}
