import java.util.Scanner;

public class DivisoreConIf {

	public static void main(String[] args) {
		/**
		 *  Scrivere un metodo ceh, dati due interi, 
		 *  restituisca la divisione dei due se il primo 
		 *  non � multiplo del secondo, altrimenti la 
		 *  moltiplicazione
		 */
		
		
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Inserisci il primo numero");
		int numero_uno = myObj.nextInt(); 
		System.out.println("Inserisci il secondo numero");
		int numero_due = myObj.nextInt(); 
		myObj.close();
		
		System.out.println(metodo(numero_uno, numero_due)); 

	}
		
		public static double metodo(int a, int b) {
			
			if (a%b!=0){
				System.out.println("Il primo non � multiplo del secondo. a/b = ");
				return  (double) a/(double) b; 
			}
			else {
				System.out.println("Il primo � multiplo del secondo. a*b = ");
				return a*b; 
			}
			
		}
			
	}

