package corso.esercizio_corso.model;
import java.util.List;


public class Movie extends Product {

    private String idMovie; 
    private List<Person> actors;

    public Movie(String idMovie, List<Person> list, String title, String genre, Person author, int releaseYear){
    	super(title,genre,author,releaseYear);
    	this.idMovie = idMovie;
    	this.actors = list;
    }
    
    
}









