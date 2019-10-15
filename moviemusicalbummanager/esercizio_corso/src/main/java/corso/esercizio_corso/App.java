package corso.esercizio_corso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import corso.esercizio_corso.model.*;
import corso.esercizio_corso.model.enums.MediaType;
import corso.esercizio_corso.service.Printer;
import corso.esercizio_corso.service.ProductService;

public class App {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		List<Person> actors001 = new ArrayList<Person>();
		List<Person> actors002 = new ArrayList<Person>();
		List<Person> actors003 = new ArrayList<Person>();
		List<Product> mediaContent01 = new ArrayList<Product>();
		List<Product> mediaContent02 = new ArrayList<Product>();
		List<Product> mediaContent03 = new ArrayList<Product>();
		List<MediaStorage> mediaStorages = new ArrayList<MediaStorage>();

		PopulateDatabase.Populate(products, actors001, actors002, actors003, mediaContent01, mediaContent02,
				mediaContent03, mediaStorages);

		Scanner myScanner = new Scanner(System.in);
		
		
		
		System.out.println("Digita 1 se vuoi cercare un Movie o Digita 2 se vuoi cercare un Album Musicale");
		
		int inputOption = Integer.parseInt(myScanner.nextLine());
		
		System.out.println("Per Ricercare per Titolo digita 1, per Ricercare per Genere digita 2.");
		System.out.println("per Ricercare per Supporto digita 3, per Ricercare un Film per Regista digita 4");
		System.out.println("per Ricercare per Artista un Album Musicale digita 5");

		String inputSearch = myScanner.nextLine();
	
		switch (Integer.parseInt(inputSearch)) {

		case 1:
			System.out.println("Digita il Titolo dell'opera che stai cercando.");
			
			String inputSearchTitle = myScanner.nextLine();

			List<Product> resultTitle = ProductService.searchByTitle(products,inputSearchTitle,inputOption);

			Printer.printer(resultTitle);

			myScanner.close();
			break;

		case 2:

			System.out.println("Digita il Genere dell'opera che stai cercando.");
			String inputSearchGenre = myScanner.nextLine();

			List<Product> resultGenre = ProductService.searchByGenre(products, inputSearchGenre, inputOption);

			Printer.printer(resultGenre);

			myScanner.close();
			break;

		case 3:

			System.out.println(
					"Digita il nome del supporto per sapere da "
					+ "quali opere viene supportato (CD / DVD / Blueray)");

			MediaType inputSearchMedia = MediaType.valueOf(myScanner.nextLine());
			
			List<Product> resultMedia = ProductService.searchByMediaType(mediaStorages, inputSearchMedia);

			Printer.printer(resultMedia);
			
			myScanner.close();
			break;

		case 4:

			myScanner.close();
			break;

		case 5:

			myScanner.close();
			break;

		default:
			System.out.println("Wrong input, restarting app.");
			myScanner.close();
			return; 
		}

	}
}
