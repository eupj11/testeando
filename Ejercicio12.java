public class Ejercicio12{

	public static void main(String[] args){
		byte num,resultado;
		
		resultado=0;
		
		do{
			System.out.println("Introduce un número comprendido entre el 1 y el 10");
			num=(byte)Leer.datoShort();
		}while(num<0 || num>10);
	
		
		for(byte i=0;i<11;i++){
			resultado=(byte)(num*i);
			System.out.println(num+" * "+i+" = "+resultado);
		}
	
	}

}