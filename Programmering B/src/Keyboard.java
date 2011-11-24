/*
	Keyboard är en hjälpklass för att lätt kunna läsa input från användare från standard input (oftast kommandoraden).
	Man kan läsa in String, int, double, boolean, och char. Om Keyboard misslyckas med att göra om input till korrekt
	datatyp skriver den ett felmeddelande och returnerar ett defaultvärde

	Ex:	String s = Keyboard.readString();
		int i = Keyboard.readInt();
		double d = Keyboard.readDouble();
		boolean b = Keyboard.readBoolean();
		char c = Keyboard.readChar();
*/

import java.io.*; 

public class Keyboard{
	
	private static String text;

	public static String readString(){
		//Läser en rad text och sparar i variabeln text
		try { 
			InputStreamReader converter = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(converter);
			text = in.readLine();
			return text;
		}catch(Exception e){
			System.out.println("Error when trying to read a String from standard in. Return empty string.");
			return ""; 
		}
	}

	public static int readInt(){
		try { 
			readString();
			return Integer.parseInt(text);
		}catch(Exception e){
			System.out.println("Error when trying to read an int from standard in. Return 0.");
			return 0; 
		}
	}

	public static double readDouble(){
		try { 
			readString();
			return Double.parseDouble(text);
		}catch(Exception e){
			System.out.println("Error when trying to read a double from standard in. Return 0.0.");
			return 0.0; 
		}
	}

	public static boolean readBoolean(){
		try { 
			readString();
			return Boolean.valueOf(text).booleanValue();
		}catch(Exception e){
			System.out.println("Error when trying to read a boolean from standard in. Return false.");
			return false; 
		}
	}

	public static char readChar(){
		try { 
			readString();
			return text.charAt(0);
		}catch(Exception e){
			System.out.println("Error when trying to read a char from standard in. Return Null-character.");
			return 0; 
		}
	}

    
}