/*
 * 1.- Realizar un programa que calcule el área de un rectángulo.
 * Fórmula: Área = Base x Altura.
 * 
 * Programa: Ejercicio1
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *  base,altura,area es decimal
 * Algoritmo:
 *      Repeir
 *          Escribir "Introduce la base"
 *          Leer base
 *      Hasta base > 0
 * 
 *      Repetir
 *          Escribir "Introduce la altura"
 *          Leer altura
 *      Hasta altura >0
 * 
 *      area <- base * altura
 * 
 *      Escribir "El área del rectángulo es: ",area 
 * 
 * Fin Programa
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio1 {
    
    public static void main(String[] args){
        float area,base,altura;
        
        do{
            System.out.println("Introduce una base mayor que 0");
            base=Leer.datoFloat();
        }while(base<=0);
        
        do{
            System.out.println("Introduce una altura mayor que 0");
            altura=Leer.datoFloat();
        }while(altura<=0);
        
        area = base * altura;
        
        System.out.println("El área del rectángulo es: "+area );
        
    }
    
}
