package corso.esercizio_corso.model;

import corso.esercizio_corso.model.enums.Occupation;

public class Person {
	private String idPerson;
	private String name;
	private Occupation occupation; 
	
	
	public Person(String idPerson, String name, Occupation occupation) {
		this.setIdPerson(idPerson); 
		this.setName(name); 
		this.setOccupation(occupation); 
	}


	public Occupation getOccupation() {
		return occupation;
	}


	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIdPerson() {
		return idPerson;
	}


	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}
}

