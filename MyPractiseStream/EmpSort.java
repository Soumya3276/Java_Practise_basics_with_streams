package MyPractiseStream;

import java.util.Comparator;
import java.util.List;

import Models.Employee;

public class EmpSort {
    public static void main(String[] args) {
        List<Employee> empList = Employee.empList();

        System.out.println("Now Ascending");
        empList.stream()
                        .sorted(Comparator.comparing(Employee::getName))
                        .toList().forEach(System.out::println);

        System.out.println("Now descending: ");
        empList.stream()
                        .sorted(Comparator.comparing(Employee::getName).reversed())
                        .toList().forEach(System.out::println);

        
    }
}
