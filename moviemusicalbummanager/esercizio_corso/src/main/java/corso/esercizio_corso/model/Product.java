package corso.esercizio_corso.model;

public abstract class Product {

	private String title = "";
	private String genre = "";
	private Person author = null;
	int releaseYear = 0;

	public Product(String title, String genre, Person author, int releaseYear) {
		this.setTitle(title);
		this.setGenre(genre);
		this.setAuthor(author);
		this.setReleaseYear(releaseYear);
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
}
