public class Ejercicio31{

	public static void main(String[] args){
		int num=32175;
		int res,cont=0;
		String acu="";
		int rev;
		/*
		acu+=num-(num/10)*10;
		
		System.out.println(acu);
		*/
		/*
		do{
			cont=cont+1;
			
			res=num/(int)Math.pow(10,cont);
			
			System.out.println(res);
			
		}while(res!=0);
		
		for(int i=1;i<=cont;i++){
			//System.out.println("i: "+i);
			
		}
		*/
		rev=(num-(num/(int)Math.pow(10,2))*100)/10;
			System.out.println(rev);
		
		
		
		//System.out.println(num-(num/10)*10);
		
	}

}