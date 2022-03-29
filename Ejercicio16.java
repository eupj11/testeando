public class Ejercicio16{

	public static void main(String[] agrs){
		int num,res;
		//double res;
		
		do{
			System.out.println("Introduce un número mayor que 0");
			num=Leer.datoInt();
		}while(num<0);
		
		for(int i=num-1;i>1;i--){
		
			//System.out.println(i);
			if(num%i==0){
				res=num/i;
				System.out.print(res+" ");
			}
		
		}
		
	}

}