public class capi{

	public static void main(String[] args){
		int num=123,resta=0,digito=0,cont=0;
		String aux="";
		int numero=0;
		
		for(cont=1;cont<3;cont++){
			if(cont==0){
				resta=(num/10)*10;
				digito=num-resta;
				aux+=digito;
				}else{
					resta=(num/((int)Math.pow(10,cont))*(int)Math.pow(10,cont));
					digito=num-resta;
					aux+=digito;
				}
				
		}
		
		System.out.println(aux);
		
	}

}