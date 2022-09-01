package test;

import java.util.List;

class TestFaster {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(3, "David"),
                new Employee(1, "Peter"),
                new Employee(5, "Bob"),
                new Employee(7, "Mark"),
                new Employee(4, "Frank")
        );
        // find employee with id=7 and what is the name?
        // what is the complexity (ie in worst case how many operations it will take?)
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).id == 7) {
                System.out.println("Found " + employees.get(i).name);
            }
        }
        // change anything in this class to make search faster.
    }
}
