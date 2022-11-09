/*
 El programa pide introducir una oracion y una palabra, y te imprime la posicion de la palabra 
 si esta en la oracion, o si no esta te imprime un cero. Nota: se ha establecido como primera 
 posicion de la oracion el 1 para evitar confusiones con palabras que no esten incluidas en el
 texto.
 @author=yo
 **/
package tema4_Problemas;
import java.util.Scanner;
public class ej_4_3 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,palabra;
		System.out.print("Introduzca una oracion: ");
		oracion=teclado.nextLine();
		System.out.print("Introduzca una palabra: ");
		palabra=teclado.nextLine();
		if(oracion.indexOf(palabra)+1==-1) {
				System.out.println("0");
			}
			else {
				System.out.println("La palabra "+palabra+" esta en la posicion "+(oracion.indexOf(palabra)+1));
			}
	}
}