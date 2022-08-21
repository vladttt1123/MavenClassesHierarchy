package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public class ServiceSecurity extends Service{


    public ServiceSecurity(String name, int age, int jobId, int yearsWorked, double salaryHourly, String departmentName)
              {
        super(name, age, jobId, yearsWorked, salaryHourly, departmentName);
    }

    @Override
    public void work() {
        System.out.println("ServiceSecurity works");
    }

    public void protect(){
        //to implement
    }

    @Override
    public String toString() {
        return "ServiceSecurity {" + "name= " + getName() + ", yearsOfExperience " + getYearsWorked() +
                ", department name " + getDepartmentName() + "}";
    }
}
