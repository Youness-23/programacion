package Ej_3_6;
import java.util.Scanner;
public class Ej_3_6 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int a,cont=1,par=0,impar=0;
		System.out.print("Introduce un numero: ");
		a=teclado.nextInt();
		while(a!=0) {
			if(cont%2==0)
				par+=a;
			else
				impar+=a;
			cont++;
			System.out.println("Introduce otro numero");
			a=teclado.nextInt();
			if (a==0) {	
				System.out.println("El resultado de la suma de los numeros introducidos en orden impar es "+impar+".");
				System.out.println("El resultado de la suma de los numeros introducidos en orden par es "+par+".");
				break;
			}
		}
	}
}
	