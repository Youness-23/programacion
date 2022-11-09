/* Si se introduce un numero diferente de cero se almacena y se muestra dicho numero, y pide otro numero. Seguira con el bucle infinitamente hasta que se intoduzca el cero, y cuando esto ocurra el programa enseñara en pantalla el resultado de la suma de todos los numeros introducidos y se terminara el programa
		   @author=yo
		*/
package Ej_3_5;
import java.util.Scanner;
public class Ej_3_5 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int a;
		int suma=0;
		int cont=0;
		System.out.print("Introduce un numero: ");
		a=teclado.nextInt();
		while(a!=0) {
			suma+=a;
			cont++;
			System.out.println("Introduce otro numero");
			a=teclado.nextInt();
			if (a==0) {	
				System.out.println("El resultado de la suma de los numeros es "+suma+".");
				break;
			}
		}
	}
}