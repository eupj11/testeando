public class Ejercicio6{

	public static void main(String[] args){
		float hora;
		
		do{
			System.out.println("Introduce la hora");
			hora=Leer.datoFloat();
		}while(hora<0);
	
		if(hora<12){
			System.out.println("Buenos  días");
		}else{
			if(hora >=12 && hora <18){
				System.out.println("Buenas tardes");
			}else{
				if(hora>=18 && hora<=24){
					System.out.println("Buenas noches");
				}else{
						System.out.println("HOra fuera de rango");
					}
			}
		}
	
	
	}

}