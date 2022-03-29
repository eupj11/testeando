public class Ejercicio13{

	public static void main(String[] args){
		final double PI=3.1416;
		double radio,longitud,superficie,volumen,area;
		char opcion;
		
		
		do{
			System.out.println("Introduce el valor del radio");
			radio=Leer.datoFloat();
			
			if(radio>0){
				System.out.println("A. Longitud de la circunferencia.");
				System.out.println("B. Superficie de la circunferencia.");
				System.out.println("C. Volumen de la esfera.\nD. Area de la esfera.");
				System.out.println("Elige una opción:");
			
				opcion=Leer.datoChar();
			
				switch(opcion){
					case 'A':
					case 'a':
						longitud=2*PI*radio;
						System.out.println("La longitud de la esfera es: "+longitud);
					break;
					case 'B':
					case 'b':
						superficie=PI*Math.pow(radio,2);
						System.out.println("La superficie de la esfera es: "+superficie);
					break;
					case 'C':
					case 'c':
						volumen=4*PI*Math.pow(radio,3)/3;
						System.out.println("El volummen de la esfera es: "+volumen);
					break;
					case 'D':
					case 'd':
						area=4*PI*Math.pow(radio,2);
						System.out.println("El área de la esfera es: "+area);
					break;
					default:
						System.out.println("Opción incorrecta");
				}
			
			}else{
				System.out.println("Error, el radio debe ser mayor que 0");
			}
			
			}while(radio>0);
		
		
	
	}
	
}