package MyPractiseStream;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateRemove {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,3,2,5,1,2,4,3);

        List<Integer> result = list.stream()
                                            .distinct() //internally uses LinkedHashSet
                                            .toList();
        System.out.println(result);

        Set<Integer> res = list.stream()
                                        .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(res);
    }
}
