package StreamsPractiseCS;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamDm12 {
    public static void main(String[] args) {
        String sentence ="Java Streams are powerful";

        String reversed = Arrays.stream(sentence.split(" "))
                                        .map(word -> new StringBuilder(word).reverse())
                                        .collect(Collectors.joining(" "));
        System.out.println(reversed);


        //if StringBuilder cannot be used

        String strReversed = Arrays.stream(sentence.split(" "))
                                        .map(word -> Arrays.stream(word.split(""))
                                        .reduce("",(temp,ch) -> ch + temp))
                                        .collect(Collectors.joining(" "));
        System.out.println(strReversed);

    }
}
