/*
 * 3.- Realizar un programa que lea una hora expuesta en hora, minutos y segundos y la
 * convierta en segundos. 
 * 
 * Programa: Ejercicio3
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *  hora,minuto,segundo,total es entero 
 * Algoritmo:
 * 
 *      Repetir
 *          Escribir "Introduce las horas"
 *          Leer horas
 *      Hasta hora>=0
 * 
 *      Repetir
 *          Escribir "Introduce los minutos"
 *          Leer minuto
 *      Hasta minuto>=0
 * 
 *      Repetir
 *          Escribir "Introduce los segundos"
 *          Leer segundos
 *      Hasta segundo>=0
 * 
 *      total<-hora*60*60+minuto*60+segundo
 * 
 *      Escribir "El total de segundos es " , total
 * 
 * Fin Programa:
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio3 {
    
    public static void main(String[] args){
        short hora,minuto,segundo,total;
        
        do{
            System.out.println("Introduce las horas");
            hora=Leer.datoShort();
        }while(hora<0);
        
        do{
            System.out.println("Introduce los minutos");
            minuto=Leer.datoShort();
        }while(minuto<0);
        
        do{
            System.out.println("Introduce las segundos");
            segundo=Leer.datoShort();
        }while(segundo<0);
        
        total=(short) (hora*60*60+minuto*60+segundo);
        
        System.out.println("El total es "+total+" segundos");
        
    }
    
}
