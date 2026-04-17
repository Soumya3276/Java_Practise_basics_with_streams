package StreamsPractiseCS;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class StreamDm7{
    public static void main(String[] args) {
        String str = "abbacab";


        Character firstUnique = str.chars()
                    .mapToObj(c -> (char) c)
                    // .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                    .collect(Collectors.groupingBy(c -> c, () -> new LinkedHashMap<>(), Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .findFirst()
                    .orElseThrow()
                    .getKey();

        System.out.println("First unique character: " + firstUnique);
}

}