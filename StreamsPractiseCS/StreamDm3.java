package StreamsPractiseCS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDm3 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList(
                                    "Apple",
                                        "Banana",
                                        "Orange",
                                        "Mango",
                                        "Grapes",
                                        "Strawberry",
                                        "Pineapple",
                                        "Watermelon",
                                        "Papaya",
                                        "Kiwi",
                                        "Apricot",
                                        "Avocado",
                                        "Acai",
                                        "Arbutus"
                                    );

        //count of starting with A fruits names
        long count = fruits.stream()
                                .filter(s-> s.toUpperCase().startsWith("A"))
                                .count();

        System.out.println(count);

        System.out.println(fruits.stream().collect(Collectors.groupingBy(String::length)));



    }
    
}
