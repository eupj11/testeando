/*
 * 26.- Realizar un programa que pida por teclado un número entero del 1 al 100 y muestre
por pantalla todos los números pares comprendidos entre 1 y el número leído. 
* 
* Programa: Ejercicio26
* Autor: Eugenio Pérez Jiménez
* Entorno:
*   num,cont es entero
* Algoritmo:
* 
*       Repetir
*           Escribir "Introduce un número comprendido entre el 1 y el 100"
*           Leer num
*       Hasta num>= && num<101
* 
*       Para cont de 1 a num hacer
*           Si cont %2== 0 entonces
*               Escribir cont
*           Fin Si
*       Fin Para
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
public class Ejercicio26 {
    
    public static void main(String[] args){
        byte num,cont;
        
        do{
            System.out.println("Introduce un número comprendido entre el 1 y el 100");
            num=(byte)Leer.datoShort();
        }while(num<=0 || num>100);
        
        for(cont=1;cont<=num;cont++){
            if(cont%2==0){
                System.out.println(cont);
            }
        }
        
    }
    
}
