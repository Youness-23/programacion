package tema4_Problemas;
import java.util.Scanner;
public class ej_4_9 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String oracion,oracion1;
		char caracter,caracter1;
		int num;
		System.out.print("Introduzca una oracion para codificar: ");
		oracion=teclado.nextLine();
		System.out.print("Introduce un numero entre 1 y 10: ");
		num=teclado.nextInt();
		oracion1=oracion.toUpperCase();
		for (int i=0; i<oracion1.length(); i++) {
			caracter=oracion1.charAt(i);
			if (caracter!=' ') {
				if (caracter!='X' && caracter!='Y' && caracter!='Z') {
					caracter+=num;
					System.out.print(caracter);
				}
				else switch (caracter) {
				case 'X':
					if (num<3) {
						caracter+=num;
						System.out.print(caracter);
					}
					else {
						caracter1=0;
						caracter1+=caracter-('Z'-'A'+1)+num;//restamos 2 por descontar el valor ya sumado para llegar a 'Z'
						System.out.print(caracter1);
					}
					break;
				case 'Y':
					if (num<2) {
						caracter+=num;
						System.out.print(caracter);
					}
					else {
						caracter1=0;
						caracter1+=caracter-('Z'-'A'+1)+num;//restamos 1 por descontar el valor ya sumado para llegar a 'Z'
						System.out.print(caracter1);
					}
					break;
				case 'Z':
					caracter1=0;
					caracter1+=caracter-('Z'-'A'+1)+num;
					System.out.print(caracter1);
					break;
				}
			}
			else
				System.out.print(caracter);
		}
	}
}