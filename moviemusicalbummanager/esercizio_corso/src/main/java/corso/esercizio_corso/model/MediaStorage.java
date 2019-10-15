package corso.esercizio_corso.model;

import java.util.List;

import corso.esercizio_corso.model.enums.MediaType;

public class MediaStorage {
  private String idMediaStorage; 
  private String nameMedia; 
  private MediaType mediaType; 
  private List<Product> content; 
  
  
  public MediaStorage(String idMediaStorage, String nameMedia, MediaType mediaType, List<Product> list) {
	  this.idMediaStorage = idMediaStorage;
	  this.nameMedia = nameMedia;
	  this.mediaType = mediaType; 
	  this.content = list; 
  }


public List<Product> getContent() {
	return content;
}


public void setContent(List<Product> list) {
	this.content = list;
}


public MediaType getMediaType() {
	return mediaType;
}


public void setMediaType(MediaType mediaType) {
	this.mediaType = mediaType;
}


public String getIdMediaStorage() {
	return idMediaStorage;
}


public void setIdMediaStorage(String idMediaStorage) {
	this.idMediaStorage = idMediaStorage;
}


public String getNameMedia() {
	return nameMedia;
}


public void setNameMedia(String nameMedia) {
	this.nameMedia = nameMedia;
}
  
  
}
