package StreamPractiseCC;

import java.util.List;

import Models.Employee;

public class StreamEx18 {
    //print all names, order does not matter but should be fast
    public static void main(String[] args) {
        List<Employee> empList = Employee.empList();

        empList.parallelStream().map(emp -> emp.getName())
        .forEach(System.out::println);
    }
    
}
