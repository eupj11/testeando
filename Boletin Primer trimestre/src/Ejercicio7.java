/*
 * 7.- Realizar un programa que pida un número y una posición, y devuelva el 
 * dígito que está en esa posición. Ejemplo: el 48534697 y posición 3, dará
 * el dígito 5. 
 * 
 * Programa: Ejercicio7
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      num,longitud,cont,aux1,aux2,total1,res1,i,j,pos es entero
 * Algoritmo:
 *      
 *      cont <- 0
 *      i <- 0
 *      j <- 0
 * 
 * 
 *      Escribir "Introduice un número"
        Leer num
        
        Repetir
            cont = cont + 1;
            longitud <- num / (10**cont)            
        Hasta longitud = 0
       
        Escribir "Número: ",num
        
        
        Escribir"Introduce una posición : "
        Leer pos        
        
        i <- cont
        
         
        Repetir
           
        
        aux1 <- (num-((num/10**i))*(10**i)))
        aux2 <- (num-((num/(10**i-1))*(10**i-1)))
                
        res1 <- num-aux1
        
        total1 <- (num-(res1+aux2))/(10**i-1)
        
     
        //Fin despliegue del número a  adivinar
        
        
        
        //System.out.println(total1);
        
        j = j +1
        Si j = pos entonces
            
            Escribir total1
        Fin Si
        
        i = i - 1
        
        * Hasta i <= 0
 *       
 * Fin Programa
 * 
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio7 {
    
    public static void main(String[] args){
        int num,longitud,cont=0;
        int aux1,aux2,total1,res1,i;
        int j=0;
        byte pos;
        
        
        System.out.println("Introduice un número");
        num=Leer.datoInt();
        
        do{
            cont++;
            longitud=num/(int)Math.pow(10,cont);            
        }while(longitud!=0);
       
        System.out.println("Número: "+num);
        
        
        System.out.println("Introduce una posición : ");
        pos=(byte)Leer.datoByte();
        
        
        i=cont;
      
       do{
           
        //Despliege del número a adivinar
        aux1=(num-((num/(int)Math.pow(10,i))*(int)Math.pow(10,i)));
        aux2=(num-((num/(int)Math.pow(10,i-1))*(int)Math.pow(10,i-1)));
                
        res1=num-aux1;
        
        total1=(num-(res1+aux2))/(int)Math.pow(10,i-1);
        
     
        //Fin despliegue del número a  adivinar
        
        
        
        //System.out.println(total1);
        
        j++;
        if(j==pos){
            
           System.out.println(total1);
        }
        i--;
        }while(i>0);
       //Fin bucle
        
        
      
    } 
    
}
