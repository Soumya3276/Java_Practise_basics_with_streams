package StreamsPractiseCS;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamDm5 {
    public static void main(String[] args) {
        //Find department with more than two employees

        List<Employee> empList = Employee.empList();
        
        // Map<String,Long> deptCount = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        //                                                 Collectors.counting()));

        /*
        deptCount.entrySet() = [
        ("IT" -> 3),
        ("HR" -> 2),
        ("Finance" -> 2)
        ] */


        List<String> depts = empList.stream()
                            .collect(Collectors.groupingBy(Employee::getDepartment,
                            Collectors.counting()))
                            .entrySet().stream()
                            .filter(elem -> elem.getValue()>2)
                            .map(e -> e.getKey())
                            .collect(Collectors.toList());

        System.out.println(depts);



        //find Department with highest average salary

        String highAvg = empList.stream()
                                            .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.averagingDouble(Employee::getSalary)))
                                                .entrySet().stream()
                                                // .peek(System.out::println)
                                                .max(Map.Entry.comparingByValue(




                                                ))
                                                // .max(Comparator.comparing(elem -> elem.getValue())) //returns map entry
                                                .orElseThrow() 
                                                .getKey(); 

        System.out.println("Dept with highest average: " + highAvg);
    }    
}
