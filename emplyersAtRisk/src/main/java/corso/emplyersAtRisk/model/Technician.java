package main.java.corso.emplyersAtRisk.model;
import main.java.corso.model.Employeed;

public class Technician extends Employeed{
    int units;

    public Technician (String surname, String name, int age, String dateEntry, int units){
        super(surname, name, age, dateEntry);
        this.units = units;
    }

    @Override
   public double calculateSalary(){
        return 0;
    }

}