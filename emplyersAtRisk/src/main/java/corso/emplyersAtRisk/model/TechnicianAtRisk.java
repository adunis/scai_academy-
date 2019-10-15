package main.java.corso.emplyersAtRisk.model;
import main.java.corso.interfaces.employeedAtRisk;

public class TechnicianAtRisk extends Technician implements employeedAtRisk {
    
	public TechnicianAtRisk(String surname, String name, int age, String dateEntry, int units) {
		super(surname, name, age, dateEntry, units);
	}
    
    @Override
   public double calculateSalary(){
        return 0;
    }

}