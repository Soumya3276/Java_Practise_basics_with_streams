package MyPractiseStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElement {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,7,8);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7,8);
        List<Integer> list3 = Arrays.asList(1,2,3,6,7,9);

        Set<Integer> set1 = new HashSet<>(list2);
        Set<Integer> set2 = new HashSet<>(list3);

        List<Integer> common = list1.stream().filter(e -> set1.contains(e) && set2.contains(e))
        .toList();

        System.out.println(common);
    }
}
