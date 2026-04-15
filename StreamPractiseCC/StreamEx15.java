package StreamPractiseCC;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEx15 {

    //Return all the name as Comma separated
    public static void main(String[] args) {
        
    List<Employee> empList = Employee.empList();

    String names = empList.stream()
                    .map(emp -> emp.getName())
                    .sorted()
                    .collect(Collectors.joining(","));

    System.out.println(names);
    
    }
}
