/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Prueba2 {
    
    public static void main(String[] args){
        int num=12345,longitud;        
        int error=0,cont=0,i;        
        boolean adivinado=false;
                
        int primer,ult,interes;
        
        do{
            cont++;
            longitud=num/(int)Math.pow(10, cont);
        }while(longitud!=0);
        
        System.out.println(num);
        
        i=1;
        
        while(error<=10 && adivinado==false){
            
            //System.out.println("cont "+cont);
            
            
            
            do{
                
                        //primer=((num/10000)*10000);
                        //primer=((num/(int)Math.pow(10,recorrer_numero))*(int)Math.pow(10,recorrer_numero));
                        
                        ult=num-(num/1000)*1000;
        
                        //interes=(num-(primer+ult))/1000;
                
                        System.out.println(i);
                        
                i++;
            
            }while(i<cont);
            
        
            
            if(adivinado==false){
                error++;
            }//Fin Si
            
        }//Fin while
        
        
        
        primer=((num/10000)*10000);
        
        ult=num-(num/1000)*1000;
        
        interes=(num-(primer+ult))/1000;
        
        //System.out.println(interes);
        
        
    }
    
}
