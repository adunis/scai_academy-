package main.java.corso.emplyersAtRisk.model;
import main.java.corso.model.Employeed;

public class Maintainer extends Employeed{
   private int hours;

    public Maintainer (String surname, String name, int age, String dateEntry, int CA){
        super(surname, name, age, dateEntry);
        this.setCA(CA);
    }

    public int getCA() {
		return hours;
	}

	public void setCA(int cA) {
		this.hours = cA;
	}

	@Override
   public double calculateSalary(){
        return 0;
    }

}