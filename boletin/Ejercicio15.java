public class Ejercicio15{

	public static void main(String[] args){
		float num1,num2,num3,num4;
		
		System.out.println("Introduce el valor del primer número");
		num1=Leer.datoFloat();
		
		System.out.println("Introduce el valor del segundo número");
		num2=Leer.datoFloat();
		
		System.out.println("Introduce el valor del tercer número");
		num3=Leer.datoFloat();
		
		System.out.println("Introduce el valor del cuarto número");
		num4=Leer.datoFloat();
		
		if(num1>num2 && num1>num3 && num1>num4){
			System.out.println("El primer número introducido es mayor que los otros tres");
		}else{
			if(num2>num1 && num2>num3 && num2>num4){
				System.out.println("El segundo número introducido es mayor que los otros tres");
			}else{
				if(num3>num1 && num3>num2 && num3>num4){
					System.out.println("El tercer número introducido es mayor que los otros tres");
				}else{
					if(num4>num1 && num4>num3 && num4>num2){
						System.out.println("El cuarto número introducido es mayor que los otros tres");
					}
				}
			}
		}
		
		
		if(num1<num2 && num1<num3 && num1<num4){
			System.out.println("El primer número introducido es mayor que los otros tres");
		}else{
			if(num2<num1 && num2<num3 && num2<num4){
				System.out.println("El segundo número introducido es mayor que los otros tres");
			}else{
				if(num3<num1 && num3<num2 && num3<num4){
					System.out.println("El tercer número introducido es mayor que los otros tres");
				}else{
					if(num4<num1 && num4<num3 && num4<num2){
						System.out.println("El cuarto número introducido es mayor que los otros tres");
					}
				}
			}
		}
		
		
		
	}

}