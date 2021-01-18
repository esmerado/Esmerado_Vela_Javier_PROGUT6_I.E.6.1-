
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
	/**
	 * Vamos a crear un programa que nos imprima el array inverso.
	 */
		Documentacion d = new Documentacion();
		int[] a = new int[20];
		/**
		 * Array normal
		 */
		d.ImprimirArray(a);
		System.out.println("Ahora el array inverso");
		/**
		 * Array inverso
		 */
		d.ArrayInverso(a);
		
	}

}
