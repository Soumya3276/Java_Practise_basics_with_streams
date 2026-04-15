package StreamsPractiseCS;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamDm6 {
    public static void main(String[] args) {
        //Find the most frequent character on a string

        String input = "banana";

        Map.Entry<Character,Long> maxFreq = input.chars() //converts to IntStream of ASCII values
                .mapToObj(c-> (char)c) //Converts back to Stream of Character
                .collect(Collectors.groupingBy(c->c,Collectors.counting())) //returns Map
                .entrySet() 
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(maxFreq);
    }
    
}
