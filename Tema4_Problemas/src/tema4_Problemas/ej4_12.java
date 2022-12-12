/*sin acabar*/

package tema4_Problemas; 
import java.util.Scanner;
public class ej4_12 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion="",oracion2="";
		char caracter;
		System.out.print("Introduzca una oracion: ");
		oracion=teclado.nextLine();
		if (oracion.length()<=20) {
			System.out.println(oracion);
			for (int i=0; i<oracion.length(); i++) {
				if (i==oracion.length()-1) {
					caracter=oracion.charAt(i);
					oracion2+=caracter;
				}
			}
			for (int j=0; j<oracion.length()-1; j++) {
					caracter=oracion.charAt(j);
					oracion2+=caracter;
				
					
			}
			System.out.println(oracion2);
		}
		
		else
			System.out.println("Por favor, introduzca una oracion con menos de 20 caracteres.");
		
	}
}