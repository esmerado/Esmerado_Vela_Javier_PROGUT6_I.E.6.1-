import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio39 {

	public static void main(String[] args) {
/**
 * Vamos a mostar la serie de 
 */
		Documentacion d = new Documentacion();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuántos valores de Fibonacci desea??");
		int num = sc.nextInt();
		if (num <= 0) {
			System.err.println("ERROR!!");
			System.exit(0);;
		}
		for (int i = 0; i < num; i++) {
			System.out.println(Documentacion.RFib(i));
		}
		
	}

}
