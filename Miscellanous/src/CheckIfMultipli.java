
import java.util.Scanner;

public class CheckIfMultipli {

	public static void main(String[] args) {
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Inserisci primo numero");
	    int numero_uno = myObj.nextInt();  // Read user input
	    System.out.println("Inserisci primo numero");
	    int numero_due = myObj.nextInt();  // Read user input

	    resto(numero_uno, numero_due);
		
	}

	private static boolean resto (int a, int b){
		if (a%b==0){
			System.out.println("Sono multipli!");
			return true;
		}
		System.out.println("Non sono multipli!");
		return false;
	}
}