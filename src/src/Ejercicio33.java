/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio33 {
    
    public static void main(String[] args){
        
        int num1=5,num2=20;
        
        int longitud1,longitud2,cont=0,res,res1;
        int i=0,j;
        boolean esCapicua=false;
        
        
        do{
            cont++;
            longitud1=num1/(int)(Math.pow(10,cont));
        }while(longitud1!=0);
        
            
                
        
        for(int k=num1;k<=num2;k++){
            
            //System.out.println(k);
            do{
                //System.out.println(k);
                i++;
                res=(k-(k/(int)Math.pow(10,i)*(int)Math.pow(10,i)))/(int)Math.pow(10,i-1);
                System.out.println(res);
            }while(i<cont/2 );
            
        }
        
        
        res=(num1-(num1/(int)Math.pow(10,1)*(int)Math.pow(10,1)))/(int)Math.pow(10,0);
        //System.out.println(res);
        
        
        
        
    }
    
}
