package main.java.corso.emplyersAtRisk.model;

import main.java.corso.model.Employeed;

public class Representative extends Employeed {

private int CA;

    public Representative(String surname, String name, int age, String dateEntry, int CA) {
		super(surname, name, age, dateEntry);
		this.setCA(CA);
	}

	public int getCA() {
		return CA;
	}

	public void setCA(int cA) {
		this.CA = cA;
	}

    @Override
    public double calculateSalary(){
        return 0;
    }


}