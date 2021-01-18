/**
 * 
 * @author esmer
 *
 */

public class Ejercicio21 {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
/**
 * En este programa vamos a intercambiar el valor mayor de un array con el menor de otro
 */
		Documentacion d = new Documentacion();
		int[] a = new int[20];
		int[] b = new int[20];
		d.ArrayNumAleatorios(a, 1, 30);
		d.ArrayNumAleatorios(b, 1, 30);
		d.NumeroMayorArray(a);
		d.NumeroMenorArray(b);
		d.IntercambioMyMeArray(a, b);
	}

}
