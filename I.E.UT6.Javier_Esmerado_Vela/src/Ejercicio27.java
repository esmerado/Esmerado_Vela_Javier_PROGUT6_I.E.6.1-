/**
 * 
 * @author esmer
 *
 */
public class Ejercicio27 {

	public static void main(String[] args) {
	/**
	 * 	Dado un String vamos a realizar lo siguiente:
	 * 	-Mostrar cadena de caracteres invertidos
	 * 	-Mostrar por consola las veces que aparecen algunas letras
	 * 	-Buscar una palabra que realicemos por teclado
	 */
		StringBuilder sb = new StringBuilder("hola me llamo javier esmerado");
		String s = new String();
		s = sb.toString();
		//Invertimos carácteres
		sb.reverse();
		System.out.println("Caráceres invertidos: ");
		System.out.println(sb);
		
		//Mostramos el número de veces que se repiten a, o y e
		char[] c = s.toCharArray();
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for (int w = 0; w < c.length; w++) {
			if (c[w] == 'a') {
				a++;
			}else if (c[w] == 'o') {
				o++;
			}else if (c[w] == 'e') {
				e++;	
			}
		}
		if (a >= 10) {
			System.out.println("Exceso de A");
		}else if (o >= 5) {
			System.out.println("Exceso de O");
		}else if (e >= 3) {
			System.out.println("Exceso de E");
		}
		System.out.println("Las A se repiten: "+a);
		System.out.println("Las E se repiten: "+e);
		System.out.println("Las O se repiten: "+o);
		
	}

}
