package MyPractiseStream;

import java.util.Comparator;
import java.util.List;

import Models.Employee;

public class HighestSalaryHR {
    public static void main(String[] args) {
        
        List<Employee> empList = Employee.empList();

       Employee emp = empList.stream().filter(e -> e.getDepartment().equals("HR"))
                        .max(Comparator.comparingDouble(Employee::getSalary))
                        .orElse(Employee.getEmp());

        System.out.println(emp);
    }
}
