package StreamsPractiseCS;

import java.util.List;
import java.util.stream.Collectors;

import Models.Employee;
import Models.SalaryRange;

public class StreamDm14 {
    public static void main(String[] args) {
    //Categorize employees based on their salary Low,Medium,high

    List<Employee> empList = Employee.empList();

    empList.stream()
                    .collect(Collectors.groupingBy(
                        //range
                        e -> {
                            return getSalaryRange(e);
                        }
                    )).forEach((k,v) -> System.out.println("\n"+ k +" = "+v + "\n"));
    }

    private static SalaryRange getSalaryRange(Employee e) {
        if(e.getSalary()<50000) return SalaryRange.LOW;
        else if(e.getSalary()<100000) return SalaryRange.MEDIUM;
        else return SalaryRange.HIGH;
    }
}
