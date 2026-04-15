package StreamPractiseCC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx17 {
    //Convert it into a single list with all the elements and remove duplicates if any.
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                        Arrays.asList(1,2,3,4),
                        Arrays.asList(5,4,3,2),
                        Arrays.asList(9,8,3,4),
                        Arrays.asList(1,2,7,6)
        );

        List<Integer> result =  listOfLists.stream()
                            .flatMap(inList -> inList.stream()) //all streams should be in single stream
                            .distinct()
                            .sorted() // for fun
                            .collect(Collectors.toList());
                
        System.out.println(result);

    }
    
}
