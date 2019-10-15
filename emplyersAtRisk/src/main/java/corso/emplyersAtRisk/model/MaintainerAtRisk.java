package main.java.corso.emplyersAtRisk.model;
import main.java.corso.interfaces.employeedAtRisk;

public class MaintainerAtRisk extends Technician implements employeedAtRisk {
    
	public MaintainerAtRisk(String surname, String name, int age, String dateEntry, int hours) {
		super(surname, name, age, dateEntry, hours);
	}
    
    @Override
   public double calculateSalary(){
        return 0;
    }

}