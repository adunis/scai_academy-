package main.java.corso.model;

public class Employeed {
   private  String name; 
   private String surname;
   private int age;
   private String dateEntry;

    public Employeed (String surname, String name, int age, String dateEntry){
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        this.setDateEntry(dateEntry);
    }

    public String getDateEntry() {
		return dateEntry;
	}

	public void setDateEntry(String dateEntry) {
		this.dateEntry = dateEntry;
	}
 
	public int getAge() {
		return age;
	 }

	public void setAge(int age) {
		this.age = age;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public Employeed(){

    }*/

    public double calculateSalary(){
        return 0;
    }

}