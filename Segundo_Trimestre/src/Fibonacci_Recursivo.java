
public class Fibonacci_Recursivo {
    
    public static int fibonacii_Recursivo(int numero){
        
        int val;
        
        if(numero == 0){
            return 0;
        }else if(numero == 1){
                return 1;
        }else{
           return fibonacii_Recursivo(numero - 1)+fibonacii_Recursivo(numero - 2);
         }
        
        
        
        
    }
    
    public static void main(String[] args) {
        int numero=5;
        
        do{
            System.out.println("Introduce un número mayor que 0");
            //numero=Leer.datoInt();
        }while(numero<=0);
        
        int resultado =fibonacii_Recursivo(numero);
        System.out.println(resultado);
        
        
    }
    
}
