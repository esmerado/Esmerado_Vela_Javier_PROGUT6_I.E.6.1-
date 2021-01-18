import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio40 {

	public static void main(String[] args) {
/**
 * Vamos a realizar un programa para mostrar un triángulo pascal recursivo
 */
		Documentacion d = new Documentacion();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número de veces para repetir: ");
		int rows = scanner.nextInt();
		System.out.println("Triángulo Pascal:");
		d.print(rows);
		scanner.close();
		}

}
