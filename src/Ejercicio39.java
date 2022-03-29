/*
 * 39.- Mostrar los múltiplos de 7 entre 1 y 112. 
 * 
 * Programa: Ejercicio39
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      cont,total es entero
 * Algoritmo:
 * 
 *      Para cont de 1 a 112 hacer
 *          total = 7 * cont
 *          Escribir 7," * ",cont," = ",total
 *      Fin Para
 * 
 * Fin Programa
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio39 {
    
    public static void main(String[] args){
        byte cont;
        short total;
        
        for(cont =1;cont<=112;cont++){
            total =(short)(7 * cont);
            System.out.println("7 * "+cont+" = "+total);
        }
        
        
    }
    
}
