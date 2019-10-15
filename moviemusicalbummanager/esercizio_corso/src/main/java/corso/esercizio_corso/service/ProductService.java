package corso.esercizio_corso.service;

import java.util.ArrayList;
import java.util.List;

import corso.esercizio_corso.model.*;
import corso.esercizio_corso.model.enums.MediaType;


public class ProductService {

	public static List<Product> searchByTitle(List<Product> products, String title, int inputOption) {

		List<Product> result = new ArrayList<Product>();

		for (Product product : products) {
			
			if (inputOption == 1) {
				if (title.equals(product.getTitle()) && product instanceof Movie) {
					result.add(product);
				} 
				
			}
			
			if (inputOption == 0) {
				if (title.equals(product.getTitle()) && product instanceof MusicAlbum) {
					result.add(product);
				} 
				
			}
				
			}
			
		return result;
		}
		


	public static List<Product> searchByGenre(List<Product> products, String genre, int inputOption) {

		List<Product> result = new ArrayList<Product>();

		for (Product product : products) {
			if (genre.equals(product.getGenre())&& product instanceof Movie) {
				result.add(product);
			}
			
			if (genre.equals(product.getGenre())&& product instanceof MusicAlbum) {
				result.add(product);
			}
		}
		return result;
	}

	public List<Product> searchByAuthor(List<Product> products, Person author) {

		List<Product> result = new ArrayList<Product>();

		for (Product product : products) {
			if (author.equals(product.getAuthor())) {
				result.add(product);
			}
		}
		return null;
	}

	public static List<Product> searchByMediaType(List<MediaStorage> mediaStorages, MediaType inputSearchMedia) {
		
		List<Product> result = new ArrayList<Product>();
			
		for (MediaStorage mediaStorage : mediaStorages) {
			if (mediaStorage.getMediaType() == (MediaType) inputSearchMedia){
				result.addAll(mediaStorage.getContent());
			}
		}
			
		 return result; 
		
		
		
		
	}

}
