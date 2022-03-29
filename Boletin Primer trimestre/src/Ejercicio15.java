/*
 * 15.- Realizar un programa que lea cuatro números y escriba el mayor y el menor de los
cuatro. 
 * 
 * Programa: Ejercicio15
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      num,max,min,cont es entero
 * Algoritmo:
 * 
 *  cont<-0
 *  max<-0;
 *  min<-0;
 * 
 *  Para cont de 1 a 4 hacer
 *      Escribir "Introduce un número"
 *      Leer num;
 * 
 *      Si cont = 0 entonces
 *          max = num
 *          min = num
 *      Fin Si
 * 
 *      Si num > max entonces
 *          max <- num;
 *      Sino
 *          Si num < min entonces
 *              
 *              min <- num
 *          Fin Si
 *      Fin Si
 * 
 *  Fin Para
 * 
 *  
 *  Escribir "El número máximo es ",max," y el número mínimo es ",min
 * 
 * 
 * Fin Programa
 *  
 */

/**
 *
 * @author Eugenio Pérez Jiménez
 */
public class Ejercicio15 {
    
    public static void main(String[] args){
        
        int num,max,min;
        byte cont;
        
        cont=0;
        max=0;
        min=0;
        
        for(cont=0;cont<4;cont++){
            System.out.println("Introduce un número");
            num=Leer.datoInt();
            
            if(cont == 0){
                max = num;
                min = num;
            }
            
            if(num > max){
                max = num;
            }else{
                   if(num < min){
                       min=num;
                   }             
            }//Fin si
            
            
        }//Fin Para
        
        System.out.println("El número máximo es "+max+" y el número mínimo es "+min);
        
        
    }
    
}
