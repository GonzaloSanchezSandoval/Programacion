package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String Contar = ("la casa azul esta encima de la montaña");
		 
		 System.out.println(Contar);
		 
		 int contador=0;
		 
		 for(int i=0;i<Contar.length();i++) {
			 
			 if((Contar.charAt(i)=='a')||(Contar.charAt(i)=='e')||(Contar.charAt(i)=='i')||(Contar.charAt(i)=='o')||(Contar.charAt(i)=='u')) {
				 
				 contador++;
			 }
			 
		 }
		 System.out.println("El numero de vocales en la oración es "+contador);
	}

}
