/*
 * 
 * 44.- El gobierno ha implementado como parte de su programa social,
 * un subsidio familiar bajo la siguiente reglamentación:
    a) Las familias que tienen hasta 2 numHijos, reciben 70.00€, las que 
    * tienen entre 3 y 5 reciben 90.00€ y las que tienen 6 o más 
    * reciben 120€ mensuales.
    b) Por cada hijo en edad escolar reciben 10.00€ adicionales. Se 
    * considera la edad escolar entre 6 y 18 años.
    c) Si la madre de familia fuera viuda, la familia recibe 20.00€ 
    * adicionales.
    Determinar el montante mensual que recibirá una familia de acuerdo 
    * a su realidad familiar.
 * 
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio44 {
    
    public static void main(String[] args){
        byte numHijos,edad;
        boolean esViuda=false;
                
        do{
           System.out.println("Introduce el número de numHijos");
           numHijos=(byte)Leer.datoByte();
        }while(numHijos>=0 || numHijos<127);
        
      hjkk
        
        if(numHijos>=6){
            System.out.println("120€");
        }else{
            if(numHijos<6 && numHijos>2){
                System.out.println("90.00€");
            }else{
                System.out.println("70.00€");
            }
        }
        
        
        
        
        
        
        
        
    }
    
}
