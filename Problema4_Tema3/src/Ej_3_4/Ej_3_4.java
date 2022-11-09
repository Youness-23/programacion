package Ej_3_4;
import java.util.Scanner;
public class Ej_3_4 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		boolean primo = true;
		int numero,divisor=2;
		System.out.print("Introduzca un numero: ");
		numero=teclado.nextInt(); 
		
		
//		for(divisor=2; divisor<numero && primo; divisor++) {
//			if (numero%divisor==0) {
//				primo=false;
//			}
//		}
		
			while( divisor<numero/2 && primo) {
			if (numero%divisor==0) {
				primo=false;
			}
			divisor++;
		}
		if (primo==true) {
			System.out.println("El numero "+numero+" es primo");
		}
		else {
			System.out.println("El numero "+numero+" no es primo");
		}
		
	}
}