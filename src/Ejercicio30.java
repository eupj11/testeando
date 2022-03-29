/*
 * 30.- Realizar un programa que muestre los N primeros términos de la sucesión de
 * Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, ... 
 * 
 * 
 * Programa: Ejercicio30
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      n,num,total,cont es entero
 * Algoritmo:
 * 
 *      Repetir
 *          Escribir "Hasta que número quieres calcular la serie de Fibonacci"
 *          Leer n
 *      Hasta n>1
 * 
 * 
 *      Para cont de 1 a n hacer
 *          
 *          ant <- cont-1
 * 
 *          num <- cont
 * 
 *          total <- total + (num + ant)
 *
 *          Escribir total + ", "
 * 
 *      Fin Para
 * 
 * 
 * Fin Programa
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio30 {
    
    public static void main(String[] args){
        
        short n,num,aux,total,cont;
        
        num=0;
        aux=0;
        /*
        do{
            System.out.println("Hasta que número quieres calcular la serie de Fibonacci");
            n=Leer.datoShort();
        }while(n<=1);
        */
        
        n=8;
        
        //Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, ... 
        
        for(cont=0;cont<=n;cont++){
            total=0;
            //ant=(short)(cont);
            
            
            num=(short)(cont);
            
            total=(short)(aux+num);
            
            System.out.print(num+", "+total+", ");
            bjhkjb
            aux=num;
        }//Fin Para
        
    }
    
}
