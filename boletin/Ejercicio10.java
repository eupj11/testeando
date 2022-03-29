import java.io.*;
public class Ejercicio10
{

	public static void main(String[] args){
	
		//Entorno:
		double numero1,numero2,suma,resta,multiplicacion,division,resto;
		byte opcion;
		
		//Algoritmo:
		
		suma=0;
		resta=0;
		multiplicacion=0;
		division=0;
		resto=0;
		numero1=0;
		numero2=0;
		opcion=0;
		
		
		switch(opcion){
			case 1:
				suma=numero1+numero2;
				System.out.println(numero1+"+"+numero2+"="+suma);
				break;
				
			case 2:
				resta=numero1-numero2;
				System.out.println(numero1+"-"+numero2+"="+resta);
				break;
				
			case 3:
				multiplicacion=numero1*numero2;
				System.out.println(numero1+"*"+numero2+"="+multiplicacion);
				break;
				
			case 4:
				division=numero1/numero2;
				System.out.println(numero1+"/"+numero2+"="+division);
				break;
				
			case 5:
				resto=numero1%numero2;
				System.out.println(numero1+"%"+numero2+"="+resto);
				break;
				
			default:
				System.out.println("Error al elegir un numero, tienes que elegir un número del 1 al 5 ");
		}
		
		
	
		
	
	}




  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  public static char datoChar(){
   
	try{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		char ch=(char)flujoE.read();
		return ch;
	}catch(IOException e){
		System.out.println("Error");
		return datoChar();
	}
   }
  
  public static short datoShort()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return Short.MIN_VALUE;
      }
      else
        return Short.parseShort(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoShort();
    }
  }
  
  public static int datoInt()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return Integer.MIN_VALUE;
      }
      else
        return Integer.parseInt(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoInt();
    }
  }
  
  public static long datoLong()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return Long.MIN_VALUE;
      }
      else
        return Long.parseLong(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoLong();
    }
  }
  
  public static float datoFloat()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return Float.NaN; // No es un Número; valor float.
      }
      else
      {
        Float f = new Float(sdato);
        return f.floatValue();
      }
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoFloat();
    }
  }

  public static double datoDouble()
  {
    try
    {
      Double d = new Double(dato());
      return d.doubleValue();
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoDouble();
    }
    catch(NullPointerException e)
    {
      return Double.NaN; // No es un Número; valor double.
    }
  }
}