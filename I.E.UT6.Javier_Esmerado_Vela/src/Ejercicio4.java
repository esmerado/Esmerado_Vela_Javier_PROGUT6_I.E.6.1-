
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
/**
 * En este ejercicio vamos a sacar la media, el n�mero mayor y el menor de los n�mero que est�n en nuestro array.
 */
		int[] a = new int[10];
		int acum = 0;
		Documentacion d = new Documentacion();
		d.ArrayNumAleatorios(a, 0, 20);
		//Media
		for (int i = 0; a.length > i; i++) {
			acum += a[i];
		}
		acum /= 10;
		System.out.println("La media es: "+acum);
		
		//N�mero mayor
		int mayor = 0;
		for (int b = 0; a.length > b; b++) {
			if (a[b] > mayor) {
			mayor = a[b];
			}
		}
		System.out.println("El n�mero mayor es: "+mayor);
		
		//N�mero menor
		int menor = a[0];
		for (int b = 0; a.length > b; b++) {
			if (a[b] < menor) {
			menor = a[b];
			}
		}
		System.out.println("El n�mero menor es: "+menor);
		
	}

}
