package StreamsPractiseCS;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamDm2 {
    public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(15, 42, -8, 56, 23, 91, 37);

    List<String> strs = Arrays.asList("","","Hello","World","");

    OptionalDouble avg= nums.stream().mapToInt( n -> n).average();

    System.out.println(avg.getAsDouble());

    System.out.println(nums.stream().allMatch(n -> n>0));

    System.out.println(nums.stream().anyMatch(n -> n%3==0));

    //Find first non empty string
    System.out.println(strs.stream().filter(s -> !s.isEmpty()).findFirst().get());

    }
    
}
