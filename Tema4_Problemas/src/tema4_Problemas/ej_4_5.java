/*
 El programa pide introducir una oracion y una palabra, y te imprime la posicion de la palabra 
 si esta en la oracion, o si no esta te imprime un cero. Nota: se ha establecido como primera 
 posicion de la oracion el 1 para evitar confusiones con palabras que no esten incluidas en el
 texto.
 @author=yo
 **/
package tema4_Problemas;
import java.util.Scanner;
public class ej_4_5 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,oracionPar="Las letras en orden par son: ",oracionImpar="Las letras en orden impar son: ";
		char letra;
		System.out.print("Introduzca una oracion de 80 caracteres o menos: ");
		oracion=teclado.nextLine();
		if (oracion.length()<=80) {
			for (int i=0; i<oracion.length(); i++) {
				letra=oracion.charAt(i);
				if (i%2==0) {
					oracionPar+=letra;
				}
				else {
					oracionImpar+=letra;
				}
			}
			System.out.println(oracionImpar);
			System.out.println(oracionPar);
		}
		if (oracion.length()>80) {
			System.out.println("La oracion debe contener 80 caracteres como maximo");
		}
	}
}