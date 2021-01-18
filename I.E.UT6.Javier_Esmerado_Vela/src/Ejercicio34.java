import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio34 {

	public static void main(String[] args) {
/**
 * Diseñar un programa que muestre un cuadrado latino de N x N.
 */
		Documentacion d = new Documentacion();
		Scanner sc = new Scanner(System.in);
		int FILAS;
        int COLS;
        
       System.out.println("Qué número de filas desea tener??");
       FILAS = sc.nextInt();
       System.out.println("Qué número de columnas desea tener??");
       COLS = sc.nextInt();
       int matriz[][]= new int [FILAS][COLS];
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                if (fil==0) matriz[fil][col]=col+1;
                else if(col==0) matriz[fil][col]= matriz[fil-1][COLS-1];
                else matriz[fil][col]= matriz[fil-1][col-1];
            }
        }
       
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (matriz[i][j]<10) System.out.printf("   %d",matriz[i][j]);
                else System.out.printf("  %d",matriz[i][j]);
            }
            System.out.println();
        }
		
		
	}

}
