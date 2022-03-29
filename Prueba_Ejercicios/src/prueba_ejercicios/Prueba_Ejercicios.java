
package prueba_ejercicios;


public class Prueba_Ejercicios {

    
    public static void main(String[] args) {
        int num = 12345,adiv = 21346;
        int longitud1,cont1,longitud2,cont2;
        int cont_bien=0,cont_fallos=0;
        
        longitud1 = 0;
        longitud2 = 0;
        cont1 = 0;
        cont2 = 0; 
        
        
        do{
            cont1++;
            System.out.println("Introduce el número a adivinar");
            //num = Leer.datoInt();
            longitud1 = num/(int)Math.pow(10, cont1);
        }while(longitud1 != 0);
        
        do{
        
        
        do{
            cont2++;
            longitud2 = adiv/(int)Math.pow(10, cont2);
        }while(longitud2!=0);
        
   
        int var1,va1,res1;        
        int var2,va2,res2;
        /*
           va = (num/10000)*10000;
        
           var1 = num-((num/1000)*1000);
        
           res = (num-(va+var1))/1000;
           
           System.out.println(res);
           
        */
        
        
        int i = cont1;
        do{
            
                
                va1 = (num/(int)Math.pow(10,i))*(int)Math.pow(10,i);       
                var1 = num-((num/(int)Math.pow(10,i-1))*(int)Math.pow(10,i-1)); 
                res1 = (num-(va1+var1))/(int)Math.pow(10,i-1);
        
                va2  = (adiv/(int)Math.pow(10,i))*(int)Math.pow(10,i);
                var2 = adiv-((adiv/(int)Math.pow(10,i-1))*(int)Math.pow(10,i-1));
                res2 = (adiv-(va2+var2))/(int)Math.pow(10,i-1);                        
                
                if(res1 == res2){
                    cont_bien++;
                    
                }
                    
                
                
                System.out.println(res1+"   "+res2);
                i--;
        }while(i>0);
        cont_fallos++;
        System.out.println("Aciertos "+cont_bien);
        System.out.println("Fallos "+cont_fallos);
        }while(cont_fallos<10 || cont_bien==cont1);     
    }
}
