/**
 * 
 * @author esmer
 *
 */
public class Ejercicio18 {

	public static void main(String[] args) {
/**
 * Vamos a almacenar en un vector 20 números y mostraremos la suma de los elementos
 * en las posiciones pares y sacaremos el mayor de las posiciones impares.
 */
		Documentacion d = new Documentacion();
		int[] a = new int[20];
		d.ArrayNumAleatorios(a, 0, 100);
		d.SumaParesArray(a);
		d.NumeroMayorArrayImpares(a);
		
	}

}
	