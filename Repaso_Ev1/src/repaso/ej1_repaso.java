package repaso;

import java.util.Scanner;

public class ej1_repaso {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double euros,pesetas;
		System.out.print("Introduce una cantidad de euros: ");
		euros=teclado.nextDouble();
		pesetas=euros*166.38;
		System.out.println( pesetas);
	}
	
}