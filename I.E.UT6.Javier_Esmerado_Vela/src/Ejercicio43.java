import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio43 {

	public static void main(String[] args) {
/**
 * Dada una matriz, debemos averiguar si alguna columna de la matriz es igual a nuestro array
 */
		Scanner S = new Scanner (System.in);
		int nFilas;
		int nColumnas;
		int matriz[][];
		int nElementos;
		int vector[];
		int contador = 0;
		int opcion;
		System.out.println("Introduzca el n�mero de filas de su matriz : ");
		nFilas = S.nextInt();
		System.out.println("Introduzca el n�mero de columnas de su matriz : ");
		nColumnas = S.nextInt();
		
		matriz = new int[nFilas][nColumnas];
		
		for(int i = 0; i < nFilas; i++) {
			for(int j = 0; j < nColumnas; j++) {
				matriz[i][j] = S.nextInt();
			}
		}
		System.out.println("Vamos a representar su matriz previamente introducida : ");
		for(int i = 0; i < nFilas; i++) {
			for(int j = 0; j < nColumnas; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("Ahora, vamos a mostrar la matriz pero con las columnas y las filas cambiadas");
		for(int i = 0; i < nFilas; i++) {
			for(int j = 0; j < nColumnas; j++) {
				System.out.print(matriz[j][i]);
			}
			System.out.println("");
		}
		System.out.println("A continuaci�n, vamos a representar su vector : ");
		System.out.println("Por favor, la dimensi�n de su vector tiene que ser de la misma dimensi�n de su matriz");
		nElementos = S.nextInt();
		
		vector = new int [nElementos];
		System.out.println("Vaya introduciendo los n�meros que van a formar su vector");
		for(int i = 0; i < nElementos; i++) {
			vector[i] = S.nextInt();
		}
		System.out.println("Su vector quedar�a as� : ");
		for(int i = 0; i < nElementos; i++) {
			System.out.println(vector[i]);
		}
		
		for(int i = 0; i < nFilas; i++) {
			for(int j = 0; j < nElementos; j++) {
				if(matriz[i][i] == vector[j]) {
					contador++;
				}
			}
		}
		System.out.println("Coincide "+contador);
		if(contador >= 1) {
			System.out.println("�Por qu� m�todo de ordenaci�n quiere ordenar la columna?");
			System.out.println("\t 1. M�todo Burb�ja ");
			System.out.println("\t 2. M�todo por Inserci�n Directa ");
			System.out.println("\t 3. M�todo por Selecci�n Directa");
			opcion = S.nextInt();
			switch(opcion) {
			case 1 :
				int aux;
				for(int i = vector.length; i > 0; i--) {
					for(int j = 0; j < i - 1; j++) {
						if(vector[j] > vector[j + 1]) {
							aux = vector[j + 1];
							vector[j + 1] = vector[j];
							vector[j] = aux;
						}
					}
				}
				System.out.println("La columna ordenada ascendientemente por el m�todo burb�ja ser�a : ");
				for(int i = 0; i < nElementos; i++) {
					System.out.println(vector[i]);
				}
				break;
			case 2 :
				int n = vector.length;
				for(int i = 1; i < n; i++) {
					int v = vector[i];
					int j = i - 1;
				while(j >= 0 && vector[j] > v) {
					vector[j + 1] = vector[j];
					j--;
				}
				vector[j + 1] = v;
				}
				System.out.println("La columna ordenada por el m�todo de inserci�n directa es : ");
				for(int i = 0; i < nElementos; i++) {
					System.out.println(vector[i]);
				}
				break;
			case 3:
				int s = vector.length;
				for(int i = 0; i < s - 1; i++) {
					int posMin = i;
					for(int j = i + 1; j < s; j++) {
						if(vector[j] < vector[posMin]) {
							posMin = j;
						}
					}
					int auxi = vector[i];
					vector[i] = vector[posMin];
					vector[posMin] = auxi;
				}
				System.out.println("La columna ordenada por el m�todo de selecci�n directa es : ");
				for(int i = 0; i < nElementos; i++) {
					System.out.println(vector[i]);
				}
			}
		}		
		
	}

}
