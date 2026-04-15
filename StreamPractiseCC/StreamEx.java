package StreamPractiseCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        //remove duplicate and sort them in descending order
        List<Integer> list = new ArrayList<>(Arrays.asList(5,6,1,3,9));

        list.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList())
            .forEach(System.out::println); //internal iteration


    }
}
