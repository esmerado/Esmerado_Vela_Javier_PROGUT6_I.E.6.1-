import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio42 {

	public static void main(String[] args) {
/**
 * Vamos a ordenar filas concretas de una matriz
 */
		Scanner sc = new Scanner (System.in);
		Documentacion d = new Documentacion();
		int a[][] = new int[5][5];
		d.MatrizNumAleatorios(a, 0, 50);
		d.RecorrerMatriz(a);
		try {
		System.out.println("Qué columnda desea ordenar: ");
		int columna = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("ERROR!!");
		}
		d.ej42(a);
		System.out.println("Su matriz totalmente ordenada  sería : ");
		d.RecorrerMatriz(a);
	}
}
