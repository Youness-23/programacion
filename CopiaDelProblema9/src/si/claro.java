package si;
import java.util.Scanner;
public class claro {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int a,resultado;
		System.out.print("Introduce un numero: ");
		a=teclado.nextInt();
		int cont=a;
		while(a>0) {
			cont--;
			resultado=a*cont;
			System.out.print("El factorial del numero "+a+" es "+resultado+".");
		}
	}
}