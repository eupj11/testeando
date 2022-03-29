public class Ejercicio18{

	public static void main(String[] args){
		float num,suma,media;
		short cont;
		
		cont=0;
		suma=0;
		
		do{
			System.out.println("Introduce un número");
			num=Leer.datoFloat();
			
			cont++;
			
			suma+=num;
			
		}while(num>=0);
		
		media=suma/cont;
		
		System.out.println("La media es: "+media);
	
	}

}