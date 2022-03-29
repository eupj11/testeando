/*
 *
 * 
 * Programa: Practica2
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *  num,longitud,cont,res1,res3,adiv,aux1,aux2,total1,aux_adiv1,aux_adiv2,total2,j es entero
 * 
 * Algoritmo:
 *  cont <- 0
 *  j <- 0
 * 
 *      Escribir "Introduce el número a adivinar"
 *      Leer num
 * 
 *      Repetir
 *          cont <- cont + 1
 *          longitud <- num / 10**cont
 *      Hasta longitud = 0
 * 
 *      Escribir "Introduce un número"
 *      Leer adiv
 * 
 *      i <- cont
 * 
 *      Repetir
 *          aux1 <- (num-((num/(int)Math.pow(10,i))*(int)Math.pow(10,i)))
            aux2 <- (num-((num/(int)Math.pow(10,i-1))*(int)Math.pow(10,i-1)))
                
            res1 <- num-aux1;
        
            total1 <- (num-(res1+aux2))/(int)Math.pow(10,i-1)
             
            aux_adiv1 <- (adiv-((adiv/(int)Math.pow(10,i))*(int)Math.pow(10,i)));
            aux_adiv2 <- (adiv-((adiv/(int)Math.pow(10,i-1))*(int)Math.pow(10,i-1)));
        
            res3 <- adiv-aux_adiv1;
        
            total2 <- (adiv-(res3+aux_adiv2))/(int)Math.pow(10,i-1);
        
       
            j <- j + 1
            
            Si total1 = total2 entonces
            
                Escribir "Dígitos adivinados ",total1," == ",total2," posición adivinada: ",j
            Fin Si
        
            i <- i + 1
            
            
 *      Hasta i = 0
 * 
 * Fin Programa
 * 
 */

/**
 *
 * @author Administrador
 */
public class Practica2 {
    
    public static void main(String[] args){
        int num=12345,longitud,cont=0;
        int adiv;
        int aux1,aux2,total1,aux_adiv1,aux_adiv2,total2,res1,res3,i;
        int j=0;
        int veces=0,error=0;
        boolean acertado=false;
        
        System.out.println("Introduce el número a adivinar");
        num=Leer.datoInt();
       
       
        
        do{
            cont++;
            longitud=num/(int)Math.pow(10,cont);            
        }while(longitud!=0);
       
        System.out.println("Número a adivinar: "+num);
        
   do{     
        //do{
            System.out.println("Introduce un número");
            adiv=Leer.datoInt();
        //}while(adiv<cont);
        
        
        System.out.println("Número introducido: "+adiv);
       
        
        i=cont;
      
       do{
           
        //Despliege del número a adivinar
        aux1=(num-((num/(int)Math.pow(10,i))*(int)Math.pow(10,i)));
        aux2=(num-((num/(int)Math.pow(10,i-1))*(int)Math.pow(10,i-1)));
                
        res1=num-aux1;
        
        total1=(num-(res1+aux2))/(int)Math.pow(10,i-1);
        
     
        //Fin despliegue del número a  adivinar
        
        aux_adiv1=(adiv-((adiv/(int)Math.pow(10,i))*(int)Math.pow(10,i)));
        aux_adiv2=(adiv-((adiv/(int)Math.pow(10,i-1))*(int)Math.pow(10,i-1)));
        
        res3=adiv-aux_adiv1;
        
        total2=(adiv-(res3+aux_adiv2))/(int)Math.pow(10,i-1);
        
       
        j++;
        if(total1==total2){
            veces++;
           System.out.println("Dígitos adivinados "+total1+" == "+total2+" posición adivinada: "+j);
           if(veces==cont){
               System.out.println("Has acertado");
               acertado=true;
           }
        }
        i--;
        
        error++;

        
        
        }while(i>0);

       //Fin bucle
        //System.out.println(error);
        
   }while(acertado==false);
     
       System.out.println(error);
    }
    
}
