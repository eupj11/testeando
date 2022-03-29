public class Ejercicio2{

	public static void main(String[] args){
		final double PI=3.1416;
		double radio,area,longitud;
		
		do{
			System.out.println("Introduce el radio");
			radio=Leer.datoDouble();
		}while(radio<=0);
	
		longitud=Math.pow(PI,2)*radio;
		
		area=PI*Math.pow(radio,2);
	
		System.out.println("La longitud es "+longitud+"\ny el área es: "+area);
	
	}

}