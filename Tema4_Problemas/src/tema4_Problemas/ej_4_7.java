package tema4_Problemas;
import java.util.Scanner;
public class ej_4_7 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,oracion1,numero="0123456789";
		char caracter,caracter1;
		int minusculas=0,mayusculas=0,nNumeros=0;
		System.out.print("Introduzca una oracion: ");
		oracion=teclado.nextLine();
			for (int cont=0; cont<oracion.length(); cont++) { 
				caracter=oracion.charAt(cont);
				oracion1=oracion.toUpperCase(); 
				caracter1=oracion1.charAt(cont);
				if (numero.indexOf(caracter)!=-1) {
					nNumeros++;
				}
				else if (caracter1!=caracter) {
					minusculas++;
				}
				else if (caracter1==caracter && caracter!=(' ')) {
					mayusculas++;
				}
			}
			System.out.println("Hay "+minusculas+" minusculas.");
			System.out.println("Hay "+mayusculas+" mayusculas.");
			System.out.println("Hay "+nNumeros+" numeros.");
		}
	}