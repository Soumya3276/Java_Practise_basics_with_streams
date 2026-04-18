package MyPractiseStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamPrc {
    public static void main(String[] args) {
        List<String> fruitNames = Arrays.asList("apple", "banana", "orange", "mango", "grape","kiwi");
        
        TreeMap<Integer, List<String>> maps = fruitNames.stream()
                        .collect(Collectors.groupingBy(String::length
                    ,TreeMap::new,
                Collectors.toList()));
                        
   
                fruitNames.stream().forEach(fr -> {
    Map<String, Long> charCount = Arrays.stream(fr.split(""))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        
    Optional<Map.Entry<String, Long>> maxEntry = charCount.entrySet().stream()
        .max(Map.Entry.comparingByValue());
    if (maxEntry.isPresent()) {
        System.out.println(fr + ": " + maxEntry.get().getKey() + " (" + maxEntry.get().getValue() + ")");
    }
});


        System.out.println(maps);


    }
}
