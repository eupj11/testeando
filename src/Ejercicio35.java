/*
 * 35- Realizar un programa que calcule cuál es la suma de los 100 primeros números
impares (1 + 3 + 5 +...). 

* 
* Programa: Ejercicio35
* Autor: Eugenio Pérez jiménez
* Entorno:
*   cont,suma es entero
* Algoritmo:
*       
*       suma<-0;
* 
*       Para cont de 1 a 100 hacer
*           Si cont %2!=0 entonces
*             suma<-suma+cont  
*           Fin Si
*       Fin Para
* 
*       Escribir "La suma de los cién primeros números impares del 1 al 100", suma
* 
* Fin Programa
* 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio35 {
    
    public static void main(String[] args){
        byte cont;
        short suma;
        
        cont = 0;
        suma = 0;
        
        for(cont=1;cont<=100;cont++){
            if(cont%2!=0){
                suma+=cont;
            }
        }
        
        System.out.println("La suma de los cién primeros números impares del 1 al 100\nes: " + suma);
        
    }
    
}
