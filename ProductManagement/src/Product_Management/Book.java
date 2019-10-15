package Product_Management;

public class Book extends Product {
 String isbn; 
 String title; 
 String autore; 
 
 	public Book (String isbn, String title, String autore, Double price, Double weight){
 		super(price, weight);
 		this.isbn = isbn; 
 		this.title = title; 
 		this.autore = autore; 
 	}
 
}
