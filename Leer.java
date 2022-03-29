import java.io.*;

public class Leer
{

  public static void main(String[] args){
	String nombre;
	byte edad;
	char dato;
	short num_short;
	int num_int;
	long num_long;
	float num_float;
	double num_double;
	boolean entrar=false;
	
	//String
	System.out.println("Prueba para String");
	System.out.println("Introduce tu nombre");
	nombre=dato();
	System.out.println("Hola "+nombre);
	
	//Char
	System.out.println("Prueba para char");
	System.out.println("Pulsa s para salir");
	dato=datoChar();
	System.out.println("Has pulsado "+dato);
	
	//Byte
	System.out.println("Prueba con el tipo de dato byte");
	System.out.println("Introduce la edad");
	edad=(byte)datoShort();
	System.out.println("La edad introducida es "+edad);
	
	//Short
	System.out.println("Prueba para short");
	System.out.println("introduce un numero comprendido entre -32.768 y 32.767");
	num_short=datoShort();
	System.out.println("El numero introducido es "+num_short);
	
	//Int
	System.out.println("Prueba para int");
	System.out.println("introduce un numero entero");
	num_int=datoInt();
	System.out.println("El numero introducido es "+num_int);
	
	//Long
	System.out.println("Prueba para Long");
	System.out.println("Introduce un numero grande para hacer la prueba del long");
	num_long=datoLong();
	System.out.println("El numero introducido es "+num_long);
	
	//Float
	System.out.println("Prueba para float");
	System.out.println("Introduce un numero con coma decimal");
	num_float=datoFloat();
	System.out.println("El numero introducido es "+num_float);
	
	//Double
	System.out.println("Prueba para double");
	System.out.println("Introduce un numero decimal para probar el tipo de dato double");
	num_double=datoDouble();
	System.out.println("El numero introducido es "+num_double);
	
	//Boolean
	System.out.println("El primer estado del booleano es: "+entrar);
	entrar=true;
	System.out.println("El estado actual del booleano es: "+entrar);
	
	
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
   
    public static int datoByte()
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