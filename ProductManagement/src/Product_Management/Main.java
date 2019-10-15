package Product_Management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;  

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub

		List<Movie> listMovie = new ArrayList<>();
		List<Book> listBook = new ArrayList<>();

		listMovie.add(new Movie("It Chapter Two", "Regia1", "Italiano", 10.00, 5.30));
		listMovie.add(new Movie("Edie", "Regia1", "Italiano", 20.00, 5.30));
		listMovie.add(new Movie("Night Hunter (Nomis)", "Regia1", "Italiano", 15.00, 5.30));

		listBook.add(new Book("LOTR", "Tolkien", "Italiano", 7.00, 3.30));
		listBook.add(new Book("LOTR1", "Tolkien", "Italiano", 8.00, 4.00));
		listBook.add(new Book("LOTR3", "Tolkien", "Italiano", 9.00, 2.30));

		Scanner myObj = new Scanner(System.in);
		System.out.println("Vuoi cercare un Movie o un Book?");
		String movieobook = myObj.nextLine();

		switch (movieobook) {
		case "Movie":

			System.out.println("Che movie cerchi?");
			String ins = myObj.nextLine();

			List<Movie> res = listMovie.stream().filter(x -> x.title.equalsIgnoreCase(ins.trim()))
					.collect(Collectors.toList());
            //test 


			for (Movie movie : res) {
				{
					System.out.println(movie.getId());
				}
			}
			break;
		case "Book":

			System.out.println("Che book cerchi?");
			String TitoloBook = myObj.nextLine();
			System.out.println(TitoloBook);

			break;
		default:
			System.out.println("Input sbagliato");
			break;
		}
	}

}
