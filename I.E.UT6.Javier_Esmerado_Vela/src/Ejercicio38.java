import java.util.Scanner;

/**
 * 
 * @author esmer
 *
 */
public class Ejercicio38 {

	public static void main(String[] args) {
/**
 * Factorial de un número utilizando recursividad
 */
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();
         
        System.out.println("\nEl factorial de " + num + " es: " + factorial(num));
    }
     
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }
		

}
