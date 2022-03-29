/*
 * 
 * 
 */

/**
 *
 * 1. Sumar los números números naturales hasta N 
 * (se lo damos nosotros) de forma recursiva.
 * 
 */
public class Suma_De_Numeros_Naturales_recursivos {
    
    public static int sumaRecursaiva(int numero){
        int suma;
        
        if(numero==1)
        {
            suma=1;
        }else
        {
            suma=numero+sumaRecursaiva(numero-1);
        }
        
        return suma;
    }
    
    public static void main(String[] args) {
        int numero;
                
        System.out.println("Introduce un número");
        numero=Leer.datoInt();
        
        System.out.println("Suma: "+sumaRecursaiva(numero));
        
    }
    
}
