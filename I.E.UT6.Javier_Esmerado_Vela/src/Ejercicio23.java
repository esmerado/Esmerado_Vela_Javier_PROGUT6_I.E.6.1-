/**
 * 
 * @author esmer
 *
 */
public class Ejercicio23 {

	public static void main(String[] args) {
		/**
		 * En este programa vamos a ver si dos array están contenidos o no
		 */
		Documentacion d = new Documentacion();
		int[] a = {1,2,3,4,7,8,4,3,8,1};
		int[] b = {1,2,3,4,7,8,4,3,8,1};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i] && a[i+1] == b[i+1] && a[i+2] == b[i+2] && a[i+3] == b[i+3]) {
				System.out.println("Los arrays están contenidos!!");
			}else {
				System.out.println("Los arrays no están contenidos!!");
			}
		}
		
	}

}
