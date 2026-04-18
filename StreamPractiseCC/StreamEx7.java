package StreamPractiseCC;

import java.util.List;
import java.util.Optional;

import Models.Employee;

public class StreamEx7 {
    public static void main(String[] args) {
        
    //Find the first employee whose salary is greater than 50000

    List<Employee> employees = Employee.empList();


    Optional<Employee> empList = employees.stream()
                    .filter(emp -> emp.getSalary() > 50000)
                    .findFirst();

        if(empList.isPresent())
        {
            System.out.println(empList.get());
        }

    }
}
