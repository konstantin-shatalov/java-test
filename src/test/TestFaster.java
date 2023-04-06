package test;

import java.util.List;

class TestFaster {
    public static void main(String[] args) {

        List<Department> departments = List.of(
            new Department(10, "IT"),
            new Department(20, "HR")
        );

        List<Employee> employees = List.of(
                new Employee(3, "David",10),
                new Employee(1, "Peter",10),
                new Employee(5, "Bob",10),
                new Employee(7, "Mark",20),
                new Employee(4, "Frank",20)
        );
        // SEARCH
        // find employee with id=7 and print what department he works in. The below code already works

    }
}
