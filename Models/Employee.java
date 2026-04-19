package Models;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private double salary;

    Employee(){}


    public static Employee getEmp(){
        return new Employee();
    }

    

    Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static List<Employee> empList(){
        List<Employee> employees = Arrays.asList(
            new Employee("Karan", "Sales", 45000),
            new Employee("Riya", "HR", 65000),
            new Employee("Ravi", "Engineering", 80000),
            new Employee("Sneha", "Finance", 170000),
            new Employee("Vikram", "Marketing", 68000),
            new Employee("Anjali", "IT", 68000),
            new Employee("Meera", "Operations", 55000),
            new Employee("Arjun", "Engineering", 175000),
            new Employee("Rahul", "Engineering", 72000),
            new Employee("Simran", "HR", 48000),
            new Employee("Amit", "Finance", 62000)
        );

        return employees;
    }
    

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getDepartment() {
        return department;
    }



    public void setDepartment(String department) {
        this.department = department;
    }



    public double getSalary() {
        return salary;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }

    
}
