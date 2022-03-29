public class Ejercicio7_Fun {
    
    public static int calcularPosicion(int num,byte pos,int cont){
        
        int aux1,aux2,total1,res1,i;
        int j=0;
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
        return total1;
    }
    
    public static void main(String[] args){
        int num,longitud,cont=0,i;
        
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
        
        
       
      
        System.out.println("cont: "+cont);
        
       calcularPosicion(num,pos,cont);
        
        
      
    } 
    
}
