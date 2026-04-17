package StreamsPractiseCS;

import java.util.Arrays;
import java.util.Comparator;

public class StreamDm10 {
    public static void main(String[] args) {
    //Find the longest word in a sentence ignoring case and punctuation

    String sentence = "The quick brown fox, jumps over the laziest dog!";

    String longestWord = Arrays.stream(
        sentence.toLowerCase().
        replaceAll("[^a-z\\s]","") //don't match any lowercase and space
        .split(" ") //split by space to get the words
    ).max(Comparator.comparing(String::length)) //comparing based on length
    .orElse("");

    System.out.println(longestWord);




    }
}
