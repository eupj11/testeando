public class Ejercicio3{

	public static void main(String[] args){
		 int horas,minutos,segundos,total;
		
		do{
			System.out.println("Introduce el númeero de horas");
			horas=Leer.datoInt();
		}while(horas<0);
		
		do{
			System.out.println("Introduce el número de minutos");
			minutos=Leer.datoInt();
		}while(minutos<0);
		
		do{
			System.out.println("Introduce el número de segundos");
			segundos=Leer.datoInt();
		}while(segundos<0);
		
		total=horas*60*60+minutos*60+segundos;
		
		System.out.println("El número de total de segundos es "+total);
	
	
	}

}