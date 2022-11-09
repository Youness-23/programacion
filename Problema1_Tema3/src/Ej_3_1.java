/** 
  Este programa calcula e imprime la suma de los nmeros enteros comprendidos entre A y B que se leen por teclado y se filtran para que A<=B. Los valores de A y B no se incluyen en la suma.
 @author=yo
 */
import java.util.Scanner;
public class Ej_3_1 {
    public static void main(String args[]) {
        Scanner teclado= new Scanner (System.in);
        int suma=0;
        int a,b;//numeros que leeremos por teclado.
        System.out.print("Escribe el numero A:");
        a=teclado.nextInt();
        System.out.print("Escribe el numero B:");
        b=teclado.nextInt();
        if (a>b) 
        System.out.println("Error: " + a + " es mayor que "+ b);
        else { for ( int contador=a + 1; contador<b; contador++)
        suma+=contador;
        System.out.println("Suma de los numeros entre "+ a + " y " + b + " es " + suma);
        }
}
}