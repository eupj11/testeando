/*
Programa: DiaSemana
Autor: Eugenio Pérez Jiménez
Entorno:
	numDia es entero
Algoritmo:
	Hacer
		Escrbir "Introduce un número del 1 al 7"
		Leer numDia
	Hasta numDi>1 o numDia <7
	
	Según Sea numDia hacer
		1: Escribir "Lunes"
		2: Escribir "Mares"
		1: Escribir "Miercoles"
		1: Escribir "Jueves"
		1: Escribir "Viernes"
		1: Escribir "Sábado"
		1: Escribir "Domingo"
	Fin Según Sea
	
Fin Programa
*/
public class DiaSemana{

	public static void main(String[] args){
		byte numDia;
	
		do{
			System.out.println("Introduce un número del 1 al 7");
			numDia=(byte)Leer.datoShort();
		}while(numDia<1 || numDia>7);

		switch(numDia){
			case 1:
				System.out.println("Lunes");
			break;
			case 2:
				System.out.println("Martes");
			break;
			case 3:
				System.out.println("Miercoles");
			break;
			case 4:
				System.out.println("Jueves");
			break;
			case 5:
				System.out.println("Viernes");
			break;
			case 6:
				System.out.println("Sábado");
			break;
			case 7:
				System.out.println("Domingo");
			break;
		}

		
	}

}