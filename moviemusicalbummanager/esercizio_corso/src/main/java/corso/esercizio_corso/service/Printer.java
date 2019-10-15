package corso.esercizio_corso.service;

import java.util.List;

import corso.esercizio_corso.model.*;

public class Printer {

	public static void printer(List<Product> input){
		for (Product printedResult : input) {
			
			System.out.println("########");
			System.out.println("--------");
			
			System.out.println("Titolo:");
			System.out.println(printedResult.getTitle());
			System.out.println("--------");
			
			System.out.println("Genere:");
			System.out.println(printedResult.getGenre());
			System.out.println("--------");
			
			System.out.println("Autore:");
			System.out.println(printedResult.getAuthor().getName());
			
			System.out.println("--------");
			System.out.println("########");
		
		}
	}
	
	
}

