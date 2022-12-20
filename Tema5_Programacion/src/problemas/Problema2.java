package problemas;

import java.util.Scanner;

public class Problema2 {
	
	private static boolean esMayor (int p, int q) {
		int cont_p=0,cont_q=0;
		boolean mayor;
		mayor = true;
		for (int i=2; i < p; i++) {
			if ( p % i == 0 ) {
				cont_p++;
			}
		}
		for (int j=2; j < q; j++) {
			if ( q % j == 0 ) {
				cont_q++;
			}
		}
		if(cont_p > cont_q) {
			mayor=true;
		}
		if(cont_p < cont_q) {
			mayor=false;
		}
		return mayor;
	}//cierre del private
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean mayor=true;
		int p,q;
		
		System.out.print("Introduce un numero P: ");
		p=teclado.nextInt();
		System.out.print("Introduce un numero Q: ");
		q=teclado.nextInt();
		mayor=esMayor(p,q);
		System.out.print("El numero "+p+" tiene "+(mayor? " mas " :" menos ")+" divisores que "+q+".");
	}
}//cierre clase