/*
 * 2.- Realizar un programa que halle la longitud y el área de una circunferencia cuyo radio
 * en centímetros se introduce por teclado. Nota: trabajar PI como una precisión de 4
 * decimales 3.1416.
 * Fórmulas: Long. = 2xPIxRadio Área = PI x Radio2
 * 
 * 
 * Programa: Ejercicio2
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      longitud,radio,area es decimal
 *      CONST PI <- 3.1416
 * Algoritmo:
 *      
 *      Repetir
 *          Escrobir "Introduce un rádio mayor que 0"
 *          Leer radio
 *      Hasta radio > 0
 * 
 *      longitud <- 2 * PI * radio
 * 
 *      area <- PI * radio**2
 * 
 *      Escribir "La longitud de la circunferencia es: " , longitud
 * 
 *      Escribir "El área de la circunferencia es: " , area
 * 
 * Fin Programa
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio2 {
    
    public static void main(String[] args){
        
        double longitud,radio,area;
        final double PI=3.1416;
        
        
        do{
            System.out.println("Introduce un rádio mayor que 0");
            radio=Leer.datoDouble();
        }while(radio<=0);
        
        longitud=2*PI*radio;
        
        area=PI*Math.pow(radio,2);
        
        System.out.println("La longitud de la circunferencia es "+longitud);
        
        System.out.println("El área de la circunferencia es "+ area);
        
    }
    
}
