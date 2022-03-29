/*
 * 
 * La sucesión de Fibonacci es la sucesión de 
 * números: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
 * Cada número se calcula sumando los dos anteriores a él.
 * 
 */

/**
 *
 * @author Administrador
 */
public class fibonacci {

    public static void main(String[] args) {
        
        int aux1,aux2,suma,num=10;
        
        aux1=0;
        aux2=1;
        suma=1;
        
        for(int i=0;i<num;i++)
        {       
            System.out.println(suma);
            suma=aux1+aux2;
            aux1=aux2;
            aux2=suma;
            
        }
        
        
    }
    
}
