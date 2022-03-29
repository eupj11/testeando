/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Factorial {
    
    public static void main(String[] args) {
        
        int fact,num;
        
        fact=1;
        
        do{
            System.out.println("Introduce un número mayor que 0");
            num=Leer.datoInt();
        }while(num<=0);
        
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        
        System.out.println("El factorial es: "+fact);
        
    }
    
}
