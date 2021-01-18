
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
/**
 * Vamos a sumar todos los número de nuestro array para obtener la suma total y la media.
 */
		int[] a = new int[8];
		int suma = 0;
		Documentacion d = new Documentacion();
		d.ArrayNumAleatorios(a, 0, 15);
		for( int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		
		System.out.println("La suma total de los número dentro del array es: "+suma);
		System.out.println("La media total del array es: "+suma/a.length);
	}

}
