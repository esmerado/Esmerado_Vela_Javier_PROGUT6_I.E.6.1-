
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio17 {

	public static void main(String[] args) {
/**
 * Tenemos nuestra matriz y vamos a sacar el mayor y el menor
 */
		Documentacion d = new Documentacion();
		int[][] a = new int[10][5];
		d.MatrizNumAleatorios(a, 0, 100);
		d.RecorrerMatriz(a);
		d.MayorNumMatriz(a);
		d.MenorNumMatriz(a);
		

	}

}
