import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio41 {

	public static void main(String[] args) {
/**
 * Vamos a generar una matrzi caracol
 */
		Scanner sc = new Scanner(System.in);
		Documentacion d = new Documentacion();
		System.out.print("Dimesión De La Matriz: ");
        int n = sc.nextInt();
        d.mostrarMatrizCaracol(d.generarMatrizCaracol(n, 1), n, n);
	}

}
