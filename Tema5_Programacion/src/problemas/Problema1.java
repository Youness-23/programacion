package problemas;
import java.util.Scanner;

public class Problema1{
	
	private boolean esPrimo(int numero) {
		int cont=2;
		boolean primo;
		primo=true;
		while (primo && cont<numero) {
			primo=numero % cont++ !=0;
		}
		return primo;
	}
	
	
	public static void main(String[]args) {
		Scanner teclado=new Scanner(System.in);
		int numero;
		boolean primo;
		
		System.out.println("Introduce un numero: ");
		numero=teclado.nextInt();
		Problema1 p=new Problema1(); //si no hay static se tiene que añadir una clase a traves de un objeto
		primo=p.esPrimo(numero);
		System.out.print("El numero "+numero+(primo? "" :" no ")+" es primo.");
	}
}