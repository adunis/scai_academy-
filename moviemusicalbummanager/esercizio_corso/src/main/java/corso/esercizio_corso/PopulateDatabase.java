package corso.esercizio_corso;


import java.util.ArrayList;
import java.util.List;

import corso.esercizio_corso.model.*;
import corso.esercizio_corso.model.enums.MediaType;
import corso.esercizio_corso.model.enums.Occupation;

public class PopulateDatabase {
	public static void Populate(
			
	    List<Product> products,
	 	List<Person> actors001,
	 	List<Person> actors002,
	 	List<Person> actors003,
	 	List<Product> mediaContent01,
	 	List<Product> mediaContent02,
	 	List<Product> mediaContent03,
	 	List<MediaStorage> mediaStorages
	) {

 		actors001.add(new Person("P01", "John Smite", Occupation.ACTOR));
 		actors001.add(new Person("P02", "Loren Gauss", Occupation.ACTOR));
 		actors001.add(new Person("P03", "Rudy Groovy", Occupation.ACTOR));

 		actors002.add(new Person("P01", "John Smite", Occupation.ACTOR));
 		actors002.add(new Person("P02", "Loren Gauss", Occupation.ACTOR));
 		actors002.add(new Person("P03", "Rudy Groovy", Occupation.ACTOR));

 		actors003.add(new Person("P01", "John Smite", Occupation.ACTOR));
 		actors003.add(new Person("P02", "Loren Gauss", Occupation.ACTOR));
 		actors003.add(new Person("P03", "Rudy Groovy", Occupation.ACTOR));

 		Person director01 = new Person("R01", "Anic Urde", Occupation.DIRECTOR);
 		Person director02 = new Person("R02", "Jiller Fire", Occupation.DIRECTOR);
 		Person director03 = new Person("R03", "Yurd Zveinhan", Occupation.DIRECTOR);


 		products.add(new Movie("M01", actors001, "Draghi Verdi in Cucina", "Documentari", director01, 2200));
 		mediaContent01.add(new Movie("M01", actors001, "Draghi Verdi in Cucina", "Documentari", director01, 2200));

 		products.add(new Movie("M02", actors002, "La Carica degli 99 Zombie", "Avventura", director02, 2010));
 		products.add(new Movie("M03", actors003, "La Ninfa Ninja", "Thriller", director03, 1980));

 		products.add(new MusicAlbum("A01", "Crazy Tram", "Hard & Heavy", director01, 1920));
 		mediaContent02.add(new MusicAlbum("A01", "Crazy Tram", "Hard & Heavy", director01, 1920));
 		products.add(new MusicAlbum("A02", "Raining Wine", "Thrash Metal", director02, 1930));
 		products.add(new MusicAlbum("A03", "Holy Diner", "Hard Rock", director03, 1950));
 		mediaContent03.add(new MusicAlbum("A03", "Holy Diner", "Hard Rock", director03, 1950));

 		mediaStorages.add(new MediaStorage("Media01", "Draghi Verdi in Cucina", MediaType.CD, mediaContent01));
 		mediaStorages.add(new MediaStorage("Media02", "Crazy Tram", MediaType.DVD, mediaContent02));
 		mediaStorages.add(new MediaStorage("Media03", "Holy Diner", MediaType.DVD, mediaContent03));

     }
}
