package test;

import java.util.List;

public class TestShortestName {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(3, "David"),
                new Employee(1, "Peter"),
                new Employee(5, "Bob"),
                new Employee(7, "Mark"),
                new Employee(4, "Frank")
        );
        // find employee with the shortest name and output their id,name
    }
}
