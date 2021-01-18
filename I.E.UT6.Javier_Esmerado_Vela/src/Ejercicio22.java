import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio22 {

	public static void main(String[] args) {
	/**
	 * Invertir diagonal principal de una matriz cuadrada
	 */
		Documentacion d = new Documentacion();
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[10][10];
		int [] b = new int[10];
		
		d.MatrizNumAleatorios(a, 0, 100);
		System.out.println("Matriz original");
		d.RecorrerMatriz(a);
		
		//Almacenamos la diagonal original
		int aux = a.length;
		for (int i = 0; i < a.length; i++) {
			b[i] = a[aux - 1][aux - 1];
			aux--;
		}
		
		//Invertimos los valores
		for (int i = 0; i < a.length; i++) {
			a[i][i] = b[i]; 
		}
		
		//Volvemos a mostrar la matriz
		System.out.println("Matriz invertida");
		d.RecorrerMatriz(a);
		
	}

}
