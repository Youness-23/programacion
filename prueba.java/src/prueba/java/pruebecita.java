package prueba.java;
import java.util.Scanner;
public class pruebecita{
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,oracion1;
		System.out.print("Introduce una oracion: ");
		oracion=teclado.nextLine();
		char[] caracter=oracion.toCharArray();
		for (int x=0;x<caracter.length;x++)
			  System.out.println("[" + x + "] " + caracter[x]);
	}
}