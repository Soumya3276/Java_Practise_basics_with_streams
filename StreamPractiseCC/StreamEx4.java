package StreamPractiseCC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx4 {
    public static void main(String[] args) {
        //second highest number in a list

        List<Integer> list = Arrays.asList(10,23,2,83,45,37,10,45,80,2);

        int secMax = list.stream().distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst()
                    .orElseThrow();
                    
        System.out.println(secMax);
    }
    
}
