package ejercicios;

public class Fecha{
	Fecha origen,resultado;
	int dia,mes,anno;
	
	public Fecha () {
		System.out.println("Creando fecha");
	}
	
	public Fecha ( int dia, int mes, int anno ) {
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}
	
	int getDia ( ) {
		return dia;
	}
	
	int getMes ( ) {
		return mes;
	}
	
	int getAnno ( ) {
		return anno;
	}
	
	void setDia ( int dia ) {
		if ( mes != -1) // a validar
			switch ( mes ) {
			case 4,6,9,11:
				if ( dia > 30 )
					System.out.println("Error");
				break;
			case 2:
				if ( anno == -1) {
					if ( dia > 28 )
						System.out.println("Error");
				}else if ( anno % 4 == 0){
					if ( dia > 29)
						System.out.println("Error");
				}else if ( dia > 28 ) {
					System.out.println("Error");
				}
			}
		if ( dia < 1)
			System.out.println("Error");
		this.dia = dia;
	}
	
	void setMes ( int mes ) {
		if ( mes < 1 || mes > 12)
			System.out.println("Error");
		this.mes = mes;
	}
	
	void setAnno ( int anno ) {
		if ( anno == 0 )
			System.out.println("Error");
		this.anno = anno;
	}
//---------------------------------------------------------------------------------------
	Fecha incrementaDias(int dias) {
		 Fecha resultado=new Fecha(dia,mes,anno);
		 
		 for(int i=0;i<dia;i++) {
			 resultado.dia++;
			 
			 switch(resultado.mes) {
			 case 4,6,9,11:
				 if(resultado.dia==31) {
					 resultado.dia=1;
					 resultado.mes++;
				 }
			 break;
			 case 1,3,5,8,10,12:
				 if(resultado.dia==32) {
					 resultado.dia=1;
					 if(++resultado.mes==13) {//primero lo incrementas y luego utiliza el valor asi podemos usar el if para aumentar el año directamente.
					 resultado.anno++;
					 }
				 }
			 break;
			 case 2:
				 if(resultado.anno%4==0 && resultado.anno%100!=0 || resultado.anno%4==400){
					 if(resultado.dia==30) {
						 resultado.dia=1;
						 resultado.mes++;
					 }
				 	}
				 else
					 if(resultado.dia==29) {
						 resultado.dia=1;
						 resultado.mes++;
					 }
				 break;
			 	}
			 
		 }
		 return resultado;
		 
	 }//cierre incrementa dias
/*	
	Fecha incrementaMeses(int mes) {
		 Fecha resultado=new Fecha(dia,mes,anno);
		 for(int i=0;i<mes;i++) {
			 resultado.mes++;
			 switch(resultado.mes) {
			 
			 }
		 }
	}
	*/
}// cierre clase


