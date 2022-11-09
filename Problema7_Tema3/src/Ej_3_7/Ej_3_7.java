package Ej_3_7;
import java.util.Scanner;
public class Ej_3_7 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int a,mayor,menor,suma=0,cont=0;
		System.out.print("Introduce un numero: ");
		a=teclado.nextInt();
		menor=mayor=a;
		while(a!=0) {
			suma+=a;
			cont++;
			if(a<menor)
				menor=a;
			if(a>mayor)
				mayor=a;
			System.out.println("Introduce otro numero: ");
			a=teclado.nextInt();
			if (a==0) {	
				System.out.println("La media de los numeros introducidos es "+suma/cont+".");
				System.out.println("El mayor numero introducido es "+mayor+".");
				System.out.println("El menor numero introducido es "+menor+".");
				break;
			}
		}
	}
}