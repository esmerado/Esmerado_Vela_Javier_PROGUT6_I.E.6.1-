/**
 * 
 * @author esmer
 *
 */
public class Ejercicio37 {

	public static void main(String[] args) {
/**
 * Vamos a encontrar todos los puntos de silla
 */
		Documentacion d = new Documentacion();
		int[][] a = new int[10][10];
		d.MatrizNumAleatorios(a, 0, 100);
		for (int col = 0; col < a[0].length; col++) {
			System.out.println("\nBuscando puntos de silla en columna: " + col + "...");
			int[] menor = d.getMenorColumna(a, col);
			if (d.esMayorDeFila(menor[0], a[menor[1]])) {
				System.out.println("Punto de silla encontrado: " + menor[0]);
				System.out.println("Fila: " + menor[1] + " / Columna: " + col);
			}
		}
	}

}
