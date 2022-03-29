/*
 * 5.- Realizar un programa que calcule la edad en días de una persona que introduce
 * suedad por teclado en años y meses. Nota: se tomará el número de días de
 * un año como el de un mes como 30. 
 * 
 * Programa: Ejercicio5
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      dia,anyo,mes es entero
 * Algoritmo:
 *      
 *      Repetir
 *          Escribir "Introduce el número de años"
 *          Leer anyo
 *      Hasta anyo > 0
 * 
 *      Repetir
 *          Escribir "Introduce los meses"
 *          Leer mes
 *      Hasta mes > 0
 * 
 *      dia <- anyo**30*30 + mes*30
 * 
 *      Escribir "El total de dias es ", dias
 * 
 * Fin Programa
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio5 {
    
    public static void main(String[] args){
        short dia,mes,anyo;
        
        do{
            System.out.println("Introduce el número de años");
            anyo=Leer.datoShort();
        }while(anyo<0);
        
        do{
            System.out.println("Introduce el número de meses");
            mes=Leer.datoShort();
        }while(mes<0);
        
        dia=(short)(anyo*12*30+mes*30);
        
        System.out.println("El total de días es "+ dia);
        
    }
    
}
