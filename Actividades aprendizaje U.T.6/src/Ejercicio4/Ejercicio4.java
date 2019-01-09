package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contadorA = 0;
		int contadorO = 0;
		int contadorE = 0;
		String palabra;
		
		String frase=" La casa de juan puede estar por allá";
		
		String fraseInvertida = "";
		
		for (int x=frase.length()-1;x>=0;x--)
			fraseInvertida = fraseInvertida + frase.charAt(x);
		
		System.out.println(fraseInvertida);
		
		
		
		for (int i=frase.length()-1;i>=0;i--) {
			
			if (frase.charAt(i)=='a') {
				contadorA=contadorA+1;
				
			}
			
			if (frase.charAt(i)=='o') {
				contadorO=contadorO+1;
				
			}
			
			if (frase.charAt(i)=='e') {
				contadorE=contadorE+1;
				
			
			}
			
		}
		
		if(contadorA>10) {
			System.out.println("Exceso de A ");
		}
		
		if(contadorO>5) {
			System.out.println("Exceso de O ");
		}
		
		if(contadorE>3) {
			System.out.println("Exceso de E ");
		}
		
		
		
		System.out.println("¿Que palabra deseas buscar en el String?");
		Scanner esc = new Scanner(System.in);
		palabra = esc.next();
		
		boolean resultado = frase.contains(palabra);
		
		if(resultado==true) {
			System.out.println("La palabra se encuentra en la frase ");
		}
		
		else  {
			
		}System.out.println("La palabra no se encuentra en la frase ");
		
	}
	
	
	
}
