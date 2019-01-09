package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		
		System.out.println("Escriba la frase que quiera");
		Scanner esc = new Scanner(System.in);
		frase = esc.next();

		
		String fraseInvertida = "";{
		
		for (int x=frase.length()-1;x>=0;x--)
			fraseInvertida = fraseInvertida + frase.charAt(x);
		
		System.out.println(fraseInvertida);
		
		if(frase==fraseInvertida) {
			System.out.println("La oracion es un palíndromo ");
		}
		else {
			System.out.println("La oracion no es un palíndromo  ");
		}
		}
		
		
	}

}
