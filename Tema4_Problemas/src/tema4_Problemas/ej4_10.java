package tema4_Problemas;
import java.util.Scanner;
public class ej4_10 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String codigo;
		int cod_validos=0,h_primero=0,m_primero=0,h_segundo=0,m_segundo=0;
		System.out.print("Introduzca un codigo de alumno: ");
		codigo=teclado.nextLine();
		if (codigo.length()==8) {
			while (!(codigo.equals("00000000"))) {
				int first4chars=Integer.parseInt(codigo.substring(0,4));
				if (1990<=first4chars && first4chars<=1995) {
					if(codigo.charAt(4)=='H' && codigo.charAt(5)=='1') {
							h_primero++;
							cod_validos++;
					}
					else if (codigo.charAt(4)=='H' && codigo.charAt(5)=='2') {
							h_segundo++;
							cod_validos++;
					}
					else if(codigo.charAt(4)=='M'&& codigo.charAt(5)=='1') {
							m_primero++;
							cod_validos++;
					}
					else if (codigo.charAt(4)=='M'&& codigo.charAt(5)=='2') {
							m_segundo++;
							cod_validos++;
					}
					else
						System.out.println("El quinto caracter debe ser H (hombre) o M(mujer), y el sexto caracter debe ser 1 o 2 para primero o segundo curso.");
				}
				else {
					System.out.println("Los primeros caracteres deben ser el ano de nacimiento, que sera entre 1990 y 1995.");
					}
				System.out.print("Introduce otro codigo: ");
				codigo=teclado.nextLine();
				if (codigo.equals("00000000")) {
					System.out.println("Hay "+h_primero+" hombres y "+m_primero+" mujeres en primero, y en segundo hay "+h_segundo+" hombres y "+m_segundo+" mujeres. En total hay "+cod_validos+" alumnos.");
					break;
				}
			}//cierre bucle
		}//cierre codigo.length
		else
			System.out.println("El codigo debe ser de 8 caracteres.");
	}
}


