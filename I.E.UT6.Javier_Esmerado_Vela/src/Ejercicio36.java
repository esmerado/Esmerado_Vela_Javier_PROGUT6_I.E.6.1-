import java.util.Scanner;
/**
 * 
 * @author esmer
 *
 */
public class Ejercicio36 {

	public static void main(String[] args) {
/**
 * Vamos a crear una sopa de letras
 */
		Documentacion d = new Documentacion();
		Scanner sc = new Scanner(System.in);
		String[][] sopa = new String[15][15];
		String resul1;
		String palabras = "MUEBLE";
		String palabras1 = "CASA";
		String palabras2 = "ABUELO";
		String palabras3 = "AMOR";
		String palabras4 = "ARBOl";
		String palabras5 = "ORDEN";
		String palabras6 = "PISO";
		String palabras7 = "JAVA";
		String palabras8 = "MOVIL";
		String palabras9 = "COCHE";

		String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",};
		d.pasarHorizontal(sopa, palabras);
		d.pasarVertical(sopa, palabras1);
		d.DiagonalNormal(sopa, palabras2);
		d.pasarHorizontal2(sopa, palabras3);
		d.pasarHorizontal3(sopa, palabras4);
		d.pasarHorizontal4(sopa, palabras5);
		d.pasarVertical2(sopa, palabras6);
		d.pasarVertical3(sopa, palabras7);
		d.pasarVertical4(sopa, palabras8);
		d.DiagonalNormal2(sopa, palabras9);
		d.letrasAleatorias(letras, sopa);
		d.VerSopa(sopa);
		
		
	}

}
