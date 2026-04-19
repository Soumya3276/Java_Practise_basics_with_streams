package MyPractiseStream;

import java.util.HashSet;
import java.util.Set;

public class AllUniqueChar {
    public static void main(String[] args) {
        String sentence = "abcdef";

        Set<Integer> charInt = new HashSet<>();
        boolean allUni = sentence.chars().allMatch(elem -> charInt.add(elem));
        System.out.println(allUni);
    }
}
