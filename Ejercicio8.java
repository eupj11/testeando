public class Ejercicio8{

	public static void main(String[] args){
		byte num;

		do{
			System.out.println("Introduce un número comprendido entre el 1 y el 10");
			num=(byte)Leer.datoShort();
		}while(num<1 || num>10);
		
	}

}