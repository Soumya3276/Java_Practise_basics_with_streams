package MyPractiseStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindEvenAverage {
    public static void main(String[] args) {
        
    
    List<Integer> list = Arrays.asList(1,5,4,3,2,7,2,6,5,3,2);


    //Average of even numbers
    double avgs = list.stream().distinct()
                .filter(n -> n%2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

    System.out.println(avgs);

    }
}
