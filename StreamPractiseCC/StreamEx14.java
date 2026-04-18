package StreamPractiseCC;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx14 {
    public static void main(String[] args) {
        //highest paid employee in each department

         List<Employee> emps = Employee.empList();

        Map<String,Optional<Employee>> deptHigh = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                                                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));


        deptHigh.forEach((k,v) -> System.out.println(k + " has highest salary " + v.get()));
    }
    
}
