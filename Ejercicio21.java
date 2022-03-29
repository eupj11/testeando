public class Ejercicio21{

	public static void main(String[] args){
		float a,b,c;
		
		do{
			System.out.println("Introduce la longitud del primer lado del triángulo");
			a=Leer.datoFloat();
		}while(a<0);
	
		do{
			System.out.println("Introduce la longitud del segundo lado del triángulo");
			b=Leer.datoFloat();
		}while(b<0);
		
		do{
			System.out.println("Introduce la longitud del tercer lado del triángulo");
			c=Leer.datoFloat();
		}while(c<0);
		
		if(a==(b+c)){
			System.out.println("Es rectángulo");
		}else{
			if(a<(b+c)){
				System.out.println("Es acutángulo");
			}else{
				if(a>b+c){
					System.out.println("Es obtusángulo");
				}
			}
		}
	
	}

}