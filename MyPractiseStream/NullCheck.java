package MyPractiseStream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class NullCheck {
    public static void main(String[] args) {
        
    
    List<Integer> list = Arrays.asList(1,3,null,5,7,9,null,12);

    list.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);

    }
}
