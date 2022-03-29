/*
 * 32.- Realizar un programa que lea un número y diga si es o no capicúa.
 * 
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio32 {
    
    public static void main(String[] args){
        int longitud,res,digitoF,digitoI=0,num=34567,cont=0;
        
        System.out.println(num);
        
        do{
            cont++;
            longitud=num/(int)(Math.pow(10,cont));
        }while(longitud!=0);
        
        /*
        for(int i=0;i<cont;i++){
        
            res=num-((num-(num/(int)Math.pow(10,5))*(int)Math.pow(10,5))/(int)Math.pow(10,4))*(int)Math.pow(10,3);
        
        digitoI=(num-res)/(int)Math.pow(10,3);
            
        }
        */
        int contador=cont;
        while(contador!=0){
            dfdg
            res=num-((num-(num/(int)Math.pow(10,5))*(int)Math.pow(10,5))/(int)Math.pow(10,4))*(int)Math.pow(10,3);
        
            digitoI=(num-res)/(int)Math.pow(10,3);
            
            contador--;
        System.out.println("cont: "+contador);    
        }
        
        System.out.println("cont: "+contador);
        
        //digitoI=num/(int)Math.pow(10,3);
        
        //digitoI=(num/(int)Math.pow(10,4)*10000);
        /*
        res=num-((num-(num/(int)Math.pow(10,5))*(int)Math.pow(10,5))/(int)Math.pow(10,4))*(int)Math.pow(10,3);
        
        digitoI=(num-res)/(int)Math.pow(10,3);
        */
        digitoF=(num-(num/100)*100)/10;
        
        System.out.println("digitoI: "+digitoI);
        System.out.println("digitoF: "+digitoF);
        
        
    }
    
}
