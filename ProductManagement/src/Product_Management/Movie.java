package Product_Management;
public class Movie extends Product {
String title; 
String director; 
String language; 

	public Movie(String title, String director, String language, Double price, Double weight ){
		super(price, weight); 
		this.title = title; 
		this.director = director; 
		this.language = language; 
	}

	
}
