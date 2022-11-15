package tema4_Problemas;
import java.util.Scanner;
public class ej4_11 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,cadena="";
		int cantidad_letras=0;
		char letra,letra1;
		System.out.print("Introduzca una oracion: ");
		oracion=teclado.nextLine().toUpperCase();
		if (oracion.length()<=60) {
			for (int i=0; i<oracion.length(); i++) {
				letra=oracion.charAt(i);
				for (int j=0; j<cadena.length(); j++) {
					letra1=cadena.charAt(j);
					if (letra!=letra1) {
						cadena+=letra;
						cantidad_letras++;
					}
				}//cierre bucle anidado
			}//cierre bucle principal
		}//cierre condicion de extension de la frase
		else {
			System.out.println("Por favor, introduzca una oracion con menos de 60 caracteres.");
		}
			System.out.println(cadena);
			System.out.println(cantidad_letras);
	}
}
/* cadena=teclado.nextLine().toUpperCase();
 * int distintas=0;
 * for (int i=0; i<cadena.length(); i++)
 *		char letra = cadena.charAt(i);
 *		boolean nueva=true;
 * 		for (int j=0; j<i; j++)
 * 			if ( letra==cadena.charAt(j))
 * 				nueva=false;
 * 			if (nueva==true)
 * 				distintas++;
 * 				int cont=1;
 * 				for (int j=i+1; j<cadena.length(); j++)
 * 					if (letra== cadena.charAt(j))
 * 						cont++;
 * 					System.out.println("La frecuencia de "+letra+" es "+(float)cont/cadena.length);
 * 					System.out.format("La frecuencia de "+letra+" es %.3f%n"+(float)cont/cadena.length
 */
/* cadena=teclado.nextLine().toUpperCase();
 * int distintas=0;
 * for (int i=0; i<cadena.length(); i++)
 *		char letra = cadena.charAt(i);
 *		boolean nueva=true;
 * 		int k=0;
 * 		while (k<i && nueva)
 * 			if(letra==cadena.charAt(k)
 * 				nueva=false;
 * 				k++;
 * 		if (nueva==true)
 * 			distintas++;
 * 			int cont=1;
 * 			for (int j=i+1; j<cadena.length(); j++)
 * 				if (letra== cadena.charAt(j))
 * 					cont++;
 * 					System.out.println("La frecuencia de "+letra+" es "+(float)cont/cadena.length);
 * 					System.out.format("La frecuencia de "+letra+" es %.3f%n"+(float)cont/cadena.length
 */