package examen;

import java.util.Scanner;

public class ejercicio1{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num,esp=0;
		String cadena="";
		System.out.print("Introduce un numero natural: ");
		num=teclado.nextInt();
		int num2=num;
		if (num>0) {
			System.out.println("N="+num);
			while(num>0) {
				for(int i=num; i>0; i--) {
						cadena+='*';
						
				}
				System.out.println(cadena);
				cadena="";
				num--;
				while(num>0)
					if(num<num2) {
					cadena+=' ';
				}
			}
		}
	}
}