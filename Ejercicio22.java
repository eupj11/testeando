public class Ejercicio22{

	public static void main(String[] args){
		int mes,dia,anyo;
		boolean esBisiesto=false;	
		do{
			System.out.println("Introduce el día");
			dia=Leer.datoInt(dia);
		}while(dia<0);
		
		do{
			System.out.println("Es bisiesto");
			mes=Leer.datoInt();
		}while(mes<0);
		
		do{
			System.out.println("Es bisiesto");
			anyo=Leer.datoInt();
		}while(anyo<0);
	
		if(mes==2){
			if( anyo%4==0 && (anyo%100!=0 || anyo%400==0)){
					System.out.println("Es bisiesto");
					esBisiesto=true;
				}else{
					System.out.println("El año no es bisiesto");
					esBisiesto=false;
					
			}//Fin si
		}//Fin si
		
		System.out.println(esBisiesto+"  "+dia);
		
		
		if(esBisiesto=false9){
			System.out.println("Febrero no puede tener 29 días si no es bisiesto");
		}else{
		  switch(mes){
			case 1:
				System.out.println(dia+" de Enero de "+anyo);
			break;
			case 2:
				System.out.println(dia+" de febrero de "+anyo);
			break;
			case 3:
				System.out.println(dia+" de Marzo de "+anyo);
			break;
			case 4:
				System.out.println(dia+" de Abril de "+anyo);
			break;
			case 5:
				System.out.println(dia+" de Mayo de "+anyo);
			break;
			case 6:
				System.out.println(dia+" de Junio de "+anyo);
			break;
			case 7:
				System.out.println(dia+" de Julio de "+anyo);
			break;
			case 8:
				System.out.println(dia+" de Agosto de "+anyo);
			break;
			case 9:
				System.out.println(dia+" de Septiembre de "+anyo);
			break;
			case 10:
				System.out.println(dia+" de Octubre de "+anyo);
			break;
			case 11:
				System.out.println(dia+" de Noviembre de "+anyo);
			break;
			case 12:
				System.out.println(dia+" de Diciembre de "+anyo);
			break;
		  }
		}//Fin si
		
		
	}

}