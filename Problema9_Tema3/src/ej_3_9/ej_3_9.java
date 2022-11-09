package ej_3_9;
import java.util.Scanner;
public class ej_3_9 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int a,resultado,suma=0;
		System.out.print("Introduce un numero: ");
		a=teclado.nextInt();
		for(int divisor=1;  divisor<=a/2;  divisor++) {
			resultado=a/divisor;
			
			if (a% divisor==0)
				suma+=divisor;
		}
		if (suma==a)
		System.out.println("El numero "+a+" es un numero perfecto.");
		else
			System.out.println("El numero "+a+" no es un numero perfecto.");
	}
}