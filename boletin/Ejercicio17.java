public class Ejercicio17{

	public static void main(String[] args){
		float num;
		short suma,cont;
		
		suma=0;
		cont=0;
		
		do{
			System.out.println("Introduce un número");
			num=Leer.datoFloat();
			
			cont++;
			suma+=num;
		}while(num!=0);
		
		System.out.println("Número de sumandos:"+cont+"\nSuma: "+suma);
		
	}

}