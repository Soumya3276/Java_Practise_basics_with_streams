package StreamPractiseCC;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx10 {
    public static void main(String[] args) {
        //frequency of each element
        
        List<Integer> ints = Arrays.asList(1,4,3,2,5,7,6,8,1,3,2,4,9,5,3,6,2,3,2,5);

        Map<Integer,Long> freq = ints.stream()
                                    .collect(Collectors.groupingBy( i -> i ,Collectors.counting()));


        freq.forEach((k,v) -> {System.out.println("Count of "+k+" is : " +v);});
    }
    
}
