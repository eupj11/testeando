public class Ejercicio5{

	public static void main(String[] args){
		short year,mes;
		int dias;
		
		do{
			System.out.println("Introduce los años");
			year=Leer.datoShort();
		}while(year<0);
		
		do{
			System.out.println("Introduce los meses");
			mes=Leer.datoShort();
		}while(mes<0);
	
		dias=year*360+mes*30;
		
		System.out.println("El número de días es: "+dias);
	
	}

}