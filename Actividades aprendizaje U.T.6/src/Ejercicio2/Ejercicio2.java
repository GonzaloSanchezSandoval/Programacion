package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String frase = "la casa de maría ";
		
		System.out.println("la casa de maría");
		
		String la = " la ";
		String casa = " casa ";
		String de = " de ";
		String maría = " maría ";
		int n1;
		
		do {
			
			System.out.println(" ¿Que palabra quieres cambiar? "
					+ " 1- Primera "
					+ " 2- Segunda"
					+ " 3- Tercera"
					+ " 4- Cuarta"
					+ " 5- Pulse cualquier otro boton para salir ");
			
			Scanner esc = new Scanner(System.in);
			n1 = esc.nextInt();
			
			if(n1==1) {
				
				System.out.println("Escriba la palabra");
				la = esc.next();
				
				System.out.println("La palabra ha sido cambiada" + la.replaceAll(la, la));
			}
			 
			if(n1==2) {
				
				System.out.println("Escriba la palabra");
				casa = esc.next();
				
				System.out.println("La palabra ha sido cambiada" + casa.replaceAll(casa, casa));
			}
			
			
			if(n1==3) {
				
				System.out.println("Escriba la palabra");
				de = esc.next();
				
				System.out.println("La palabra ha sido cambiada" + de.replaceAll(de, de));
			}
			
			if(n1==4) {
				
				System.out.println("Escriba la palabra");
				maría = esc.next();
				System.out.println("La palabra ha sido cambiada" + maría.replaceAll(maría, maría));
			}
			
			
			
			 
			System.out.println("La frase final es  " + la + casa + de + maría  );
			
		}while(n1==1||n1==2||n1==3||n1==4);
	
		
			String frase1="Juan Carlos \\n 8.5 \\n Andrés \\n 4.9 \\n Pedro \\n 3.8 \\n Juan \\n 6.3";
		
		frase1=frase1.replace("Juan", "Franco");
		
		System.out.println(frase);
	}

}
