package MyPractiseStream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Models.Employee;

public class EmpNameFreq{
    public static void main(String[] args) {
        List<Employee> empList = Employee.empList();

        Map<String, Long> empFreq = empList.stream()
                        .collect(Collectors.groupingBy(
                            Employee::getName,
                            Collectors.counting()
                        ));

        System.out.println(empFreq);
    }
}