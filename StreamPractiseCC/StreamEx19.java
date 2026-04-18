package StreamPractiseCC;

import java.util.List;

import Models.Employee;

public class StreamEx19 {
    public static void main(String[] args) {
        //total combined salary of all the employees, the operation should be very fast.

        List<Employee> empList = Employee.empList();

        double sum = empList.parallelStream()
                .map(emp -> emp.getSalary())
                .reduce(0.0,(x,y) -> x+y);
        
        System.out.println(sum);
    }
    
}
