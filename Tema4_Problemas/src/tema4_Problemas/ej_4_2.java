package tema4_Problemas;
import java.util.Scanner;
public class ej_4_2 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,oracion1;
		char letra,letra1;
		int mayusculas=0,minusculas=0;
		System.out.print("Introduzca una oracion: ");
		oracion=teclado.nextLine();
		if (oracion.length()>80) {
			System.out.println("Por favor, introduzca una oracion de menos de 80 caracteres");
		}
		else for (int cont=0; cont<oracion.length(); cont++) { 
				letra=oracion.charAt(cont);
				oracion1=oracion.toUpperCase(); 
				letra1=oracion1.charAt(cont);
				if (letra1==letra && letra!=' ') {
					mayusculas++;
				}
				else if (letra1!=letra) {
					minusculas++;
				}
		}
		System.out.println("Hay "+mayusculas+" mayusculas y "+minusculas+" minusculas.");
	}
}

/*
 if (char>='A' && char<='Z') --> Mayuscula
 if (char>='a' && char<='z') --> Minuscula
 */