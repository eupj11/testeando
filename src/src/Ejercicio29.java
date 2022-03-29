/*
 * 29.- Realizar un programa que calcule la suma de N números dados por teclado, de
manera que los pares los sume y los impares los reste. Si el número dado es cero,
terminará el programa sacando por pantalla la diferencia entre pares e impares. 
* 
* 
* Programa: Ejercicio29
* Autor: Eugenio Pérez Jiménez
* Entorno:
*       pares,sumaPares,restaImpares,total,num es entero
* Algoritmo:
* 
*       Repetir       
*           Escribir "Introduce un número"
*           Leer num
* 
*           Si num %2= 0 entonces
*               sumaPares <- sumaPares + num
*           Sino
*               restaImpares <- restaImpares - num
*           Fin Si
* 
*       Hasta num = 0
* 
*           total <- sumaPares - restaImpares
* 
* Fin Programa
* 
* 
* 
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio29 {
    
    public static void main(String[] args){
        short pares,sumaPares=0,restaImpares=0,total=0,num;
        
        do{
            
            System.out.println("Introduce un número");
            num=Leer.datoShort();
            
            if(num%2==0){
                sumaPares+=num;
            }else{
                restaImpares-=num;
            }
            
        }while(num!=0);
        
        total=(short)(sumaPares-restaImpares);
        
        System.out.println(total);
        
        
    }
    
}
