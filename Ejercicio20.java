public class Ejercicio20{

	public static void main(String[] args){
		short year;
	
		do{
		
			System.out.println("Introduce el año");
			year=Leer.datoShort();
		
		}while(year<0);
		
		if(year%4==0 && year%100!=0 && year%400!=0){
			System.out.println("El año es bisiesto");
		}else{
			System.out.println("El año NO es bisiesto");
		}
		
	}

}