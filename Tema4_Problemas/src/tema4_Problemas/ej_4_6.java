/*
 El programa pide introducir una oracion y una palabra, y te imprime la posicion de la palabra 
 si esta en la oracion, o si no esta te imprime un cero. Nota: se ha establecido como primera 
 posicion de la oracion el 1 para evitar confusiones con palabras que no esten incluidas en el
 texto.
 @author=yo
 **/
package tema4_Problemas;
import java.util.Scanner;
public class ej_4_6 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,vocal="aeiouAEIOU",consonante="bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ",numero="0123456789";
		char caracter;
		int nVocales=0,nConsonantes=0,nNumeros=0;
		System.out.print("Introduzca una oracion de 80 caracteres o menos: ");
		oracion=teclado.nextLine();
		if (oracion.length()<=80) {
			for (int i=0; i<oracion.length(); i++) {
				caracter=oracion.charAt(i);
				if (vocal.indexOf(caracter)!=-1) {
					nVocales++;
				}
				else if (numero.indexOf(caracter)!=-1) {
					nNumeros++;
				}
				else if (consonante.indexOf(caracter)!=-1) {
					nConsonantes++;
				}
			}
			System.out.println("Hay "+nVocales+" vocales.");
			System.out.println("Hay "+nConsonantes+" consonantes.");
			System.out.println("Hay "+nNumeros+" numeros.");
		}
		if (oracion.length()>80) {
			System.out.println("La oracion debe contener 80 caracteres como maximo");
		}
	}
}