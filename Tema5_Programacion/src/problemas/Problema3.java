package problemas;

import java.util.Scanner;

public class Problema3 {
	private static int factorial (int numero){
		int cont=numero,resultado=1;
		while (cont > 1) {
			resultado *= cont;
			cont--;
		}
		return resultado;
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero,resultado;
		System.out.print("Introduce un numero: ");
		numero = teclado.nextInt();
		
		while ( numero <=0 ) {
			System.out.print("Introduce un numero: ");
			numero = teclado.nextInt();
		}
		if ( numero > 0 ){
			resultado=factorial(numero);
			System.out.println(numero+"!="+resultado);
		}
	}
}