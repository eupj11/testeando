/*
 * 18.- Realizar un programa que lea una serie de números y obtenga su media. Un número
negativo indicará el fin de datos. 
* 
* Programa: Ejercicio18
* Autor:: Eugenio Pérez Jiménez
* Entorno:
*       num,total,media es decimal;
*       cont es entero;
*   Repetir
* 
*       total <- 0
*       media <- 0
* 
*       Escribir "Introduce un número"
*       Leer num
* 
*       total <- total + num
*       
*       cont <- cont + 1
* 
*   Hasta num<0;
* 
*   media <- total / cont
* 
 * Escribir "La media es: ", media
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio18 {
    
    public static void main(String[] args){
        float num,total,media;
        byte cont;
        
        cont = 0;
        total = 0;
        
        do{
            System.out.println("Introduce un número");
            num = Leer.datoFloat();
            total += num;
            cont++;
        }while(num>0);
        
        media = total / cont;
        
        System.out.println("La media es: " + media);
         
    }
    
}
