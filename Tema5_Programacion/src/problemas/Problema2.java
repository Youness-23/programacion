package problemas;

import java.util.Scanner;

public class Problema2 {
	/*
	private static boolean divisores (int p, int q){
		int p,q;
	}
	*/
	private int divisores_p (int p) {
		int div=1,cont_p=0;
		while ( div<p ) {
			if ( p % div == 0 ) {
				cont_p++;
				div++;
			}
		}
		return p;
	}
	private int divisores_q (int q) {
		int div=1,cont_q=0;
		while ( div<q ) {
			if ( q % div == 0 ) {
				cont_q++;
				div++;
			}
		}
		return q;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean mayor=true;
		int p,q,cont_p,cont_q;
		
		System.out.print("Introduce un numero P: ");
		p=teclado.nextInt();
		System.out.print("Introduce un numero Q: ");
		q=teclado.nextInt();
		Problema2 x=new Problema2();
		cont_p=x.divisores_p(p);
		cont_q=x.divisores_q(q);
		if ( cont_p > cont_q ) {
			mayor=true;
		}else if ( cont_p < cont_q) {
			mayor=false;
		}
		System.out.print("El numero "+p+" tiene "+(mayor? " mas " :" menos ")+" divisores que "+q+".");
	}
}//cierre clase