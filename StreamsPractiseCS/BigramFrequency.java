package StreamsPractiseCS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {
    public static void main(String[] args) {
        //Find bigram frequencies(pairs of consecutive words)
String paragraph = """
    Java is great. Java is are object oriented.
    Java streams streams are powerful and Java is fun!""";

        String[] words = paragraph.toLowerCase()
        .replaceAll("[^a-z\\s]", "")
        .split(" ");

        List<String> bigramList = IntStream.range(0,words.length-1)
        .mapToObj(i -> words[i]+" "+words[i+1])
        .toList();

        // System.out.println(bigramList);

        Map<String, Long> collect = bigramList.stream()
                        .collect(Collectors.groupingBy(
                            Function.identity(),Collectors.counting()
                        ));

        System.out.println(collect);
    }
}
