public class Ejercicio10{

	public static void main(String[] args){
		
		float num1,num2,suma,resta,multiplicacion,division,resto;
		byte opcion;
		
		System.out.println("Introduce un valor");
		num1=Leer.datoFloat();
		
		System.out.println("Introduce otro valor");
		num2=Leer.datoFloat();
		
		do{
			System.out.println("1. Suma.\n2. Resta.\n3 Multplicación.\n4. División.\n5. Resto.");
			opcion=(byte)Leer.datoShort();
			
			if(opcion==1){
				suma=num1+num2;
				System.out.println(num1+" + "+num2+" = "+suma);
			}else{
				if(opcion==2){
					resta=num1-num2;
					System.out.println(num1+" - "+num2+" = "+resta);
				}else{
					if(opcion==3){
						multiplicacion=num1*num2;
						System.out.println(num1+" * "+num2+" = "+multiplicacion);
					}else{
						if(opcion==4){
							if(num2!=0){
								division=num1/num2;
								System.out.println(num1+" / "+num2+" = "+division);
							}else{
								System.out.println("Error, no se puede dividir entre 0");
							}
						}else{
							if(opcion==5){
								if(num2!=0){
								resto=num1%num2;
								System.out.println(num1+" % "+num2+" = "+resto);
								}else{
									System.out.println("Error, no se puede dividir entre 0");
								}
							}
						}
					}
				}
			}
			
		}while(opcion<1 || opcion>5);
		
	
	}

}