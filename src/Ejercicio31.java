/*
 * 31.- Realizar un programa que lea un número entero y lo escriba invertido;
 * por ejemplo,léase 32175 y escríbase el 57123.
 * 
 * Programa: Ejercicio31
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      num,cont,res,rev es entero
 *      acu es cadena
 * Algoritmo:
 *      
 *      cont <- 0
 *      rev <- 0
 *      acu <- ""
 * 
 *      Escribir "Introduce un número"
 *      Leer num
 * 
 *      Repetir
 *          cont <- cont + 1
 *          res<- num / 10**cont
 *      Hasta res=0 
 * 
 * 
 *      
 * 
 * 
 * Fin Programa
 * 
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio31{

	public static void main(String[] args){
		int num=32175;
		int res,cont=0;
		String acu="";
		int rev=0;
		
		
		
		System.out.println("Número a invertir: "+num);
		
		
		do{
			cont=cont+1;
			
			res=num/(int)Math.pow(10,cont);
						
			
		}while(res!=0);
		
		for(byte i=1;i<=cont;i++){
			
			
                    rev=(num-(num/(int)Math.pow(10,i))*(int)Math.pow(10,i))/(int)Math.pow(10,i-1);
			
                    acu+=rev;
		}
		
	
			System.out.println(acu);
		
	
		
	}

}
