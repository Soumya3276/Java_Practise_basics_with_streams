package MyPractiseStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        

    List<String> fruits = Arrays.asList("Apple","Banana","Kiwi","Blueberry","Apricot");

    Map<Character,String> mapper = fruits.stream()
                                                .collect(Collectors.
                                                    toMap(
                                                    s-> s.charAt(0),
                                                    s -> s,
                                                    (e,n) -> e + "," + n));

    System.out.println(mapper);

    Map<Character,List<String>> mapFr  = fruits.stream().collect(Collectors.groupingBy(
        s -> s.charAt(0)));

    System.out.println(mapFr);
    
    }
}
