public class Ejercicio11{

	public static void main(String[] args){
		short suma;
		
		suma=0;
		
		for(int i=3;i<=99;i=i+3){
			System.out.print(i+",");
		
			suma+=i;
		
		}
		
		System.out.println("\nSuma total: "+suma);
	
	}

}