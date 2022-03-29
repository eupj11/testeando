/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
