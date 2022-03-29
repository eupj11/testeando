/*
 * 34.- Se efectúa una compra en un determinado almacén. Si adquirimos más de 100
unidades de un artículo, nos hacen un descuento de un 40%; entre 25 y 100 un 20%;
entre 10 y 24 un 10%; no hay descuento para menos de 10 unidades. Se pide calcular el
importe a pagar mostrando una salida como la que se muestra:
Código artículo..........111
Cantidad comprada....100
Precio unitario...........100
Descuento..................20.0 %
Total..........................8000.0 
 * 
 * 
 * Programa: Ejercicio34
 * Autor: Eugenio Pérez Jiménez
 * Entorno:
 *      unds,cod,nombreProducto es entero
 *      descuento,precio,total es decimal
 * Algoritmo:
 *      
 *     
 *      Repetir
 *          Escribir "1.- Patatas    (Pulsa 1 para Patatas)"
            Escribir "2.- Tomates    (Pulsa 2 para Tomates)"
            Escribir "3.- Zanahorias (Pulsa 3 para Zanahorias)"
            Escribir "4.- Peras      (Pulsa 4 para Peras)"
            Escribir "5.- Manzanas   (Pulsa 5 para Manzanas)"
 *          Leer nombreProducto
 * 
 *      Hasta nombreProducto > 0 && nombreProducto <= 5
 * 
 * 
 *      Segun Sea nombreProducto hacer
                    case 1: cod=001; precio=1;   break;
                    case 2: cod=002; precio=1.5; break;
                    case 3: cod=003; precio=1;   break;
                    case 4: cod=004; precio=1.2; break;
                    case 5: cod=005; precio=2;   break;
        Fin Segun Sea
        
        
                
        Repetir
                Escribir "¿Cuántas unidades quieres comprar?"
                Leer unds
        Hasta unds > 0
 * 
 * 
 *      Si unds > 100 entonces
            descuento = 0.40
        Sino
            Si unds >= 25 && unds <= 100
               descuento = 0.20
            Sino
                Si unds > 10 && unds <= 24 entonces
                     descuento=0.10
                 
                 
                
                
       total = precio*unds*descuento
                
       Escribir "Código de artículo----------------" , cod
       Escribir "Cantidad comprada----------------" , unds
       Escribir "Precio unitario------------------" , precio
       Escribir "Descuento------------------------" , descuento
       Escribir "Total----------------------------" , total
 * 
 * 
 * Fin Programa
 * 
 * 
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio34 {
    
    public static void main(String[] args){
        int unds,cod=0;
        double descuento=0,precio=0,total=0;
        byte nombreProducto;
        
        do{
            System.out.println("1.- Patatas    (Pulsa 1 para Patatas)");
            System.out.println("2.- Tomates    (Pulsa 2 para Tomates)");
            System.out.println("3.- Zanahorias (Pulsa 3 para Zanahorias)");
            System.out.println("4.- Peras      (Pulsa 4 para Peras)");
            System.out.println("5.- Manzanas   (Pulsa 5 para Manzanas)");
            nombreProducto=(byte)Leer.datoByte();
        }while(nombreProducto<0 || nombreProducto>5);
        
                switch(nombreProducto){
                    case 1: cod=001; precio=1;   break;
                    case 2: cod=002; precio=1.5; break;
                    case 3: cod=003; precio=1;   break;
                    case 4: cod=004; precio=1.2; break;
                    case 5: cod=005; precio=2;   break;
                }
        
        
                
            do{
                System.out.println("¿Cuántas unidades quieres comprar?");
                unds=Leer.datoInt();
            }while(unds<0);
                
                
                if(unds>100){
                    descuento=0.40;
                }else{
                    if(unds>=25 && unds<=100){
                        descuento=0.20;
                    }else{
                        if(unds>10 && unds <=24){
                            descuento=0.10;
                        }
                    }
                }
                
                total = precio*unds*descuento;
                
                System.out.println("Código de artículo----------------"+cod);
                System.out.println("Cantidad comprada----------------"+unds);
                System.out.println("Precio unitario------------------"+precio);
                System.out.println("Descuento------------------------"+descuento);
                System.out.println("Total----------------------------"+total);
                
    }
    
}
