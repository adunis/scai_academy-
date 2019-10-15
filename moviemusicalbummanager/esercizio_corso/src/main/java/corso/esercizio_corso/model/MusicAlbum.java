package corso.esercizio_corso.model;

public class MusicAlbum extends Product {
  
	String MusicAlbum; 
	
	   private String idMusicAlbum; 

	    public MusicAlbum(String idMusicAlbum, String title, String genre, Person author, int releaseYear){
	    	super(title,genre,author,releaseYear);
	    	this.setIdMusicAlbum(idMusicAlbum);
	    }

		public String getIdMusicAlbum() {
			return idMusicAlbum;
		}

		public void setIdMusicAlbum(String idMusicAlbum) {
			this.idMusicAlbum = idMusicAlbum;
		}
	    
	    
}
