package test;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

    public int id;
    public String name;
    public int departmentId;
    public Date dateOfBirth;

    public Employee(int id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(int id, String name, int departmentId) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.dateOfBirth = new GregorianCalendar(0,1,1).getTime();
    }
}
