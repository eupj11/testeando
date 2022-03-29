/*
 * 36.- Escribir un programa que lea n números (el valor de n deberá ser introducido
 * por el usuario) y que cuando finalice indique el menor y el mayor número leído. 
 * 
* Programa: Ejercicio36
* Autor: Eugenio Pérez Jiménez
* Entorno:
*   n,cont,num,max,min es entero
* Algoritmo:
*   
*   Escribir "Cuantos númros quieres introducir"
*   Leer n
* 
*   Para cont de 1 a n hacer
*       Escribir "Introduce un número"
*       Leer num
* 
*       Si con=1 entonces
*           max<-num
*           min<-num
*       Fin Si
* 
*       Si num>max entonces
*           max<-num
*       Sino
*           Si num<min entonces
*               min<-num
*           Fin Si
*       Fin Si
* 
*   Fin Para
* 
*   Escribir "El máximo número introducido es: ",max," y el mínimo es: ",min
* 
* Fin Programa
* 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio36 {
    
    public static void main(String[] args){
        
        float n,num,cont,max,min;
        
        cont=0;
        max=0;
        min=0;
        
        do{
            System.out.println("Cuantos números deseas introducir");
            n = Leer.datoFloat();
        }while(n<0);
        
        for(cont=1;cont<=n;cont++){
            System.out.println("Introduce un número");
            num = Leer.datoFloat();
            
            if(cont==1){
                max=num;
                min=num;
            }
            
            if(num>max){
                max=num;
            }else{
                if(num<min){
                    min=num;
                }
            }//Fin Si
            
        }//Fin Para
        
        System.out.println("El máximo número introducido es: "+max+" y el mínimo es: "+min);
        
    }
    
}
