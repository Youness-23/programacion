package tema4_Problemas;
import java.util.Scanner;
public class ej_4_1 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,cadena;
		System.out.print("Introduzca una oracion: ");
		oracion=teclado.nextLine();
		for (int i=1; i<=oracion.length(); i++) {
			if (oracion.length()<=80) {
				cadena=oracion.substring(0,i);
				System.out.println(cadena);
			}
		}
		if (oracion.length()>80)
			System.out.println("Por favor, introduzca una oracion con menos de 80 caracteres.");
		
	}
}