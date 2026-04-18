package StreamPractiseCC;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx9 {
    public static void main(String[] args) {
        
    //sort by salary and then by name
    List<Employee> empList = Employee.empList();


    List<Employee> sortedList = empList.stream()
                    .sorted(Comparator.comparing(Employee::getSalary)
                            .thenComparing(Employee::getName))
                    .collect(Collectors.toList());

    Comparator<Employee> comp = (emp1,emp2) -> {
        if(emp1.getSalary()>emp2.getSalary())
            return 1; //swap
        else if(emp1.getSalary()<emp2.getSalary())
            return -1; //stay
        else {
            return emp1.getName().compareTo(emp2.getName());
        }
    };


    List<Employee> sortEmps = empList.stream()
                    .sorted(comp)
                    .collect(Collectors.toList());

    sortedList.forEach(System.out::println);
    System.out.println("Using comp: ");

    sortEmps.forEach(System.out::println);




    }
    
}
