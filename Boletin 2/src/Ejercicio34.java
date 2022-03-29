/*
 * 
 * 34.- Se efectúa una compra en un determinado almacén. Si 
 * adquirimos más de 100 unidades de un artículo, nos hacen 
 * un descuento de un 40%; entre 25 y 100 un 20%;
entre 10 y 24 un 10%; no hay descuento para menos de 10 
* unidades. Se pide calcular el
importe a pagar mostrando una salida como la que se muestra:
Código artículo..........111
Cantidad comprada....100
Precio unitario...........100
Descuento..................20.0 %
Total..........................8000.0 

 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio34 {
    
    public static void main(String[] args) {
        int cantidad;
        float descuento;
        
        do{
            System.out.println("¿Cuántas unidades quieres comprar?");
            cantidad=Leer.datoInt();
        }while(cantidad<=0);
        
        if(cantidad>100){
            descuento=0.40f;
        }else{
            if(cantidad>=25 && cantidad<100){
                descuento=0.20f;
            }else{
                if(cantidad>10 && cantidad<24){
                    descuento=0.10f;
                }
            }
        }
        
        System.out.println("Código artículo..........111\n

Cantidad comprada....100\n

Precio unitario...........100\n

Descuento..................20.0 %\n

Total..........................8000.0 ");
        
    }
    
}
