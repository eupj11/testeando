public class Ejercicio23{

	public static void main(String[] args){
		int fecha,longitud;
		int restar_anyo,mes,dia,anyo;
		boolean esBisiesto=false,es_mes_de_30=false,es_mes_de_31=false;	
		
		
		do{
			System.out.println("Introduce una fecha con el siguiente formato 14021992");
			fecha=Leer.datoInt();
			longitud=fecha/(int)Math.pow(10,8);
		}while(longitud!=0);
		
		
		//Resto el año a la fecha introducida
		restar_anyo=fecha/10000;
		
		//Calculo el dia
		dia=fecha/1000000;
		
		
		//Cálculo el año
		anyo=fecha-(restar_anyo*10000);
		
		//Calculo el mes
		mes=((fecha-dia*1000000)-anyo)/10000;
		
	if(mes==4 || mes==6 || mes==9 || mes==11){
		if(dia>0 && dia<31){
			//Día correcto
			es_mes_de_30=true;
		}else{
			System.out.println("El día es incorrecto, tiene que ser de 1 a 30");
		}
	
	}else {
		if(mes==2){
			if( anyo%4==0 && (anyo%100!=0 || anyo%400==0)){
					System.out.println("Es bisiesto");
					esBisiesto=true;
				}else{
					System.out.println("El año no es bisiesto");
					esBisiesto=false;
					
			}//Fin si
		}else{
			if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ){
				if(dia>0 && dia<32){
					//Dia correcto
					es_mes_de_31=true;
				}else{
					System.out.println("El día es incorrecto, tiene que ser de 1 a 31");
				}
			}
		
		}
	}	
		//System.out.println(esBisiesto+"  "+dia);
		
		
		/*
		if(esBisiesto=false || dia==29 || es_mes_de_30==false || es_mes_de_31==false){
			//System.out.println("Febrero no puede tener 29 días si no es bisiesto");
			System.out.println("es_mes_de_30 "+es_mes_de_30+"\nes_mes_de_31 "+es_mes_de_31);
		}else{
		*/
		
		if(es_mes_de_31==false){
			System.out.println(es_mes_de_31);
			
			if(es_mes_de_30==false){
				System.out.println(es_mes_de_30);
			}
			
		}else{
		
			switch(mes){
			case 1:
				System.out.println(dia+" de Enero de "+anyo);
			break;
			case 2:
				if(esBisiesto=false || dia==29){
						System.out.println("Febrero no puede tener 29 días si no es bisiesto");
						
				}else{				
				System.out.println(dia+" de febrero de "+anyo);
				}
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
			
		}
		
		
		
		
	}

}