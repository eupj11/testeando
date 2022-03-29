
Hacer un programa que calcule y muestre el área de un triángulo.
El área tiene que ser >0, no puedo tener un área negativa, la base  y la altura tiene que ser mayor que 0.

Aquí uso 3 datos, base, altura y un literal, pero los literales no se declaran.
Tenemos que dar pistas al usuario de los tipos de datos que debe insertar y no presuponer. Prever que va a insertar el usuario es diseñar.
Leer para la ejecución del programa hasta que alguien meta algo por teclado.
Repetir hasta pedir la base y la altura hasta meter un valor correcto. Si es 0 es mientras sino es un para.


Programa: AreaDeltriángulo
Autor: Eugenio Pérez Jiménez
Entorno:
	base,altura,area es real
Algoritmo:

	Escribir "La base y la altura tienen que ser un número positivo, distinto de 0"
	
	Repetir
		Escribir "Introduce la base del triángulo"
		Leer base
			Si base<=0 entonces
				Escribir "La base introducida tiene que ser mayor que 0"
			Fin Si
	Hasta base>0

	Repetir
		Escribir "Introduce la altura del triángulo"
		Leer altura
			Si altura<=0 entonces
				Escribir "La altura introducida tiene que ser mayor que 0"
			Fin Si
	Hasta altura>0

	area = base * altura / 2
	
	Escribir "El área del triangulo es ", area

Fin Programa

Uso un repetir en lugar de un mientras ya que quiero que 
	entre al menos una vez en el bucle para dar al usuario la oprtunidad
	de hacerlo bién la primera vez.

/*_______________________________________________________________________________________*/
PSEUDOCÓDIGO

Hacer un programa que calcule y muestre la suma del 3 y el 5.
Es posible que en el futuro el 3 cambie de valor y el 5 también


Programa: CalcularSuma3y5v1
Autor: Eugenio Pérez Jiménez
Entorno:
CONST PRIMERSUMANDO es numérico entero <--3
CONST SEGUNDOSUMANDO es numérico entero <--5
suma es numérico entero.
Algoritmo:
	suma <-- PRIMERSUMANDO + SEGUNDOSUMANDO
	Escribir “El resultado de la suma de es:”, suma
Fin Programa

Otra forma de hacerlo

Programa: CalcularSuma3y5v2
Autor: Eugenio Pérez Jiménez
Entorno:
3, 5,8 es numérico entero (literal)
Algoritmo:
	Escribir “El resultado de la suma de es:”, 8
Fin Programa


/*____________________________________________________________________________________*/

 Hacer un programa que calcule y muestre la suma de cualquier par de números.


Programa: MostrarSuma
Autor: Eugenio Pérez Jiménez
Entorno:
	operando1, operando2, suma es numérico real
Algoritmo:
	Escribir “Introduce un número”
leer operando1
Escribir “Introduce otro número”
leer operando2
suma=operando1+ operando2
Escribir “El resultado de la suma es: ”,suma
Fin Programa



/*____________________________________________________________________________________*/

Dada una variable edad escribir el código que me diga si es mayor de edad y si no que no escriba nada.

Autor: Eugenio Pérez Jiménez
Entorno:
	Edad numérica entero
Algoritmo:
	Escribir “Introduce tu edad”
	Leer edad
	Si edad>=18 entonces
		Escribir “Eres mayor de edad”
	Fin si
Fin Programa



/*____________________________________________________________________________________*/


Hacer un programa que muestre la suma, la resta. La multiplicación, división real, división entera y resto.

Programa: Calculadora
Autor: Eugenio Pérez Jiménez
Entorno:
	suma, resta, multiplicación, divEntero, divReal, operando1, operando2 numérico real 
Algoritmo:
Escribir “Introduce un número”
leer operando1
Escribir “Introduce otro número”
leer operando2
	suma=operando1+ operando 2
	Escribir “El resultado de la suma es”, suma
	resta= operando1- operando2
	Escribir “El resultado de la resta es”, resta
	multiplicacion= operando1* operando2
Escribir “El resultado de la multiplicación es”, multiplicacion
Si operando2==0 entonces
	Escribe “Error de división entre 0”
Fin si
Si operando1=0 y operando2=0 entonces
   Escribe “Error al dividir 0 entre 0”
         Sino
           divEntero= operando1\ operando2
           escribir “El resultado de la división es ”,divEntero
	Fin si

Si op2==0 Entonces
		Escribir  "Error al dividir entre 0"
	SiNo
	Resultado=op1%op2;


Resultado= operando1 % operando2
Escribir “El módulo es”, resultado

Fin si

Fin  Programa


/*______________________________________________________________________________________*/


Hacer un programa en el que dada una nota me diga si un alumno esta aprobado o suspendido.

Programa: CalcularNota
Autor: Eugenio Pérez Jiménez
Entorno:
nota es numérico real
Algoritmo:
	Escribe “Introduce la nota”
	leer nota
	Si nota >= 5 entonces
		Escribir “Aprobado”
	Sino
		Escribir “Suspenso”
	Fin si
Fin Programa


