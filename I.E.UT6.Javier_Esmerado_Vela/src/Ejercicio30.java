import java.util.StringTokenizer;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio30 {

	public static void main(String[] args) {
/**
 * 	Realiza un programa que muestre por pantalla por cada alumno
 */
		String nombre="Javi \n 10 \n Nadida \n 9 \n Esmerado \n 5 \n";
	    StringTokenizer tokens=new StringTokenizer(nombre);
        while(tokens.hasMoreTokens()){
            System.out.println("El alumno "+tokens.nextToken()+" ha sacado la nota "+tokens.nextToken());
        }
    }
	

}
