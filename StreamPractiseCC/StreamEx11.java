package StreamPractiseCC;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx11 {
    public static void main(String[] args) {
        //Count employees in each department

        List<Employee> emps = Employee.empList();


        Map<String,Long> deptCount = emps.stream()
                                                .collect(Collectors.groupingBy(
                                                    Employee::getDepartment,Collectors.counting()));

        deptCount.forEach((k,v) -> System.out.println(k + " has "+ v + " employees"));
        
    }
    
}
