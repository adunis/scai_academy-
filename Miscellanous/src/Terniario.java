import java.util.Scanner;

public class Terniario {

	public static void main(String[] args) {
		/**
		 * Scrivere un metodo che, dati un intero ed un booleano, restituisca
		 * true se e solo se l'intero � multiplo di 3 e il booleano sia false
		 */

		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Inserisci l'Intero");
		int intero = myObj.nextInt();
		
		System.out.println("Inserisci il Booleano");
		boolean booleano = myObj.nextBoolean();
		
		myObj.close();

		System.out.println(metodo(intero, booleano));

	}

	public static int metodo(int a, boolean b) {

		  return  a % 3 == 0 & b == false ? 1 : 0; 
		
	}

}
