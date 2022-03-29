/*
 * 19.- Realizar un programa que lea un número de un dígito y diga su nombre en letras.
Por ejemplo: 1 será el uno. 

* 
* Programa: Ejercicio19
* Autor: Eugenio Pérez Jiménez
* Entorno:
*       num es entero
* Algoritmo:
* 
*       Escribir "Introduce un número"
*       Leer num
* 
*       Segun Sea num Hacer
*           0 : Escribir "cero"  
*           1 : Escribir "uno"
*           2 : Escribir "dos"
*           3 : Escribir "tres"
*           4 : Escribir "cuatro"
*           5 : Escribir "cinco"
*           6 : Escribir "seis"
*           7 : Escribir "siete"
*           8 : Escribir "ocho"
*           9 : Escribir "nueve"
*       Fin Segun Sea 
* 
* Fin Programa
* 
* 
* 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio19 {
    
    public static void main(String[] args){
        byte num;
        
        do{
            System.out.println("Introduce un número del 0 al 9");
            num=(byte)Leer.datoShort();
        }while(num<0 && num>10 );
        
        switch(num){
            case 0: System.out.println("cero");   break;
            case 1: System.out.println("uno");    break;
            case 2: System.out.println("dos");    break;
            case 3: System.out.println("tres");   break;
            case 4: System.out.println("cuatro"); break;
            case 5: System.out.println("cinco");  break;
            case 6: System.out.println("seis");   break;
            case 7: System.out.println("siete");  break;
            case 8: System.out.println("ocho");   break;
            case 9: System.out.println("nueve");   break;
                
            
        }
        
    }
    
}
