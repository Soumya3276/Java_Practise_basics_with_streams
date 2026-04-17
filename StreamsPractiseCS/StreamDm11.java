package StreamsPractiseCS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDm11 {
    public static void main(String[] args) {
        //find top 3 most frquent words in a paragraph
        String paragraph = "Java is great. Java is are object oriented. Java streams streams are powerful and Java is fun!";

        List<Map.Entry<String,Long>> strs = Arrays.stream(paragraph
            .toLowerCase()
            .replaceAll("[^a-z\\s]", "")
            .split(" "))
            .collect(Collectors.groupingBy(w -> w,Collectors.counting()))
            .entrySet().stream()
            .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
            .limit(3)
            .collect(Collectors.toList());

            System.out.println(strs);


            //enhancement
            List<Map.Entry<String,Long>> lists = Arrays.stream(paragraph
            .toLowerCase()
            .replaceAll("[^a-z\\s]", "")
            .split(" "))
            .collect(Collectors.groupingBy(w -> w,Collectors.counting()))
            .entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
            .collect(Collectors.toList());

            System.out.println(lists);


            List<Long> topFreq = lists.stream()
                            .map(e -> e.getValue())
                            .sorted(Comparator.reverseOrder())
                            .limit(3)
                            .toList();
            System.out.println(topFreq);     
            
            List<Map.Entry<String,Long>> mostFreq = lists.stream()
                        .filter(e -> topFreq.contains(e.getValue()))
                        .toList();

            System.out.println(mostFreq);




       
 }
}
