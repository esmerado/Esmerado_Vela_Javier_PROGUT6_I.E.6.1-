
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio12 {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Documentacion d = new Documentacion();
		int [] a = new int[100];
		
		int cont = 0;
		//N�nero aleatorio entre 10 y 80;
		d.ArrayNumAleatorios(a, 10, 80);
		//Conteo de n�meros que se repiten
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[i]) {
				cont++;
			}
		}
		
		//Mayor
		int mayor = 0;
		for (int b = 0; a.length > b; b++) {
			if (a[b] > mayor) {
			mayor = a[b];
			}
		}
		
		//Menor
		int menor = a[0];
		for (int b = 0; a.length > b; b++) {
			if (a[b] < menor) {
			menor = a[b];
			}
		}
		
		//Media
		int suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		
		System.out.println("N�mero que m�s se repite: "+cont);
		System.out.println("N�mero mayor: "+mayor);
		System.out.println("N�mero menor: "+menor);
		System.out.println("Media: "+suma/a.length);
	}

}
