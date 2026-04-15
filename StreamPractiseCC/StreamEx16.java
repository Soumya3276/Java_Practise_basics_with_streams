package StreamPractiseCC;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx16 {

    //Return the common element in both the lists
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,4,5,6);

        List<Integer> res = list2.stream()
                    .filter(e -> list1.contains(e))
                    .collect(Collectors.toList());

        System.out.println(res);

        Set<Integer> set = new HashSet<>(list1);

        List<Integer> result = list2.stream()
                    .filter(e -> set.contains(e))
                    .collect(Collectors.toList());

        System.out.println(result);
        


    }
    
}
