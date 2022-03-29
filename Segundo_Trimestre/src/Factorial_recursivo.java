/*
 * 2. Factorial de un número.
 */

/**
 *
 * @author Administrador
 */
public class Factorial_recursivo {
    
    public static int factorial_recursivo(int numero){
        
        int fact;
        
        fact=1;
        
        if(numero==1){
            fact=1;
        }else{
            fact=numero*factorial_recursivo(numero-1);
        }
       
        return fact;
        
    }
    
    public static void main(String[] args) {
        
        int num;
        
        do{
            System.out.println("Introduce un número mayor que 0");
            num=Leer.datoInt();
        }while(num<=0);
        
        System.out.println("El factorial es: "+factorial_recursivo(num));
        
        
        
    }
    
}
