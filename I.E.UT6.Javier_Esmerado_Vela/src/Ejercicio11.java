import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
/**
 * Vamos a encontrar los dos núermos mayores de 1000 números que se van a generar aleatoriamente.
 */
		Documentacion d = new Documentacion();
		Scanner S = new Scanner (System.in);
		int[] a;
		int[] ordenado;
		a = new int[1000];
		ordenado = new int[15];
		int contador_mayores = 0;
		d.ArrayNumAleatorios(a, 0, 1000);
			Arrays.sort(a);
		for(int i = 0; i < 999 ; i++) {
			for(int j = 0; j <= ordenado.length; j++) {
				if(a[i] > contador_mayores) {
					contador_mayores = a[i];
				}
			}
		}
		System.out.println("Los 15 números mas grande son :");
		System.out.println("("+a[999]+" ,"+a[998]+" ,"+a[997]+" ,"+a[996]+" ,"+a[995]+")");
		System.out.println("("+a[994]+" ,"+a[993]+" ,"+a[992]+" ,"+a[991]+" ,"+a[990]+")");
		System.out.println("("+a[989]+" ,"+a[988]+" ,"+a[987]+" ,"+a[986]+" ,"+a[985]+")");
		
	}

}
