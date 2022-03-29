public class Ejercicio1{

	public static void main(String[] args){
		float area,base,altura;
		
		do{
			System.out.println("Introduce una base mayor que 0");
			base=Leer.datoFloat();
		}while(base<=0);
		
		do{
			System.out.println("Introduce una altura mayor que 0");
			altura=Leer.datoFloat();
		}while(altura<=0);
		
		area=base*altura;
		
		System.out.println("El área del rectángulo es: "+area);
		
	}

}