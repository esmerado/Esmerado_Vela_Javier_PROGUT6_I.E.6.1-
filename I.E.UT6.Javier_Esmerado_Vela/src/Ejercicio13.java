
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {
/**
 * Vamos a crear tres vectores, en el tercer vector vamos a acumular la suma de los dos primeros vectores y vamos a mostrar el mayor
 */
		Documentacion d = new Documentacion();
		int[] a = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4};
		int[] b = {2,3,4,6,5,4,3,2,1,2,7,8,9,6,6};
		int[] c = new int[15];
		
		d.SumaDosVectores(a, b, c);
		d.NumeroMayorArray(c);
		
		
	}

}
