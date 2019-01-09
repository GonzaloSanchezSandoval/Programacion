package Ejercicio7;
import java.util.StringTokenizer;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String frase="Jose Carlos \\n 8.5 \\n Roberto \\n 4.9 \\n Pedro \\n 3.8 \\n Jorge \\n 6.3";
		
		StringTokenizer tokens= new StringTokenizer(frase, "\\n");
		
	
			System.out.println("El alumno " + tokens.nextToken() + " ha sacado la nota " + tokens.nextToken());
			
			System.out.println("El alumno " + tokens.nextToken() + " ha sacado la nota " + tokens.nextToken());
			
			System.out.println("El alumno " + tokens.nextToken() + " ha sacado la nota " + tokens.nextToken());
			
			System.out.println("El alumno " + tokens.nextToken() + " ha sacado la nota " + tokens.nextToken());
		      
	}

}
