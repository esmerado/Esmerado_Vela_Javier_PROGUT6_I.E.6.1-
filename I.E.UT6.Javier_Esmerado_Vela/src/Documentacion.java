import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Documentacion {

	Scanner sc = new Scanner(System.in);
	
	//ARAYS
	
	//Introducir valores a array
	public void introducirValoresArray(int[] a) {
		System.out.println("Introduce los valores de array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	//Suma de un array
	public void SumaUnArray(int [] a) {
		double suma = 0;
		for( int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		System.out.println("La suma es: "+suma);
	}
	
	//Suma pares de un array
	public void SumaParesArray(int [] a) {
		double suma = 0;
		int cont = 0;
		for( int i = 0; i < a.length; i++) {
			cont++;
			if (cont%2 == 0) {
				suma += a[i];
			}
		}
		System.out.println("La suma es: "+suma);
	}
	
	//Media de un array
	public void MediaUnArray(int [] a) {
		double suma = 0;
		for( int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		System.out.println("La media es: "+suma/a.length);
	}
	
	//Número mayor de un array
	public void NumeroMayorArray(int[] a) {
		int mayor = 0;
		for (int b = 0; a.length > b; b++) {
			if (a[b] > mayor) {
			mayor = a[b];
			}
		}
		System.out.println("El número mayor es: "+mayor);
	}
	
	//Intercambiar mayor y menor de un array
	public void IntercambioMyMeArray(int[] a, int[] b) {
		int mayor = 0;
		int cont = 0;
		int cont2 = 0;
		int cont3 = 0;
		for (int w = 0; a.length > w; w++) {
			if (a[w] > mayor) {
			mayor = a[w];
			}
		}
			int menor = 0;
			for (int c = 0; b.length > c; c++) {
				if (b[c] < menor) {
				menor = b[c];
				cont3++;
				}
			}
			a[cont2] = menor;
			b[cont3] = mayor;
			System.out.println("Así quedan nuestros arrays: ");
			System.out.println("Array A: ");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			System.out.println("Array B: ");
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}
	
	
	//Número mayor de un array
	public void NumeroMayorArrayImpares(int[] a) {
		int mayor = 0;
		int cont = 0;
		for (int b = 0; a.length > b; b++) {
			cont++;
			if (cont%2 != 0) {
				if (a[b] > mayor) {
					mayor = a[b];
					}
			}
		}
		System.out.println("El número mayor es: "+mayor);
	}
	
	//Número menor de un array
	public void NumeroMenorArray(int[] a) {
		int menor = a[0];
		for (int b = 0; a.length > b; b++) {
			if (a[b] < menor) {
			menor = a[b];
			}
		}
		System.out.println("El número menor es: "+menor);
	}
	
	//Encontrar posición de un número en array
	public void BuscarPosdeNum(int[] a) {
		int i = 0;
		int cont = 0;
		System.out.println("Qué número desea buscar??");
		int num = sc.nextInt();
		do {
			if (a[i] != num) {
				i++;
				cont++;
			}
		}while (a[i] != num);
		System.out.println("El número seleccionado se encuentra en la posición "+cont);
	}
	
	//Busqueda dicotómica
	public void BusquedaDicotomica(int[] a) {
		int num;
		System.out.println("Introduce el número que desea buscar:");
		num = sc.nextInt();
		Arrays.sort(a);
		
		if (Arrays.binarySearch(a, num) > 0) {
			System.out.println("El número "+num+" está en el array");
		}else {
			System.out.println("El número "+num+" no está en el array");
		}
	}
	
	//Número de repeticiones de un número
	public void RepUnNúmero(int[] a) {
		int cont = 0;
		System.out.println("Introduce el número que quieres saber cuántas veces se repite(1 al 10): ");
		int num = sc.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				cont++;
			}
		}
		System.out.println("El número se repite "+cont+" veces");
	}
	
	//Imprimir Array
	public void ImprimirArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	//Imprimir String Array
		public void ImprimirStringArray(String[] a) {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
	
	//Array Inverso
	public void ArrayInverso(int[] a) {
		for (int i = a.length - 1; i >= 0 ; i--) {
            System.out.println(a[i]);
        }
	}
	
	//Dos números mayores
	public void DosMayoresArray(int[] a) {
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < a.length; i++) {
			if ( a[i] > num1) {
				num2 = num1;
				num1 = a[i];
				
			}else if(a[i] > num2) {
				num2 = a[i];
			}
			
		}
		System.out.println("Los dos números mayores son: "+num1+" y "+num2);
	}
	
	//Array con numeros aleatorios
	public void ArrayNumAleatorios(int[] a,int num1,int num2) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*(num1-num2+1)+num2);
		}
	}
	
	//Array número primo
	public void ArrayNumPrimo(int[] a) {
		int cont = 0;
		for(int i = 0; i < 10; i++) {
			int div = 0;
			for(int j = 1; j<= a[i];j++) {
				
				if(a[i] % j == 0) {
					div++;
				}
			}
			if(div == 2) {
				System.out.println("Es primo: "+a[i]);
		}
	}
	}
	
	//Suma dos arrays
	public void SumaDosVectores(int[] a, int[] b, int[] c) {
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		
	}
	
	//Sacar número vocales
	public void sacarVocalesArray(String[] a) {
		int vocales = 0;
		for(int i = 0; i < a.length; i++) {
			if (a[i] == "a") {
				vocales++;
			}else if (a[i] == "e") {
				vocales++;
			}else if(a[i] == "i"){
				vocales++;
			}else if(a[i] == "o"){
				vocales++;
			}else if (a[i] == "u"){
				vocales++;
			}
		}
		System.out.println("Hay "+vocales+" vocales!!");
	}
	//MATRICES
	
	//Matriz numeros aleatorios
	public void MatrizNumAleatorios(int[][] a,int num1,int num2) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				a[i][j] = (int) (Math.random()*(num1-num2+1)+num2);
			}
		}

	}
	
	//Suma de dos Matrices
	public void SumaDosMatrices(int[][] a, int[][] b) {
		int suma1 = 0;
		int suma2 = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				suma1 += a[i][j];
			}
		}
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				suma2 += b[i][j];
			}
		}
		System.out.println("La suma de las matrices es: "+(suma1+suma2));
	}
		
	
	//Recorrer Matriz
	public void RecorrerMatriz(int[][] a) {
		for (int x=0; x < a.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < a[x].length; y++) {
			    System.out.print (a[x][y]);
			    if (y!=a[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
	}
	
	public void RecorrerMatrizString(String[][] a) {
		for (int x=0; x < a.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < a[x].length; y++) {
			    System.out.print (a[x][y]);
			    if (y!=a[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
	}
	
	public void RecorrerMatrizChar(char[][] a) {
		for (int x=0; x < a.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < a[x].length; y++) {
			    System.out.print (a[x][y]);
			    if (y!=a[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
	}
	
	//Mayor numero de una matriz
	public void MayorNumMatriz(int[][] a) {
		int mayor = a[0][0];
		for (int x=0; x < a.length; x++) {
			  for (int y=0; y < a[x].length; y++) 
				  if (a[x][y] > mayor) {
						mayor = a[x][y];
						}
			  }
		System.out.println("El mayor número de array es: "+mayor);
			}
	
	//Menor número de matriz
	public void MenorNumMatriz(int[][] a) {
		int menor = a[0][0];
		for (int x=0; x < a.length; x++) {
			  for (int y=0; y < a[x].length; y++) {
				  int numeroActual = a[x][y];
				  if (numeroActual < menor)
						menor = numeroActual;
						}
			  }
		System.out.println("El menor número de array es: "+menor);
			}
	
	//OTROS
	
	//Capicua
	public void esCapicua() {
		int N, aux, inverso = 0, cifra;
        do {
            System.out.print("Introduce un número >= 10: ");                                                 
            N = sc.nextInt();
        } while (N < 10);
       
        //le damos la vuelta al número
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
	
	}
	
	//CUADRADO LATINO
	public void CuadradoLatino(int fila, int columna, int cont, int orden, int[][] a) {
		if (fila == 0 && columna == 0)
	        a[0][0] = 1;
	    else
	        if (fila == columna)
	        	CuadradoLatino (fila - 1, orden - 1, orden, orden, a);
	    else
	    {
	       a[fila][columna] = cont;
	       CuadradoLatino (fila, columna - 1, orden + 1, orden, a);
	    }
	}
	
	//SOPA DE LETRAS
	
	
	public void letrasAleatorias(String[] letras, String sopa[][]) {
		for (int x=0; x < sopa.length; x++) {
			  for (int y=0; y < sopa[x].length; y++) {
				if (sopa[x][y] == null) {
					sopa[x][y] = letras[(int) (Math.random()*(0-14+1)+14)];
				}
			  }
		}
	}
	
	public static void pasarHorizontal (String sopa[][], String palabra) {
			for (int i = 0; i < palabra.length(); i++) {
				sopa[0][0+i] ="" +  palabra.toUpperCase().charAt(i);
			}
			
	}
	
	public static void pasarHorizontal2 (String sopa[][], String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			sopa[1][3+i] ="" +  palabra.toUpperCase().charAt(i);
		}
		
	}
	
	public static void pasarHorizontal3 (String sopa[][], String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			sopa[4][0+i] ="" +  palabra.toUpperCase().charAt(i);
		}
		
	}
	
	public static void pasarHorizontal4 (String sopa[][], String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			sopa[6][0+i] ="" +  palabra.toUpperCase().charAt(i);
		}
		
	}
	
	public static void pasarVertical (String sopa[][], String palabra) {
		for  (int i = 2; i < palabra.length()	; i++) {
			for (int k = 0; k < palabra.length(); k++) {
				sopa[5 + k][5] ="" +  palabra.toUpperCase().charAt(k);
			}
		}
	}
	public static void pasarVertical2 (String sopa[][], String palabra) {
		for  (int i = 2; i < palabra.length()	; i++) {
			for (int k = 0; k < palabra.length(); k++) {
				sopa[9 + k][2] ="" +  palabra.toUpperCase().charAt(k);
			}
		}
	}
	public static void pasarVertical3 (String sopa[][], String palabra) {
		for  (int i = 2; i < palabra.length()	; i++) {
			for (int k = 0; k < palabra.length(); k++) {
				sopa[2 + k][8] ="" +  palabra.toUpperCase().charAt(k);
			}
		}
	}
	public static void pasarVertical4 (String sopa[][], String palabra) {
		for  (int i = 2; i < palabra.length()	; i++) {
			for (int k = 0; k < palabra.length(); k++) {
				sopa[3 + k][10] ="" +  palabra.toUpperCase().charAt(k);
			}
		}
	}
	
	public static void DiagonalNormal (String sopa[][], String palabra) {
		for (int i = 5; i < palabra.length(); i++) {
			for (int k = 0; k < palabra.length(); k++) {
				sopa[1+k][2+k] =""+ palabra.toUpperCase().charAt(k);
			}
		}
	}
	
	public static void DiagonalNormal2 (String sopa[][], String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			for (int k = 0; k < palabra.length(); k++) {
				sopa[9+k][9+k] =""+ palabra.toUpperCase().charAt(k);
			}
		}
	}
	
	
	public void VerSopa(String sopa[][]) {
		for (int x=0; x < sopa.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < sopa[x].length; y++) {
			    System.out.print (sopa[x][y]);
			    if (y!=sopa[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
	}
	
	//PUNTOS DE SILLA
	
	

	static int[] getMenorColumna(int[][] a, int col) {
			int menor = a[0][col];
			int fila = 0;
				for (int fil = 1; fil < a.length; fil++) {
					if (a[fil][col] < menor) {
						menor = a[fil][col];
						fila = fil;
					}
				}
				return new int[] {menor, fila};
	}

	static boolean esMayorDeFila(int valor, int[] filaMatriz) {

		for (int valorFila: filaMatriz)
			if (valorFila > valor)
				return false; 
		return true;
	}

	//TRIANGULO PASCAL RECURSIVO
	public static void print(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print(" "); // print space for triangle like structure
			}
		for (int j = 0; j <= i; j++) {
			System.out.print(pascal(i, j) + " ");
		}
			System.out.println();
		}
	}
	
	public static int pascal(int i, int j) {
		if (j == 0 || j == i) {
			return 1;
		} else {
			return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}
	}
	
	
	//FIBONACCI
	static int RFib(int n) {
		if (n < 2) 
			return n;
		return RFib(n - 1) + RFib(n - 2);
	}
	
	//MATRIZ CARACOL
	
	//Generamos la matriz caracol
	  public static int[][] generarMatrizCaracol(int n, int x) {
	        int[][] M = new int[n + 1][n + 1];
	        for (int a = 1; a <= n / 2; a++) {
	            for (int i = a; i <= n - a; i++) {
	                M[a][i] = x;
	                x++;
	            }
	            for (int i = a; i <= n - a; i++) {
	                M[i][n - a + 1] = x;
	                x++;
	            }
	            for (int i = n - a + 1; i >= a + 1; i--) {
	                M[n - a + 1][i] = x;
	                x++;
	            }
	            for (int i = n - a + 1; i >= a + 1; i--) {
	                M[i][a] = x;
	                x++;
	            }
	        }
	        if (n % 2 == 1) {
	            M[n / 2 + 1][n / 2 + 1] = x;
	        }
	        return M;
	    }
	  
	  //Mostramos la matriz caracol
	  public static void mostrarMatrizCaracol(int[][] M, int f, int c) {
	        for (int i = 1; i <= f; i++) {
	            for (int j = 1; j <= c; j++) {
	                System.out.print("\t" + M[i][j]);
	            }
	            System.out.println();
	        }
	    }
	
	  
	  //ORDENAMOR POR FILAS UNA MATRIZ
	  
	  //Invertir diagonal principal
	  public static void ordenarDiagonal1(int[][] a, int[] b) {
		  int aux = a.length;
			for (int i = 0; i < a.length; i++) {
				b[i] = a[aux - 1][aux - 1];
				aux--;
			}
			
			
			
	  }
	  
	  //Ordenación por burbuja
	  public static void ordenacionBurbuja(int arr[][], int fila) {
			for (int i = fila; i <= fila; i++) {

				// Loop para las columnas
				for (int j = 0; j < arr[i].length; j++) {

					// Comparacion e intercambio
					for (int k = 0; k < arr[i].length - j - 1; k++) {
						if (arr[i][k] > arr[i][k + 1]) {

							// Intercambio de variables
							int aux = arr[i][k];
							arr[i][k] = arr[i][k + 1];
							arr[i][k + 1] = aux;
						}
					}
				}
			}
		}
	  
	  //ORdenar la diagonal y la fila
	  public void ej42(int[][] a) {
		  for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					for(int r = 0; r < 5; r++) {
						for(int h = 0; h < 5; h++) {
							if(a[i][j] >= a[r][h]) {
								a[i][j] = a[i][j];
							}else {
								int temp = a[r][h];
								a[r][h] = a [i][j];
								a[i][j] = temp;
							}
						}
					}
				}
			}
	  }
	  
}
	
	
	

