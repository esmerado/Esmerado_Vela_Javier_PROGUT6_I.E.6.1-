/**
 * 
 * @author esmer
 *
 */
public class Ejercicio20 {

	public static void main(String[] args) {
/**
 * Este programa vamos a organizar los números pares he impares en vectores
 */
		Documentacion d = new Documentacion();
		int[] a = new int[100];
		int[] p = new int[100];
		int[] im = new int[100];
		d.ArrayNumAleatorios(a, 0, 1000);
		int i = 0;
		int o = 0;
		int u = 0;
		for (int w = 0; w < a.length; w++) {
			if (a[w]%2 == 0) {
				p[i] = a[w];
				o++;
			}else if(a[w]%2 != 0) {
				im[u] = a[w];
				u++;
			}
		}
		
		System.out.println("Los pares son: ");
		d.ImprimirArray(p);
		System.out.println("Los impares son: ");
		d.ImprimirArray(im);
		
		
	}

}
