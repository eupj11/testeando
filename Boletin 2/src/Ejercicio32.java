/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio32 {
    
    public static void main(String[] args) {
        
        int num=12321;
        int longitud,cont=0,mitad;
        int parte1,parte2,total1;
        int parte3,parte4,total2;
        
        do{
            longitud=num/(int) Math.pow(10, cont);
            cont++;
        }while(longitud!=0);
        
        //System.out.println("cont "+cont);
        
        mitad=(cont/2)-1;
        
        //System.out.println("mitad "+mitad);
        int difentes=0,aciertos=0;
        boolean fallo=false;
        int i=0;
        do{
            cont--;
            i++;
            //System.out.println("cont "+cont);
            
           // parte1=num-(num/(int)Math.pow(10, cont)*(int)Math.pow(10, cont));
           // System.out.println(parte1);   
          
            parte2=(num-((num/(int)Math.pow(10, cont-1))*(int)Math.pow(10, cont-1)));
            parte1=((num/(int)Math.pow(10, cont))*(int)Math.pow(10, cont));
            total1=((num-(parte1+parte2)))/(int)Math.pow(10, cont-1);
            //System.out.println("Numero "+((num-(parte1+parte2)))/(int)Math.pow(10, cont-1));
            
            parte3=(num-((num/(int)Math.pow(10, i-1))*(int)Math.pow(10, i-1)));
            parte4=parte1=((num/(int)Math.pow(10, i))*(int)Math.pow(10, i));
            total2=((num-(parte3+parte4)))/(int)Math.pow(10, i-1);
            
            System.out.println("total1 "+total1+" total2 "+total2);
            
           if(total1==total2){
               aciertos++;
           }else{
               difentes++;
               fallo=true;
           }
            
        }while(cont>mitad && fallo==true);
        
        System.out.println("fallos "+difentes+" aciertos "+aciertos);
        
        //parte2=(num-((num/1000)*1000));
        //parte1=((num/10000)*10000);
        //System.out.println("parte2 "+(parte1+parte2));
        //System.out.println("parte1 "+parte1);    
    }
    
}
