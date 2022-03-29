/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Practica2 {
    
    public static void main(String[] args){
        int num=12345,longitud,cont=0,res1,res3;
        int adiv;
        int aux1,aux2,total1,aux_adiv1,aux_adiv2,total2;
        int j=0;
        
        
        do{
            cont++;
            longitud=num/(int)Math.pow(10,cont);
            //System.out.println(cont);
        }while(longitud!=0);
       
        System.out.println("Número a adivinar: "+num);
        
        
        //do{
            System.out.println("Introduce un número");
            adiv=Leer.datoInt();
        //}while(adiv<cont);
        
        
        System.out.println("Número introducido: "+adiv);
       
        
        int i=cont;
      
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
            
           System.out.println("Dígitos adivinados "+total1+" == "+total2+" posición adivinada: "+j);
        }
        i--;
        }while(i>0);
       //Fin bucle
        
        
      
    }
    
}
