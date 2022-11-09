/*
 El programa pide introducir una oracion y una palabra, y te imprime la posicion de la palabra 
 si esta en la oracion, o si no esta te imprime un cero. Nota: se ha establecido como primera 
 posicion de la oracion el 1 para evitar confusiones con palabras que no esten incluidas en el
 texto.
 @author=yo
 **/
package tema4_Problemas;
import java.util.Scanner;
public class ej_4_4 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,oracionMayus,oracionMinus;
		int opcion;
		System.out.print("Introduzca una oracion de 80 caracteres o menos: ");
		oracion=teclado.nextLine();
		if (oracion.length()<=80) {
			System.out.print("Si desea convertir la oracion a mayusculas, escriba 1 , y si desea convertirla a minusculas, escriba 0: ");
			opcion=teclado.nextInt();
			if(opcion==1) {
				oracionMayus=oracion.toUpperCase();
				System.out.println(oracionMayus);
			}
			else if (opcion==0){
				oracionMinus=oracion.toLowerCase();
				System.out.println(oracionMinus);
			}
			else {
				System.out.println("Por favor, introduzca unicamente 1 o 0");
			}
		}
		if (oracion.length()>80) {
			System.out.println("La oracion debe contener 80 caracteres como maximo");
		}
	}
}