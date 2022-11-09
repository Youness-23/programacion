/**
 Este programa lee un numero que debe estar entre 1 y 10, ambos incluidos, y sacar la tabla de multiplicar de dicho numero.
  @author alu
*/ 
import java.util.Scanner;
public class Ej_3_2{
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int a,resultado;
		System.out.print("Tabla de multiplicar del numero: ");
		a=teclado.nextInt();
		if (a<1)
			System.out.println("Error: " + a + " es menor que 1");
		else if (a>10)
			System.out.println("Error: " + a + " es mayor que 10");
		else for (int contador=1; contador<11; contador++) { 
			resultado=a*contador;
			System.out.println(a+"*"+contador+"="+resultado);
		}
	}
}