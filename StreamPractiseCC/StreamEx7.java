package StreamPractiseCC;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamEx7 {
    public static void main(String[] args) {
        
    //Find the first employee whose salary is greater than 50000

    List<Employee> employees = Arrays.asList(
            new Employee("Karan", "Sales", 45000),
            new Employee("Riya", "HR", 65000),
            new Employee("Ravi", "Engineering", 80000),
            new Employee("Sneha", "Finance", 70000),
            new Employee("Vikram", "Marketing", 68000),
            new Employee("Anjali", "IT", 78000),
            new Employee("Meera", "Operations", 55000),
            new Employee("Arjun", "Engineering", 75000),
            new Employee("Rahul", "Engineering", 72000),
            new Employee("Simran", "HR", 48000),
            new Employee("Amit", "Finance", 62000)
        );


    Optional<Employee> empList = employees.stream()
                    .filter(emp -> emp.getSalary() > 50000)
                    .findFirst();

        if(empList.isPresent())
        {
            System.out.println(empList.get());
        }

    }
}
