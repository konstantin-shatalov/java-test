package test;

import java.util.GregorianCalendar;
import java.util.List;

public class TestShortestName {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(3, "David", new GregorianCalendar(1982,1,1).getTime()),
                new Employee(1, "Peter", new GregorianCalendar(1955,4,10).getTime()),
                new Employee(5, "Bob", new GregorianCalendar(1990,8, 8).getTime()),
                new Employee(7, "Mark", new GregorianCalendar(2000,12, 25).getTime()),
                new Employee(4, "Frank", new GregorianCalendar(1990,5, 6).getTime())
        );
        // find employee with the shortest name and output their id,name

        // find the average age of all employees
    }
}
