
public class Ejercicio31_func {
    
    public static int invertirNumero(){
        
        String acu="";
	int rev=0;
        
        for(byte i=1;i<=cont;i++){
			
			
                    rev=(num-(num/(int)Math.pow(10,i))*(int)Math.pow(10,i))/(int)Math.pow(10,i-1);
			
                    acu+=rev;
		}
        
        
    }
    
    public static void main(String[] args){
		int num=32175;
		int res,cont=0;
		
		
		
		
		System.out.println("Número a invertir: "+num);
		
		
		do{
			cont=cont+1;
			
			res=num/(int)Math.pow(10,cont);
						
			
		}while(res!=0);
		
		
		invertirNumero(num,cont);
	
			System.out.println(acu);
		
	
		
	}
    
}
