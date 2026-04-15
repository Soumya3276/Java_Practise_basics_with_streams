package StreamPractiseCC;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx13 {
    public static void main(String[] args) {
        
        //Average salary of Employees in each department

        List<Employee> emps = Employee.empList();

        Map<String,Double> empAvg = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                                                    Collectors.averagingDouble(Employee::getSalary)
        ));

        empAvg.forEach((k,v) -> System.out.println(k + " has average salary " + v));
    }
    
}
