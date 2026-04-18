package StreamsPractiseCS;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamDm8 {
    public static void main(String[] args) {
        //Find the most common first letter among all employee names

        List<Employee> empList = Employee.empList();

        System.out.println(empList.stream()
                        .map(e -> e.getName().charAt(0))
                        .collect(Collectors.groupingBy(Function.identity(),
                                                        Collectors.counting()))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue()));

        //if there is same count for 2 characters
        Map<Character,Long> charCountMap = empList.stream()
                        .map(e -> e.getName().charAt(0))
                        .collect(Collectors.groupingBy(Function.identity(),
                                                        Collectors.counting()));

        Long maxCount = charCountMap.values().stream().max(Long::compareTo).orElse(0L);

        String result = charCountMap.entrySet().stream()
                                .filter(e -> e.getValue() == maxCount)
                                .map(entry -> entry.getKey() + " = " + entry.getValue())
                                .collect(Collectors.joining(", "));

        System.out.println(result);

        
        
    }
    
}
