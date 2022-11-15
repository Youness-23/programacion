package prueba.java;
import java.util.Scanner;
public class pruebecita{
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String cadena;
		int cont=1;
		System.out.print("Introduce una frase:");
		cadena=teclado.nextLine().toUpperCase();
		int distintas=0;
			for (int i=0; i<cadena.length(); i++) {
				char letra=cadena.charAt(i);
		 		boolean nueva=true;
		 		int k=0;
		 		while (k<i && nueva) {
		 			if(letra==cadena.charAt(k)){
		 				nueva=false;
		 			}
	 				k++;
		 		}
		 		if (nueva==true) {
		 			distintas++;
		  			for (int j=i+1; j<cadena.length(); j++)
		  				if (letra== cadena.charAt(j))
		 					cont++;
		  			System.out.println("La frecuencia de "+letra+" es "+(float)cont/cadena.length());
		 		}
			}System.out.println("El numero de letras distintas es:"+distintas);
	}
}