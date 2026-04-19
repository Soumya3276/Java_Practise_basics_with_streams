package MyPractiseStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        
    
    List<Integer> list = Arrays.asList(1,5,4,3,2,7,2,6,5,3,2);


    Set<Integer> sets = new HashSet<>();

    List<Integer> dups = list.stream().filter(n -> !sets.add(n)).toList();

    System.out.println(dups);


    List<Map.Entry<Integer,Long>> dupList = list.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()))
    .entrySet().stream().filter(e -> e.getValue()>1).collect(Collectors.toList());

    System.out.println(dupList);


    

    }
}
