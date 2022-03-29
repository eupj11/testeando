public class Bisiesto{

	public static void main(String[] args){
		short anyo=2012;
		
		if( anyo%4==0 && (anyo%100!=0 || anyo%400==0)){
					System.out.println("Es bisiesto");
				}else{
					System.out.println("El año no es bisiesto");
				}
		
	}

}