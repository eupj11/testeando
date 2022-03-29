/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio41 {
    
    public static void main(String[] args){
        
        
        
        
        for(byte i=0;i<8;i++){
            for(byte j=0;j<8;j++){
                
                
                
                if(j%2==0){
                    
                    if(i==j){
                      System.out.print(" * ");
                    }else{
                        System.out.print(" B ");
                    }   
                }else{
                    
                    if(i==j){
                      System.out.print(" * ");
                    }else{
                        System.out.print(" N ");
                    }
                }
                
                if(i==j){
                    //System.out.print(" * ");
                }else{
                    if(i!=j){
                       // System.out.print(" - ");
                    }
                }
                
            }
            System.out.println("");
            
        }
        
        
    }
    
}
