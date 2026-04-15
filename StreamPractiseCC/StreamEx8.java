package StreamPractiseCC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx8 {
    public static void main(String[] args) {

        //Find top 2 highest paid employees

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

        List<Employee> highestpaid = employees.stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .limit(2)
                        .collect(Collectors.toList());
        
        System.out.println(highestpaid);
    }
}