/*_____________________________________________________________________________________*/

Hacer otra calculadora cuyo mensaje sea por Ej. 

3+2=5
3-2=1
3*2=6
3/2=1.5
3\2 (Entera)=1
El resto de 3/2 es 1

Programa: Calculadora2
Autor: Eugenio Pérez Jiménez
Entorno:
	suma, resta, multiplicación, division, operando1, operando2 numérico real 
Algoritmo:
Escribir “Introduce un número”
leer operando1
Escribir “Introduce otro número”
leer operando2
	//suma
	Resultado=op1+op2;
	Escribir op1,"+", op2,"=", resultado
	//resta
	Resultado=op1-op2;
	Escribir op1,"-", op2,"=", resultado
	//multiplicación
	Resultado=op1*op2;
	Escribir op1,"*", op2,"=", resultado
      
//División realSi op1==0 y op2==0 Entonces
    Escribir "Error, el dividendo y el divisor no pueden ser 0"
SiNo		
	    Si op2==0 Entonces
		    Escribir  "Error al dividir entre 0"
	    SiNo
		    Resultado=op1/op2;
		    Escribir op1,"/", op2," (entero)=",resultado		
	    FinSi
FinSi

   
Si op1==0 y op2==0 Entonces
    Escribir "Error, el dividendo y el divisor no pueden ser 0"
	SiNo		
	  Si op2==0 Entonces
  		Escribir  "Error al dividir entre 0"
	  SiNo
	  	Resultado=op1\op2;
		  Escribir op1,"\\", op2,"=", resultado		
	  FinSi
FinSi


	Si op2==0 Entonces
		Escribir  "Error al dividir entre 0"
	SiNo
	Resultado=op1%op2;
	Escribir op1,"%", op2,"=", resultado
	fin si

Fin Programa


/*____________________________________________________________________________________*/








Hacer un programa que me muestre todos los números primos hasta un número introducido por teclado (divisible por si mismo y por 1)

Programa: MostrarPrimos
Autor: Eugenio Pérez Jiménez
Entorno:
  numero,divisor,resultado es entero;
Algoritmo:

    Escribir "Introduce un número"
    Leer numero
	Si numero<>0 entonces
		Si numero<0 entonces
			numero<-- -numero
		Fin Si

		Escribir "+/-",numero
		
			Para divisor de 1 a (numero/2)=1 incrementa en -1 hacer
			//Para divisor de (numero div 2)=1 con incremento -1 hacer       //Solución de la pizarra
		
			Si numero%divisor=0 entonces
				Escribir ",",divisor
			Fin Si

			Fin Para
	Sino

		Escribir "No tiene divisores"

	Fin Si

Fin Programa




Hacer el pseudocódigo de un programa que lea una nota entre 0 y 10 y la trasforme en la calificación alfabetica correspondiente:

0-3  MD 
3-5  Ins 
5-6  Suf 
6-7  Bien
7-9  Not 
9-10 Sob

Proceso sin_titulo
	nota Es Real
	
	Repetir
		Escribir "Introduce una nota"
		Leer nota
	Hasta Que nota>=0 y nota<=10
	
	Si nota<5 Entonces
		Si nota<5 y nota>3 Entonces
			Escribir "Ins"
		Sino
			Escribir "MD"
		FinSi
	FinSi
	
	Si nota==5 Entonces
		Escribir "Suf"
	Sino
		Si nota>5 y nota <7 Entonces
			Escribir "bien"
		Sino
			
			Si nota>6 y nota<9
				Escribir "Not"
			Sino
				
				Si nota >= 9 Entonces
						Escribir "Sob"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinProceso


/*_________________________________________________*/

Programa: LeerNota
Autor: Eugenio Pérez Jiménez
Entorno:
	nota es real
Algoritmo:

	Repetir
		Escribir "Introduce la nota"
		Leer nota
	Hasta nota>=0 || nota >=10

	Si nota<3 entonces
		Escribir "MD"
	Sino
		Si nota>3 y nota <5 entonces
			Escribir "Ins"
			Sino
				Si nota==5 entonces
					Escribir "Suf"
				Sino
					Si nota==6 entonces
						Escribir "Bién"
					Sino
						Si nota==7 || nota==8 entonces
							Escribir "Not"
						Sino
							Si nota==9 o nota==10 entonces
								Escribir "Sob"
							Fin Si
						Fin Si
					Fin Si
				Fin Si
		Fin Si
	Fin Si

Fin Programa


Un programa que calcule y que muestre el número de cifras que tiene un número(entero).
Meto un número por teclado y me dice cuantas cifras tiene.






Un programa que muestre por pantalla la expresión en binario de un número en decimal introducido por teclado.
Solo se pide la expresión, no el número.


public static void main(String[] args){
	//Entorno
	int num;
	String sucesion="";

	//Algoritmo:
	System.out.println("Introduce un numero");
	num=datoInt();
	for(int i=num;i>0;i--){
		//System.out.println(num/2);
		if(num!=0){
		num=num/2;
		sucesion+=num+"-";
		}
	}
	System.out.println("sucesionmulador "+sucesion);
}

