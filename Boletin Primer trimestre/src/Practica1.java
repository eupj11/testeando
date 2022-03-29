/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * Programa: Practica1
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      num,adiv,cont es entero
 * Algoritmo:
 *      cont <- 0
 * 
 *      Escribir "Introduce el número que el usuario tendrá que adivinar."
 *      Leer num
 * 
 *      Repetir
 *          Escribir "Introduce un número"
 *          Leer adiv
 * 
 *          cont <- cont + 1
 * 
 *          Si num>adiv entonces
 *              Escribir "El número introducido es mayor que el número a adivinar"
 *          Sino
 *              Si num<adiv entonces
 *                  Escribir "El número introducido es menor que el número a adivinar"
 *              Sino
 *                  Escribir "Has adividado el número al intento número ",cont
 *              Fin Si
 *          Fin Si
 * 
 *          Si cont = 5 entonces
 *              Escribir "Has perdido"
 *          Fin Si
 * 
 *      Hasta num=adiv || cont=5
 *      
 * 
 * Fin Programa
 * 
 */

/**
 *
 * @author Administrador
 */
public class Practica1 {
    
    public static void main(String[] args){
        int num,adiv,cont;
        
        cont=0;
        
        System.out.println("Introduce el número que el usuario tendrá que adivinar.");
        adiv=Leer.datoInt();
        
        do{
            System.out.println("Introduce un número");
            num=Leer.datoInt();
            cont++;
            
            if(num>adiv){
                System.out.println("El número introducido es mayor que el número a adivinar");
            }else{
                if(num<adiv){
                    System.out.println("El número introducido es menor que el número a adivinar");
                }else{
                    System.out.println("Has adividado el número al intento número "+cont);
                }
            }
            
            if(cont==5){
                System.out.println("Has perdido");
            }
            
            //System.out.println(cont);
        }while( num!=adiv && cont!=5);
        
    }
    
}
