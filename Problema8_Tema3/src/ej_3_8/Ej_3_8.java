package ej_3_8;
import java.util.Scanner;
public class Ej_3_8 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int a,resfinal;
		System.out.print("Introduce un numero: ");
		a=teclado.nextInt();
		int resultado=a;
		for(int cont = a-1; cont>0; cont--) {
			resultado*=cont;
		}
		System.out.println("El factorial del numero "+a+" es "+resultado+".");
	}
}