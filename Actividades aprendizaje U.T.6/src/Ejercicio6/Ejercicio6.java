package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n1;
		
		System.out.println("Por favor introduzca un NIF y comprobaremos si es valido ");
		Scanner esc= new Scanner(System.in);
		n1=esc.next();
		if(Character.isAlphabetic(n1.charAt(8)) && n1.length()==9) {
			
			System.out.println("Es un NIF valido ");
			
		}
		else {
			System.out.println("No es un NIF valido ");
		}
		
		
	}

}
