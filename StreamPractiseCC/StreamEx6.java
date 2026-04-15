package StreamPractiseCC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx6 {
    public static void main(String[] args) {
        
        //return longest string in java

        List<String> strList = Arrays.asList("Apple","Banana","Mango","Kiwi","Peach");

        String longest = strList.stream().max((a,b)-> a.length() - b.length()).get();
        String lngest = strList.stream().max(Comparator.comparing(String::length)).get();
        String lng = strList.stream().sorted((a,b) -> b.length() - a.length()).findFirst().get();
        //new trick: multiply -1 with the logic.
        String lString = strList.stream().sorted(Comparator.comparing(s -> -1 * s.length())).findFirst().get();
        
        System.out.println(longest);
        System.out.println(lngest);
        System.out.println(lng);

        System.out.println(lString);
    }
    
}
