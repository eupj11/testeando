public class Ejercicio4{

	public static void main(String[] args){
		final double PI=3.1416;
		double radio,volumen,area;
		
		do{
			System.out.println("Introduce el radio de la esfera");
			radio=Leer.datoFloat();
		}while(radio<=0);
	
		volumen=4/3*PI*Math.pow(radio,3);
	
		area=4*PI*Math.pow(radio,2);
	
		System.out.println("El volumen de la esfera es: "+volumen+"\n y el área es: "+area);
	
	}

}