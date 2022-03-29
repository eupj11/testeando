/*
 *
 * 4.- Realizar un programa que calcule el volumen y área de la esfera. 
 * 
 * Programa: Ejercicio4
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      volumen,radio,area es decimal
 *      CONST PI <- 3.1416
 * Algoritmo:
 *      
 *      Repetir
 *          Escribir "Introduce el rádio"
 *          Leer radio
 *      Hasta radio > 0
 * 
 *      area <- 4*PI*radio**2
 * 
 *      volumen <- 4/3*PI*radio**3
 * 
 *      Escribir "El área del circulo es ", area
 * 
 *      Escribir "El volumen del circulo es", volumen
 * 
 * Fin Programa
 * 
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio4 {
    
    public static void main(String[] args){
        double volumen,radio,area;
        final double PI=3.1416;
        
        do{
            System.out.println("Introduce el valor del radio y asegurate de que es mayor que 0");
            radio=Leer.datoDouble();
        }while(radio<=0);
        
        area=4*PI*Math.pow(radio,2);
        
        volumen=4/3*PI*Math.pow(radio,3);
        
        System.out.println("El área de la esfera es "+area);
        
        System.out.println("El volumen de la esfera es es "+volumen);
        
    }
    
}
