package StreamPractiseCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        //find all odd numbers and return their squares

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list.stream().filter(n-> n%2 !=0)
                        .map( n -> n*n)
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
    }
    
}
