package Problema3;
import java.util.Scanner;
public class Ej_3_3 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int number;
		System.out.print("Introduce un numero: ");
		number=teclado.nextInt();
		for(int i=2; i<number; i++) {
			if (number%i==0)
				System.out.println("El numero "+i+" es divisor propio de " +number+".");
			else if (number==2 || number==3)
				System.out.println("El numero "+number+" no tiene divisores propios.");
		}	
	}
}