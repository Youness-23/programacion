package tema4_Problemas;
import java.util.Scanner;
public class ej_4_8 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,oracion1;
		char caracter,caracter1;
		System.out.print("Introduzca una oracion para codificar: ");
		oracion=teclado.nextLine();
		oracion1=oracion.toUpperCase();
		for (int i=0; i<oracion1.length(); i++) {
			caracter=oracion1.charAt(i);
			if (caracter!=' ') {
				if (caracter!='X' && caracter!='Y' && caracter!='Z') {
					caracter+=3;
					System.out.print(caracter);
				}
				else switch (caracter){
				case 'X':
						caracter1=0;
						caracter1+=caracter-('Z'-'A'+1)+3;
						System.out.print(caracter1);
					break;
				case 'Y':
						caracter1=0;
						caracter1+=caracter-('Z'-'A'+1)+3;
						System.out.print(caracter1);
					break;
				case 'Z':
					caracter1=0;
					caracter1+=caracter-('Z'-'A'+1)+3;
					System.out.print(caracter1);
					break;
				}
			}
			else
				System.out.print(caracter);
		}
	}
}