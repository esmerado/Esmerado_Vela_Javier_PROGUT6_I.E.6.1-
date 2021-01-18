import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio31 {

	public static void main(String[] args) {
		/**
		 * Modifica el código del ejercicio anterior para que las notas se almacenen en un
		 * vector de datos double.
		 */
		Scanner S = new Scanner (System.in);
		String notas[] = new String [5];
		String alumnos [] = new String [5];
		double calificacion [] = new double [5];
		for(int i = 0;i<alumnos.length;i++) {
			System.out.println("Introduzca los alumnos ");
				alumnos[i] = S.nextLine();;
		}
		for(int i = 0; i < calificacion.length; i++) {
			System.out.println("Introduzca las notas de los alumnos");
				calificacion[i] = S.nextDouble();
		}
		for(int i = 0; i < notas.length;i++) {
			StringTokenizer st = new StringTokenizer(alumnos[i]);
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken()+"\n"+calificacion[i]);
			}
			
		}
	}
        
	

}
