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
        int longitud,num=12321,cont=0,res,res1;
        int i=0,j;
        boolean esCapicua=false;
        
        System.out.println(num);
        
        do{
            cont++;
            longitud=num/(int)(Math.pow(10,cont));
        }while(longitud!=0);
        
        
        j=cont;
        int dig_ini,dig_fin;
        
        do{
            i++;
            res=(num-(num/(int)Math.pow(10,i)*(int)Math.pow(10,i)))/(int)Math.pow(10,i-1);
            System.out.println(res);
            
            dig_ini=num/(int)Math.pow(10,j)*(int)Math.pow(10,j);
            dig_fin=num-(num/(int)Math.pow(10,j-1)*(int)Math.pow(10,j-1));
            
            res1=(num-(dig_ini+dig_fin))/(int)Math.pow(10,j-1);
            System.out.println(res1);
            
            j--;
            
            if(res==res1){
                esCapicua=true;
            }else{
                esCapicua=false;
            }
            
        }while(i<cont/2 && res==res1 );
        
        
        if(esCapicua==true){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
        
    }
    
}
