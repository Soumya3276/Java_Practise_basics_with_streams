package StreamPractiseCC;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx8 {
    public static void main(String[] args) {

        //Find top 2 highest paid employees

    List<Employee> employees = Employee.empList();

        List<Employee> highestpaid = employees.stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .limit(2)
                        .collect(Collectors.toList());
        
        System.out.println(highestpaid);
    }
}
