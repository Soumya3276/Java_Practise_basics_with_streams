package MyPractiseStream;

import java.util.Arrays;
import java.util.List;

public class Alphanumeric {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('A','b','3','2','Z'
                                                ,'7','m');

        List<Character> list = chars.stream().filter(c -> Character.isDigit(c))
        .toList();

        System.out.println(list);
    }

}
