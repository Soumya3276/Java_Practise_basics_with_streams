package StreamPractiseCC;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx5 {
    public static void main(String[] args) {
        
        //from list of integers divide the number by even and odd.

        List<Integer> list = Arrays.asList(10,23,2,83,45,37,10,45,80,2);

        Map<Boolean,List<Integer>> col = list.stream().distinct()
                    .collect(Collectors.partitioningBy(n -> n%2==0));

        col.forEach((k,v) -> {
            String s ="";
            if(k) { s = "even"; }
            else { s = "odd"; }
            System.out.println(s + "-> " + v);
        });
    }
}
